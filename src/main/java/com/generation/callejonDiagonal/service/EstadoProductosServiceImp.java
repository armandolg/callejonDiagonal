package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.EstadoProductos;
import com.generation.callejonDiagonal.repository.EstadoProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoProductosServiceImp implements EstadoProductosService {

    //Instancia de la dependencia
    private final EstadoProductosRepository estadoProductosRepository;

    //Inyeccion de la dependencia
    public EstadoProductosServiceImp(EstadoProductosRepository estadoProductosRepository){
        this.estadoProductosRepository=estadoProductosRepository;
    }


    @Override
    public EstadoProductos getEstado(Integer id) {
        return estadoProductosRepository.findByid(id);
    }
}
