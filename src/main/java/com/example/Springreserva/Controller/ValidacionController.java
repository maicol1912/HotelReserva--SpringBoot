package com.example.Springreserva.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validacion")
public class ValidacionController {
    @GetMapping("/sesion")
    public String validarSesion(){
        return "pages/login";
    }
}
