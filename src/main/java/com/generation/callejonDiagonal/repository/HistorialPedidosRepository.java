package com.generation.callejonDiagonal.repository;
import com.generation.callejonDiagonal.model.HistorialPedidos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialPedidosRepository extends CrudRepository<HistorialPedidos, Integer>{

    List<HistorialPedidos> findByusuario(int usuario);
}