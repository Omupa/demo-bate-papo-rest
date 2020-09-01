package com.batetepapo.dev.controller;

import com.batetepapo.dev.entity.Aplicacao;
import com.batetepapo.dev.services.AplicacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
@CrossOrigin(origins = "http://localhost:4200")
public class AplicacaoController {

    private final AplicacaoService aplicacaoService;

    public AplicacaoController(AplicacaoService aplicacaoService) {
        this.aplicacaoService = aplicacaoService;
    }

    @GetMapping
    public ResponseEntity<Aplicacao> buscar() {
        return ResponseEntity.ok(aplicacaoService.buscar());
    }

    @PostMapping
    public ResponseEntity<Aplicacao> salvar(@RequestBody Aplicacao aplicacao) {
        return ResponseEntity.ok(aplicacaoService.salvar(aplicacao));
    }
}
