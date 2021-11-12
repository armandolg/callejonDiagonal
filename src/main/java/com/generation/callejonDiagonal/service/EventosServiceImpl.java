package com.generation.callejonDiagonal.service;
import com.generation.callejonDiagonal.model.Eventos;
import com.generation.callejonDiagonal.repository.EventosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventosServiceImpl implements EventosService{

    private final EventosRepository eventosRepository;

    public EventosServiceImpl(EventosRepository eventosRepository) {
        this.eventosRepository = eventosRepository;
    }

    @Override
    public List<Eventos> todosEventos() {
        return eventosRepository.findAll();
    }

    @Override
    public Eventos ultimo(){
        ArrayList<Eventos> elementos = (ArrayList<Eventos>) eventosRepository.findAll();
        return elementos.get(0);
    }
    @Override
    public Eventos penultimo(){
        ArrayList<Eventos> elementos = (ArrayList<Eventos>) eventosRepository.findAll();
        return elementos.get(1);
    }
    @Override
    public Eventos antepenultimo(){
        ArrayList<Eventos> elementos = (ArrayList<Eventos>) eventosRepository.findAll();
        return elementos.get(2);
    }
}
