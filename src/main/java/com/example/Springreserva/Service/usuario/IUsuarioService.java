package com.example.Springreserva.Service.usuario;


import java.util.List;
import java.util.Optional;

import com.example.Springreserva.Entity.Usuario;

public interface IUsuarioService {
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public Optional<Usuario> findOne(Integer id);

    public void delete(Integer id);

}
