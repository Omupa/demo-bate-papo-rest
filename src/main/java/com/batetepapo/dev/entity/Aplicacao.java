package com.batetepapo.dev.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Aplicacao {

    private String nome;
    private String descricao;

    public Aplicacao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
