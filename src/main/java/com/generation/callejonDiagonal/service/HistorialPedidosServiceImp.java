package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.HistorialPedidos;
import com.generation.callejonDiagonal.repository.HistorialPedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialPedidosServiceImp implements  HistorialPedidosService{

    private HistorialPedidosRepository historialPedidosRepository;

    public HistorialPedidosServiceImp(HistorialPedidosRepository historialPedidosRepository) {
        this.historialPedidosRepository = historialPedidosRepository;
    }

    @Override
    public List<HistorialPedidos> traerLista(int usuario) {
        return historialPedidosRepository.findByusuario(usuario);
    }
}
