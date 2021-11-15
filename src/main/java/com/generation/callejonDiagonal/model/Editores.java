package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="editores")
public class Editores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_edi")
    private Integer id;

    @Column(name = "nom_edi")
    private String nombre;

    @Column(name="img_edi")
    private String img;

    @OneToMany(mappedBy = "editores")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Eventos> eventosList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
