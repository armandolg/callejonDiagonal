package com.generation.callejonDiagonal.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="historial_pedidos")
public class HistorialPedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ped")
    private int id;

    @Column(name="id_usu")
    private int usuario;

    @Column(name="id_lec")
    private int lechuza;

//    @ManyToOne
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Usuario usuario;

//    @ManyToOne
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Lechuza lechuza;

    @Column(name="lug_ent")
    private String lugarEntrega;

    @Column(name="sal_ent")
    private Timestamp salida;

    @Column(name="dia_ent")
    private Timestamp diaEntrega;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getLechuza() {
        return lechuza;
    }

    public void setLechuza(int lechuza) {
        this.lechuza = lechuza;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public Timestamp getSalida() {
        return salida;
    }

    public void setSalida(Timestamp salida) {
        this.salida = salida;
    }

    public Timestamp getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(Timestamp diaEntrega) {
        this.diaEntrega = diaEntrega;
    }
}
