package com.generation.callejonDiagonal.model;

import javax.persistence.*;

@Entity
@Table(name="usuarios_eventos")
public class UsuarioEventos {

    @Id
    @Column(name="int_usu")
    private Integer intUsu;

    @ManyToOne
    @JoinColumn(name="id_usu")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_eve")
    private Eventos eventos;

    //Metodos get y set

    public Integer getIntUsu() {
        return intUsu;
    }

    public void setIntUsu(Integer intUsu) {
        this.intUsu = intUsu;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }
}
