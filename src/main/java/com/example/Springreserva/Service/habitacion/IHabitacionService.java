package com.example.Springreserva.Service.habitacion;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Habitacion;

public interface IHabitacionService {
    public List<Habitacion> findAll();

    public void save(Habitacion habitacion);

    public Optional<Habitacion> findOne(Integer id);

    public void delete(Integer id);
}
