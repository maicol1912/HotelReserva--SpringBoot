package com.example.Springreserva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springreserva.Entity.Factura;

@Repository
public interface RepositoryFactura extends JpaRepository<Factura, Integer> {
    
}
