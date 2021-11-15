package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="casas_hogwarts")
public class CasasHogwarts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cas")
    private Integer id;

    @Column(name="nom_cas")
    private String nombre;

    @OneToMany(mappedBy = "casasHogwarts")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Usuario> usuarioList;

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

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
}
