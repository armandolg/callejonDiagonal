package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.HistorialDetalle;
import com.generation.callejonDiagonal.repository.HistorialDetalleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistorialDetalleServiceImp implements HistorialDetalleService {

    //traer dependencias
    private HistorialDetalleRepository historialDetalleRepository;

    public HistorialDetalleServiceImp(HistorialDetalleRepository historialDetalleRepository) {
        this.historialDetalleRepository = historialDetalleRepository;
    }


    @Override
    public Optional<HistorialDetalle> getHistorial(int cant) {
        return historialDetalleRepository.findById(cant);
    }
}
