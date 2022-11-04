package com.example.Springreserva.Dao.habitacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Entity.Habitacion;
import com.example.Springreserva.Repository.RepositoryHabitacion;

@Component
public class HabitacionDaoImp implements IHabitacionDao{

    @Autowired
    private RepositoryHabitacion habitac;
    @Override
    public List<Habitacion> findAll() {
        return (List<Habitacion>) habitac.findAll();
    }

    @Override
    public void save(Habitacion habitacion) {
        habitac.save(habitacion);
        
    }

    @Override
    public Optional<Habitacion> findOne(Integer id) {
        return habitac.findById(id);
    }

    @Override
    public void delete(Integer id) {
        habitac.deleteById(id);
        
    }
    
}
