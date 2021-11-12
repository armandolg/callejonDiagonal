package com.generation.callejonDiagonal.service;
import com.generation.callejonDiagonal.model.Usuario;
import java.util.List;

public interface UsuarioService {
    Usuario getUsuario(Integer id);

    Usuario saveUsuario(Usuario usuario);

    void delete(Integer id);

    List<Usuario> findByAll();


}
