package com.minijira.core.domain.service;

import com.minijira.core.domain.model.Atividade;
import com.minijira.core.domain.repository.AtividadeRepository;
import org.springframework.stereotype.Service;

@Service
public class AtividadeService {

    private final AtividadeRepository atividadeRepository;

    public AtividadeService(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    public Atividade criarAtividade(String descricao) {
        Atividade atividade = new Atividade();
        atividade.setDescricao(descricao);
        return atividadeRepository.salvar(atividade);
    }
}
