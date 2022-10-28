package com.example.Springreserva.Dao.reserva;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Entity.Reserva;
import com.example.Springreserva.Repository.RepositoryReserva;

@Component
public class ReservaDaoImp implements IReservaDao{

    @Autowired
    private RepositoryReserva reserv;
    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>) reserv.findAll();
    }

    @Override
    public void save(Reserva reserva) {
        reserv.save(reserva);
        
    }

    @Override
    public Optional<Reserva> findOne(Integer id) {
        return reserv.findById(id);
    }

    @Override
    public void delete(Integer id) {
        reserv.deleteById(id);
        
    }
    
}
