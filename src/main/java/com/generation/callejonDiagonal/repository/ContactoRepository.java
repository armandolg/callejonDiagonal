package com.generation.callejonDiagonal.repository;

import org.springframework.data.repository.CrudRepository;

public interface Contacto extends CrudRepository<Contacto, Integer> {

    Contacto findByid(Integer id);

}
