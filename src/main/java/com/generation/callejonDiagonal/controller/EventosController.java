package com.generation.callejonDiagonal.Controller;

import com.generation.callejonDiagonal.Model.Eventos;
import com.generation.callejonDiagonal.Service.EventosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventosController {

    private final EventosService eventosService;

    public EventosController(EventosService eventosService){
        this.eventosService=eventosService;
    }
    @GetMapping
    public List<Eventos> todos() {
        return eventosService.todosEventos();
    }
    @GetMapping("/latest")
    public ArrayList<Eventos> ultimos(){
        ArrayList<Eventos> requerido = new ArrayList<>();
        requerido.add(eventosService.ultimo());
        requerido.add(eventosService.penultimo());
        requerido.add(eventosService.antepenultimo());
        return requerido;
    }
}
