package com.generation.callejonDiagonal.controller;
import com.generation.callejonDiagonal.model.HistorialPedidos;
import com.generation.callejonDiagonal.service.HistorialPedidosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/historial")
public class HistorialPedidosController {

    private HistorialPedidosService historialPedidosService;

    public HistorialPedidosController(HistorialPedidosService historialPedidosService) {
        this.historialPedidosService = historialPedidosService;
    }

    @GetMapping("/{usuario}")
    public List<HistorialPedidos> traerHistorial(@PathVariable int usuario){
        return historialPedidosService.traerLista(usuario);
    }




}
