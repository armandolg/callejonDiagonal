package com.generation.callejonDiagonal.repository;
import com.generation.callejonDiagonal.model.HistorialPedidos;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface HistorialPedidosRepository extends CrudRepository<HistorialPedidos, Integer>{

    List<HistorialPedidos> findByusuario(int usuario);
}