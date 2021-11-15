package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.EstadoProductos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoProductosRepository extends CrudRepository<EstadoProductos, Integer> {

    EstadoProductos findByid(Integer id);

    List<EstadoProductos> findBynombre(String nombre);
}
