package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.CategoriaProducto;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CategoriaProductoRepository extends CrudRepository<CategoriaProducto, Integer> {

    CategoriaProducto findByid(Integer id);

    List<CategoriaProducto> findBycategoria(String categoria);
}
