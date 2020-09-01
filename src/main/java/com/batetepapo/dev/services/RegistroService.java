package com.batetepapo.dev.services;

import com.batetepapo.dev.dto.RegistroDTO;
import com.batetepapo.dev.entity.Registro;
import com.batetepapo.dev.repository.RegistroRepository;
import org.apache.juli.logging.LogFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RegistroService {

    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    public RegistroDTO buscar(Long id) {
        if (id == null)
            return new RegistroDTO();

        Registro registro = this.registroRepository.findById(id).orElse(null);
        if (registro == null)
            return new RegistroDTO();

        return RegistroDTO.parseEntidadeParaDto(registro);
    }

    public List<RegistroDTO> listarTodos() {
        List<Registro> registros = Collections.emptyList();
        if (registros.isEmpty())
            return Collections.emptyList();

        List<RegistroDTO> registroDtos = new ArrayList<>();
        for (Registro registro : registros) { // Tem forma mais adequada de fazer isso. Java Stream e MapStruct
            RegistroDTO dto = RegistroDTO.parseEntidadeParaDto(registro);
            registroDtos.add(dto);
        }
        return registroDtos;
    }

    public RegistroDTO salvar(RegistroDTO registroDto) {
        if (registroDto == null || registroDto.getTitulo() == null || registroDto.getDescricao() == null)
            return new RegistroDTO();

        Registro registro = new Registro(registroDto.getTitulo(), registroDto.getDescricao());
        registroRepository.save(registro);

        return RegistroDTO.parseEntidadeParaDto(registro);
    }

    public RegistroDTO atualizar(RegistroDTO registroDto) {
        if (Objects.isNull(registroDto) || Objects.isNull(registroDto.getId()))
            return new RegistroDTO();

        Registro registroParaAtualizar;
        Optional<Registro> processo = registroRepository.findById(registroDto.getId());

        if (processo.isPresent()) {
            // Tem forma mais adequada de fazer isso. Ex: MapStruct https://mapstruct.org/
            registroParaAtualizar = processo.get();
            registroParaAtualizar.setDescricao(registroDto.getDescricao());
            registroParaAtualizar.setInclusao(registroDto.getInclusao());

            registroRepository.save(registroParaAtualizar);
        }
        return registroDto;
    }

    public void deletar(Long id) {
        try {
            registroRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            LogFactory.getFactory().getInstance(this.getClass()).info("Registro não encontrado para deletar."); // Tem forma mais adequada de fazer isso.
        }
    }
}
