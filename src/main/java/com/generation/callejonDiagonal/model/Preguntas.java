package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="preguntas_seguridad")
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pre")
    private int id;

    @Column(name="tex_pre")
    private String pregunta;

    @OneToOne
    @JoinColumn(name="id_pre", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

//    public List<Usuario> getUsuarioList() {
//        return usuarioList;
//    }
//
//    public void setUsuarioList(List<Usuario> usuarioList) {
//        this.usuarioList = usuarioList;
//    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
