package com.batetepapo.dev.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String titulo;

    @NotNull
    private String descricao;

    private LocalDateTime inclusao

    public Registro() {
    }

    public Registro(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @PrePersist
    public void prePersist() {
        this.inclusao = LocalDateTime.now();
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
