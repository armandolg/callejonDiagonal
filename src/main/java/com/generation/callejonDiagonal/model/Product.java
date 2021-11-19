package com.generation.callejonDiagonal.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pro")
    private int id;

    @Column(name = "nom_pro")
    private String nombre;

    @Column(name = "des_pro")
    private int descuento;

    @Column(name = "cos_pro")
    private float precio;

    @Column(name = "img_pro")
    private String img;

    @Column(name = "sto_pro")
    private int stock;

    @ManyToOne
    @JoinColumn(name="id_est")
    private EstadoProductos estadoProductos;

    @ManyToOne
    @JoinColumn(name="id_cat")
    private CategoriaProducto categoriaProducto;

//    @OneToOne(mappedBy = "product")
//    private EstadoProductos estadoProductos;
//
//    @OneToOne(mappedBy = "product")
//    private CategoriaProducto categoriaProducto;

    @Column(name = "text_pro")
    private String descripcion;

    @OneToMany(mappedBy = "products")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<HistorialDetalle> historialDetalleList;




    //Metodos get y set Debo Agregarlos

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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoProductos getEstadoProductos() {
        return estadoProductos;
    }

    public void setEstadoProductos(EstadoProductos estadoProductos) {
        this.estadoProductos = estadoProductos;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }


}