package com.generation.callejonDiagonal.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mes")
    private int id;

    @Column(name="usu_mes")
    private String usuMes;

    @Column(name="fec_mes")
    private Timestamp fecha;

    @ManyToOne
    @JoinColumn(name="id_usu")
    private Usuario usuario;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuMes() {
        return usuMes;
    }

    public void setUsuMes(String usuMes) {
        this.usuMes = usuMes;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
