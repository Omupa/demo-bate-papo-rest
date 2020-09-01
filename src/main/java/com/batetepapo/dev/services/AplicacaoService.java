package com.batetepapo.dev.services;

import com.batetepapo.dev.entity.Aplicacao;
import com.batetepapo.dev.repository.AplicacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class AplicacaoService {

    private final AplicacaoRepository aplicacaoRepository;

    public AplicacaoService(AplicacaoRepository aplicacaoRepository) {
        this.aplicacaoRepository = aplicacaoRepository;
    }

    public Aplicacao buscar() {
        return AplicacaoRepository.aplicacao;
    }

    public Aplicacao salvar(Aplicacao aplicacao) {
        AplicacaoRepository.aplicacao.setNome(aplicacao.getNome());
        AplicacaoRepository.aplicacao.setDescricao(aplicacao.getDescricao());

        return AplicacaoRepository.aplicacao;
    }
}
