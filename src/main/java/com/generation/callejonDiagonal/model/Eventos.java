package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

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

    @OneToMany(mappedBy = "eventos")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<UsuarioEventos> usuarioEventosList;

    @ManyToOne
    private Editores editores;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<UsuarioEventos> getUsuarioEventosList() {
        return usuarioEventosList;
    }

    public void setUsuarioEventosList(List<UsuarioEventos> usuarioEventosList) {
        this.usuarioEventosList = usuarioEventosList;
    }
}
