package com.example.Springreserva.Service.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Springreserva.Dao.usuario.IUsuarioDao;
import com.example.Springreserva.Entity.Usuario;

@Component
public class UsuarioServiceImp implements IUsuarioService{

    @Autowired
    private IUsuarioDao userS;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) userS.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        userS.save(usuario);
    }

    @Override
    public Optional<Usuario> findOne(Integer id) {
        return userS.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        userS.delete(id);
        
    }
    
}
