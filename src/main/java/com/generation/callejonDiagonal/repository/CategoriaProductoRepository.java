package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.CategoriaProducto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaProductoRepository extends CrudRepository<CategoriaProducto, Integer> {

    CategoriaProducto findByid(Integer id);

    List<CategoriaProducto> findBycategoria(String categoria);
}
