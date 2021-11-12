package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.Eventos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventosService{

    List<Eventos> todosEventos();
    Eventos ultimo();
    Eventos penultimo();
    Eventos antepenultimo();


}
