package com.example.Springreserva.Service.encript;

public interface encriptService {
    String encryptPassword(String password);
    Boolean verifyPassword(String originalPassword, String hashPassword);
}
