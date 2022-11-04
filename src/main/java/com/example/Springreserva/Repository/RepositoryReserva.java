package com.example.Springreserva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springreserva.Entity.Reserva;

@Repository
public interface RepositoryReserva extends JpaRepository<Reserva,Integer> {
    
}
