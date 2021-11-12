package com.generation.callejonDiagonal.controller;

import com.generation.callejonDiagonal.model.Usuario;
import com.generation.callejonDiagonal.service.UsuarioService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")

public class UsuarioController {
    private final UsuarioService usuarioService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    public UsuarioController (UsuarioService usuarioService, BCryptPasswordEncoder bCryptPasswordEncoder){
//        this.usuarioService=usuarioService;
//        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
//    }

    public UsuarioController (UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

//    @PostMapping
//    public Usuario saveUsuario(@RequestBody Usuario usuario) {
//        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
//        return usuarioService.saveUsuario(usuario);
//    }

    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Integer id) {
        return usuarioService.getUsuario(id);
    }

}
