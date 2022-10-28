package com.example.Springreserva.Service.reserva;

import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Reserva;

public interface IReservaService {
    public List<Reserva> findAll();

    public void save(Reserva reserva);

    public Optional<Reserva> findOne(Integer id);

    public void delete(Integer id);
}
