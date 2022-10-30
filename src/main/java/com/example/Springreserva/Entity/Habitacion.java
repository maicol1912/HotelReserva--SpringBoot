package com.example.Springreserva.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @NotBlank
    @Column(name = "detalle_habitacion")
    private String detalleHabitacion;

    @NotBlank
    @Column(name = "estado_habitacion")
    private String estadoHabitacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getDetalleHabitacion() {
        return detalleHabitacion;
    }

    public void setDetalleHabitacion(String detalleHabitacion) {
        this.detalleHabitacion = detalleHabitacion;
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
}
