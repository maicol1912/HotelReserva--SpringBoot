package com.example.Springreserva.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {
    @GetMapping("/1")
    public String primerTemplate(){
        return "templateImplementador";
    }
}
