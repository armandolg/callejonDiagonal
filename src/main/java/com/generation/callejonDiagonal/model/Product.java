package com.generation.callejonDiagonal.model;
import javax.persistence.*;

@Entity
@Table(name="productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pro")
    private int id;

    @Column(name="nom_pro")
    private String nombre;

    @Column(name="des_pro")
    private int descuento;

    @Column(name="cos_pro")
    private float costo;

    @Column(name="img_pro")
    private String rutaImagen;

    @Column(name="sto_pro")
    private int stock;

    @Column(name="text_pro")
    private String descripcion;

    /*Falta agregar las relaciones con las otras tablas*/
    /*Lo int*/

    @Column(name="id_est")
    private int estado;

    @Column(name="id_cat")
    private int categoria;

//    @ManyToOne(optional = false)
//    private ProductState productState;

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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
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


    /*Estos ultimos son solo para probar si no funciona los borrare*/
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
