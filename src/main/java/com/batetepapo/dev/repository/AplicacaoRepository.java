package com.batetepapo.dev.repository;

import com.batetepapo.dev.entity.Aplicacao;
import org.springframework.stereotype.Repository;

@Repository
public class AplicacaoRepository {
    public static final Aplicacao aplicacao = new Aplicacao();
}
