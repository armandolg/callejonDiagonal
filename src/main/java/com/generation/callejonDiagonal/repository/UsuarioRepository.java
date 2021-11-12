package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface UsuarioRepository
    extends CrudRepository <Usuario, Integer> {

    //El metodo busca por id
    Usuario findByid(int id);

    //El método busca por nombre
    Usuario findBynombre(String nombre);

    //El método trae una lista de usuarios
    List<Usuario> findAll();
}