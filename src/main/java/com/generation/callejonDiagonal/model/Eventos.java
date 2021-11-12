package com.generation.callejonDiagonal.Model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "eventos")
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_eve")
    private int id;

    @Column(nullable = false, name = "id_edi")
    private int editor;

    @Column(nullable = false, name = "ban_eve", columnDefinition = "text")
    private String banner;

    @Column(nullable = false, name = "tit_eve", length = 255)
    private String titulo;

    @Column(nullable = false, name = "tex_eve", columnDefinition = "text")
    private String texto;

    @Column(nullable = false, name = "fec_eve")
    @Temporal(TemporalType.DATE)
    private Calendar fecha;

    public int getEventoId() {
        return id;
    }

    public int getEditor() {
        return editor;
    }

    public void setEditor(int editor) {
        this.editor = editor;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
}
