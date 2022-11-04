package com.example.Springreserva.Dao.factura;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Factura;

public interface IFacturaDao {
    public List<Factura> findAll();

    public void save(Factura factura);

    public Optional<Factura> findOne(Integer id);

    public void delete(Integer id);
}
