package com.generation.callejonDiagonal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id_usu")
        private Integer id;

        @Column(name="nom_usu")
        private String nombre;

        @Column(name="fam_usu")
        private String familia;

        @Column(name="ema_usu")
        private String email;

        @Column(name="pas_usu")
        private String password;

        @Column(name="id_pre")
        private Integer pregunta;

        @OneToMany(mappedBy = "usuario")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private List<HistorialPedidos> historialPedidos;

        @OneToMany(mappedBy = "usuario")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private List<Contacto> contactoList;

        @OneToMany(mappedBy = "usuario")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private List<UsuarioEventos> usuarioEventosList;

        @ManyToOne
        private CasasHogwarts casasHogwarts;

        //Métodos get y set

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

        public String getFamilia() {
                return familia;
        }

        public void setFamilia(String familia) {
                this.familia = familia;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Integer getPregunta() {
                return pregunta;
        }

        public void setPregunta(Integer pregunta) {
                this.pregunta = pregunta;
        }

        public List<HistorialPedidos> getHistorialPedidos() {
                return historialPedidos;
        }

        public void setHistorialPedidos(List<HistorialPedidos> historialPedidos) {
                this.historialPedidos = historialPedidos;
        }

        public List<Contacto> getContactoList() {
                return contactoList;
        }

        public void setContactoList(List<Contacto> contactoList) {
                this.contactoList = contactoList;
        }

        public List<UsuarioEventos> getUsuarioEventosList() {
                return usuarioEventosList;
        }

        public void setUsuarioEventosList(List<UsuarioEventos> usuarioEventosList) {
                this.usuarioEventosList = usuarioEventosList;
        }

        public CasasHogwarts getCasasHogwarts() {
                return casasHogwarts;
        }

        public void setCasasHogwarts(CasasHogwarts casasHogwarts) {
                this.casasHogwarts = casasHogwarts;
        }
}
