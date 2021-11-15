package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.EstadoProductos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstadoProductosRepository extends CrudRepository<EstadoProductos, Integer> {

    EstadoProductos findByid(Integer id);

    List<EstadoProductos> findBynombre(String nombre);
}
