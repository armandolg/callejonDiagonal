package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.Usuario;
import com.generation.callejonDiagonal.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario getUsuario(Integer id) {
        return usuarioRepository.findByid(id);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Usuario> findByAll() {
        return usuarioRepository.findAll();
    }
}
