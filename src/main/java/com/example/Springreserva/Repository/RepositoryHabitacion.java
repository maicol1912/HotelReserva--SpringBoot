package com.example.Springreserva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springreserva.Entity.Habitacion;

@Repository
public interface RepositoryHabitacion extends JpaRepository<Habitacion, Integer> {
    
}
