package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="estado_productos")
public class EstadoProductos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_est")
    private int id;

    @Column(name="nom_est")
    private String nombre;

    @OneToMany(mappedBy = "estadoProductos")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Product> productList;


    //Falta agregar los metodos Getter y Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
