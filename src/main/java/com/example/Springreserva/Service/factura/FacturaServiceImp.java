package com.example.Springreserva.Service.factura;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Dao.factura.IFacturaDao;
import com.example.Springreserva.Entity.Factura;

@Component
public class FacturaServiceImp implements IFacturaService{

    @Autowired
    private IFacturaDao factS;
    @Override
    public List<Factura> findAll() {
        return (List<Factura>)factS.findAll();
    }

    @Override
    public void save(Factura factura) {
        factS.save(factura);
        
    }

    @Override
    public Optional<Factura> findOne(Integer id) {
        return factS.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        factS.delete(id);
        
    }
    
}
