package com.example.Springreserva.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Springreserva.Entity.Habitacion;
import com.example.Springreserva.Service.habitacion.IHabitacionService;
import com.example.Springreserva.Service.reserva.IReservaService;

@Controller
@RequestMapping("/habitacion")
public class HabitacionController {
    @Autowired
    private IHabitacionService habitacionS;

    @Autowired
    private IReservaService reservS;


    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("habitaciones", habitacionS.findAll());
        model.addAttribute("titulo", "Habitaciones");
        return "pages/habitacion/listarHabitacion";
    }

    @GetMapping("/form")
    public String formularioRender(Model model) {
        model.addAttribute("habitacion", new Habitacion());
        model.addAttribute("reservas", reservS.findAll());
        model.addAttribute("titulo", "Crear Habitacion");
        return "pages/habitacion/registrarHabitacion";
    }

    @PostMapping("/form")
    public String validarReserva(@Validated Habitacion habitacion, Model model) {
        habitacionS.save(habitacion);
        return "redirect:/habitacion/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarHabitacion(@PathVariable Integer id) {
        if (id > 0) {
            habitacionS.delete(id);
        }
        return "redirect:/habitacion/listar";
    }

    @GetMapping("/actualizar/{id}")
    public String actualizarHabitacion(@PathVariable Integer id, Model model) {
        Optional<Habitacion> habitacion = habitacionS.findOne(id);
        model.addAttribute("habitacion", habitacion);
        model.addAttribute("titulo", "Actualizar Habitacion");
        model.addAttribute("reservas", reservS.findAll());
        return "pages/habitacion/registrarHabitacion";
    }
}
