package com.example.Springreserva.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;


    @Column(name = "nombre_usuario")
    @NotBlank(message = "los campos son obligatorios")
    private String nombreUsuario;

    @NotNull(message = "los campos son obligatorios")
    @Column(name = "telefono_usuario")
    private Integer telefonoUsuario;

    @NotBlank(message = "los campos son obligatorios")
    @Column(name = "correo_usuario")
    private String correoUsuario ;

    @NotBlank(message = "los campos son obligatorios")
    @Column(name="password_usuario")
    private String passwordUsuario;

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(Integer telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    

    
}
