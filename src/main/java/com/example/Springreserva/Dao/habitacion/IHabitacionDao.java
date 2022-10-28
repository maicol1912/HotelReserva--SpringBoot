package com.example.Springreserva.Dao.habitacion;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Habitacion;

public interface IHabitacionDao {
    public List<Habitacion> findAll();

    public void save(Habitacion habitacion);

    public Optional<Habitacion> findOne(Integer id);

    public void delete(Integer id);
}
