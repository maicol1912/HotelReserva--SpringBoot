package com.example.Springreserva.Service.habitacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Dao.habitacion.IHabitacionDao;
import com.example.Springreserva.Entity.Habitacion;

@Component
public class HabitacionServiceImp implements IHabitacionService{

    @Autowired
    private IHabitacionDao habitS;
    @Override
    public List<Habitacion> findAll() {
        return (List<Habitacion>)habitS.findAll();
    }

    @Override
    public void save(Habitacion habitacion) {
        habitS.save(habitacion);
        
    }

    @Override
    public Optional<Habitacion> findOne(Integer id) {
        return habitS.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        habitS.delete(id);
        
    }
    
}
