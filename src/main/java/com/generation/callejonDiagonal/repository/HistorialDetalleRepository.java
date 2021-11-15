package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.HistorialDetalle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialDetalleRepository extends CrudRepository <HistorialDetalle, Integer> {

    HistorialDetalle findBycantidad(Integer cant);
}
