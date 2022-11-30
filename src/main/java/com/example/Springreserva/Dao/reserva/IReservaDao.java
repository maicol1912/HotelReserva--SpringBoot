package com.example.Springreserva.Dao.reserva;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Reserva;

public interface IReservaDao {
    public List<Reserva> findAll();

    public void save(Reserva reserva);

    public Optional<Reserva> findOne(Integer id);

    public void delete(Integer id);
}
