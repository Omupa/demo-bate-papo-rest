package com.batetepapo.dev.controller;

import com.batetepapo.dev.dto.RegistroDTO;
import com.batetepapo.dev.services.RegistroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("registros")
@CrossOrigin(origins = "http://localhost:4200")
public class RegistroController {

    private final RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<RegistroDTO> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(registroService.buscar(id));
    }

    @GetMapping
    public ResponseEntity<List<RegistroDTO>> listarTodos() {
        return ResponseEntity.ok(registroService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<RegistroDTO> salvar(@RequestBody RegistroDTO registroDto) {
        return ResponseEntity.ok(registroService.salvar(registroDto));
    }

    @PutMapping
    public ResponseEntity<RegistroDTO> atualizar(@RequestBody RegistroDTO registroDto) {
        return ResponseEntity.ok(registroService.atualizar(registroDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        registroService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
