package com.example.Springreserva.Service.encript;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;


@Service
public class encriptServiceImpl implements encriptService{

    @Override
    public String encryptPassword(String password) {
        return BCrypt.hashpw(password,BCrypt.gensalt());
    }


    
    
}
