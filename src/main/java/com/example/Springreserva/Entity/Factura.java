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
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer idFactura;

    @NotBlank
    @Column(name = "servicio_factura")
    private String servicioFactura;

    @NotNull
    @Column(name = "costo_factura")
    private Integer costoFactura;

    @NotBlank
    @Column(name = "detalle_factura")
    private String detalleFactura;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getServicioFactura() {
        return servicioFactura;
    }

    public void setServicioFactura(String servicioFactura) {
        this.servicioFactura = servicioFactura;
    }

    public Integer getCostoFactura() {
        return costoFactura;
    }

    public void setCostoFactura(Integer costoFactura) {
        this.costoFactura = costoFactura;
    }

    public String getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(String detalleFactura) {
        this.detalleFactura = detalleFactura;
    }


    
}
