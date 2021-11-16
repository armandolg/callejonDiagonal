package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.Contacto;
import com.generation.callejonDiagonal.repository.ContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImp implements  ContactoService{

    //instancia dependencia
    private ContactoRepository contactoRepository;

    public ContactoServiceImp(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }


    @Override
    public Contacto getcontacto(Integer id) {
        return contactoRepository.findByid(id);
    }
}
