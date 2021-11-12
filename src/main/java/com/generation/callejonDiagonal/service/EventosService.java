package com.generation.callejonDiagonal.Service;

import com.generation.callejonDiagonal.Model.Eventos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventosService{

    List<Eventos> todosEventos();
    Eventos ultimo();
    Eventos penultimo();
    Eventos antepenultimo();


}
