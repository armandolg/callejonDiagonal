package com.generation.callejonDiagonal.controller;

import com.generation.callejonDiagonal.model.Contacto;
import com.generation.callejonDiagonal.service.ContactoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    private ContactoService contactoService;

    @GetMapping("/{id}")
    public Contacto getcontacto(@PathVariable Integer id){
        return contactoService.getcontacto(id);
    }
}
