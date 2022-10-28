package com.example.Springreserva.Service.reserva;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Dao.reserva.IReservaDao;
import com.example.Springreserva.Entity.Reserva;

@Component
public class ReservaServiceImp implements IReservaService{

    @Autowired 
    private IReservaDao userS;
    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>)userS.findAll();
    }

    @Override
    public void save(Reserva reserva) {
        userS.save(reserva);
        
    }

    @Override
    public Optional<Reserva> findOne(Integer id) {
        return userS.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        userS.delete(id);
        
    }
    
}
