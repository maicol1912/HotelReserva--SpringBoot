package com.example.Springreserva.Service.usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Springreserva.Entity.Usuario;
import com.example.Springreserva.Repository.RepositoryUsuario;

@Service
public class UserDService implements UserDetailsService{

    @Autowired
    private RepositoryUsuario user;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario us = user.findByNombreUsuario(username);

        List<GrantedAuthority> roles = new ArrayList<>();

        roles.add(new SimpleGrantedAuthority("ADMIN"));
        
        UserDetails userDet = new User(us.getNombreUsuario(),us.getPasswordUsuario(),roles);
        return userDet;
    }
    
}
