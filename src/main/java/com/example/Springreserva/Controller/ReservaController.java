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

import com.example.Springreserva.Entity.Reserva;
import com.example.Springreserva.Service.factura.IFacturaService;
import com.example.Springreserva.Service.reserva.IReservaService;
import com.example.Springreserva.Service.usuario.IUsuarioService;

@Controller
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private IReservaService reservS;

    @Autowired
    private IUsuarioService userS;

    @Autowired
    private IFacturaService factuS;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("reservas", reservS.findAll());
        model.addAttribute("titulo", "Reservas");
        return "pages/reserva/listarReserva";
    }

    @GetMapping("/form")
    public String formularioRender(Model model) {
        model.addAttribute("facturas", factuS.findAll());
        model.addAttribute("usuarios", userS.findAll());
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("titulo", "Crear Reserva");
        return "pages/reserva/registrarReserva";
    }

    @PostMapping("/form")
    public String validarReserva(@Validated Reserva reserva, Model model) {
        reservS.save(reserva);
        return "redirect:/reserva/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Integer id) {
        if (id > 0) {
            reservS.delete(id);
        }
        return "redirect:/reserva/listar";
    }

    @GetMapping("/actualizar/{id}")
    public String actualizarReserva(@PathVariable Integer id, Model model) {
        Optional<Reserva> reserva = reservS.findOne(id);
        model.addAttribute("reserva", reserva);
        model.addAttribute("titulo", "Actualizar Reserva");
        model.addAttribute("facturas", factuS.findAll());
        model.addAttribute("usuarios", userS.findAll());
        return "pages/reserva/registrarReserva";
    }
}
