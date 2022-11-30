package com.example.Springreserva.Dao.factura;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Entity.Factura;
import com.example.Springreserva.Repository.RepositoryFactura;

@Component
public class FacturaDaoImp implements IFacturaDao{

    @Autowired
    private RepositoryFactura factur;
    @Override
    public List<Factura> findAll() {
        return (List<Factura>) factur.findAll();
    }

    @Override
    public void save(Factura factura) {
        factur.save(factura);
        
    }

    @Override
    public Optional<Factura> findOne(Integer id) {
        return factur.findById(id);
    }

    @Override
    public void delete(Integer id) {
        factur.deleteById(id);
        
    }
    
}
