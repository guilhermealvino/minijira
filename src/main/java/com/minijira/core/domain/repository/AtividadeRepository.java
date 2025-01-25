package com.minijira.core.domain.repository;

import com.minijira.core.domain.model.Atividade;

import java.time.LocalDateTime;
import java.util.List;

public interface AtividadeRepository {
    Atividade salvar(Atividade atividade);
    Atividade buscarPorId(Long id);
    List<Atividade> buscarPorStatus(Atividade status);
    List<Atividade> buscarPorData(LocalDateTime dataCriacao, LocalDateTime dataAtualizacao, LocalDateTime dataFinalizacao);
}
