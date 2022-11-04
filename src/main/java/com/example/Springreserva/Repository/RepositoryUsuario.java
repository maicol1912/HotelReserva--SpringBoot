package com.example.Springreserva.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Springreserva.Entity.Usuario;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario,Integer> {
    Usuario findByNombreUsuario(String nombreUsuario);
}
