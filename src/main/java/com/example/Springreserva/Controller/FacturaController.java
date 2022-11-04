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

import com.example.Springreserva.Entity.Factura;
import com.example.Springreserva.Service.factura.IFacturaService;

@Controller
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    private IFacturaService factuS;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("facturas", factuS.findAll());
        model.addAttribute("titulo", "Facturas");
        return "pages/factura/listarFactura";
    }

    @GetMapping("/form")
    public String formularioRender(Model model) {
        model.addAttribute("factura", new Factura());
        model.addAttribute("titulo", "Crear Usuario");
        return "pages/factura/registrarFactura";
    }

    @PostMapping("/form")
    public String validarFactura(@Validated Factura factura, Model model) {
        factuS.save(factura);
        return "redirect:/factura/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarFactura(@PathVariable Integer id) {
        if (id > 0) {
            factuS.delete(id);
        }
        return "redirect:/factura/listar";
    }

    @GetMapping("/actualizar/{id}")
    public String actualizarFactura(@PathVariable Integer id, Model model) {
        Optional<Factura> factura = factuS.findOne(id);
        model.addAttribute("factura", factura);
        model.addAttribute("titulo", "Actualizar Factura");
        return "pages/factura/registrarFactura";
    }
}
