package com.generation.callejonDiagonal.repository;

import com.generation.callejonDiagonal.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UsuarioRepository
    extends CrudRepository <Usuario, Integer> {

    Usuario findByid(int id);

    //El método trae una lista de usuarios
    List<Usuario> findAll();

    Usuario findByemail(String email);

    Usuario save(Usuario usuario);

}