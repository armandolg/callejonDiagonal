package com.generation.callejonDiagonal.model;

import javax.persistence.*;

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

        @Column(name="id_casa")
        private Integer casa;

        @Column(name="id_pre")
        private Integer pregunta;

        @Column(name="res_usu")
        private String respuesta;

//        public Usuario(Integer Id,String nombre, String familia, String email, String password, Integer casa, String respuesta, Integer pregunta){
//                this.id=id;
//                this.nombre=nombre;
//                this.familia=familia;
//                this.email=email;
//                this.password=password;
//                this.casa=casa;
//                this.pregunta=pregunta;
//                this.respuesta=respuesta;
//        }

        //Métodos get y set

        public Integer getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String usuario) {
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

        public Integer getCasa() {
                return casa;
        }

        public void setCasa(int casa) {
                this.casa = casa;
        }

        public Integer getPregunta() {
                return pregunta;
        }

        public void setPregunta(int pregunta) {
                this.pregunta = pregunta;
        }

        public String getRespuesta() {
                return respuesta;
        }

        public void setRespuesta(String respuesta) {
                this.respuesta = respuesta;
        }
}
