package com.generation.callejonDiagonal.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="historial_detalle")
public class HistorialDetalle {

    @Id
    @Column(name="can_pro")
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name="id_ped")
    private HistorialPedidos historialPedidos;

    @ManyToOne
    @JoinColumn(name="id_pro")
    private Product products;

    public HistorialPedidos getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(HistorialPedidos historialPedidos) {
        this.historialPedidos = historialPedidos;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
