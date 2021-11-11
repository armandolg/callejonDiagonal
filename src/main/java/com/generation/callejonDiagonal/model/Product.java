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


}
