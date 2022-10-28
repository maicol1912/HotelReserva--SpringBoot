package com.example.Springreserva.Dao.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Entity.Usuario;
import com.example.Springreserva.Repository.RepositoryUsuario;

@Component
public class UsuarioDaoImp implements IUsuarioDao{

    @Autowired
    private RepositoryUsuario user;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) user.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        user.save(usuario);
        
    }

    @Override
    public Optional<Usuario> findOne(Integer id) {
        return user.findById(id);
    }

    @Override
    public void delete(Integer id) {
        user.deleteById(id);
        
    }
    
}
