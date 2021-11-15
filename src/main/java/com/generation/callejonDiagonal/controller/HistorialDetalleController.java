package com.generation.callejonDiagonal.controller;

import com.generation.callejonDiagonal.model.HistorialDetalle;
import com.generation.callejonDiagonal.service.HistorialDetalleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/detalles/")
public class HistorialDetalleController {

    private HistorialDetalleService historialDetalleService;

    @GetMapping("/{id}")
    public Optional<HistorialDetalle> getdetalles(@PathVariable  int cant){
        return historialDetalleService.getHistorial(cant);
    }


}
