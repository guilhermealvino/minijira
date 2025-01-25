package com.minijira.core.output.port;

import com.minijira.core.domain.model.Atividade;
import org.springframework.data.repository.CrudRepository;

public interface AtividadeRepository extends CrudRepository<Atividade, Long> {
}
