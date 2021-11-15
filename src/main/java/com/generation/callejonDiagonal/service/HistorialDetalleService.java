package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.HistorialDetalle;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HistorialDetalleService {

    Optional<HistorialDetalle> getHistorial(int cant);
}
