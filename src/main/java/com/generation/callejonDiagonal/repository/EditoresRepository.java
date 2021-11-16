package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.Editores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoresRepository extends CrudRepository<Editores, Integer> {
}
