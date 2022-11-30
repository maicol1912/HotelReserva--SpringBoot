package com.example.Springreserva.Configuration;

import com.example.Springreserva.Entity.Usuario;
import com.example.Springreserva.Service.encript.encriptService;
import com.example.Springreserva.Service.usuario.IUsuarioService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userConfiguration {

    @Autowired 
    private encriptService encript;

    @Autowired
    private IUsuarioService user;

    @PostConstruct
    public void initUser(){
        String password = encript.encryptPassword("123");

        Usuario admin = new Usuario(1,"maicol",300656,"maicol@gmail.com",password);
        user.save(admin);
    }
}
