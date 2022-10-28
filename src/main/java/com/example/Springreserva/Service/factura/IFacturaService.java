package com.example.Springreserva.Service.factura;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Factura;

public interface IFacturaService {
    public List<Factura> findAll();

    public void save(Factura factura);

    public Optional<Factura> findOne(Integer id);

    public void delete(Integer id);
}
