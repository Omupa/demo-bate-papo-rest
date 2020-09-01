package com.batetepapo.dev.dto;

import com.batetepapo.dev.entity.Registro;

import java.time.LocalDateTime;

public class RegistroDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime inclusao;

    public RegistroDTO() {
    }

    public RegistroDTO(Long id, String titulo, String descricao, LocalDateTime inclusao) {
        this.id = id;
        this.titulo = titulo
        this.descricao = descricao;
        this.inclusao = inclusao;
    }

    public static RegistroDTO parseEntidadeParaDto(Registro registro) {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getInclusao() {
        return inclusao;
    }

    public void setInclusao(LocalDateTime inclusao) {
        this.inclusao = inclusao;
    }
}
