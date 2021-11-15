package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {

    Contacto findByid(Integer id);

}
