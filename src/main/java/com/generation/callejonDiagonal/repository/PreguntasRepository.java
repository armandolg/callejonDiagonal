package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.Preguntas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntasRepository extends CrudRepository<Preguntas, Integer> {
}
