package com.example.Springreserva.Controller;

import java.util.Optional;

import com.example.Springreserva.Service.encript.encriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Springreserva.Entity.Usuario;
import com.example.Springreserva.Service.usuario.IUsuarioService;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService user;
    @Autowired
    private encriptService encript;

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("usuarios", user.findAll());
        model.addAttribute("titulo", "Usuarios");
        return "pages/usuario/listarUsuario";
    }

    @GetMapping("/form")
    public String formularioRender(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("titulo", "Crear Usuario");
        return "pages/usuario/registrarUsuario";
    }

    @PostMapping("/form")
    public String validarUsuario(@Validated Usuario usuario, Model model) {

        String passwordEncriptado = encript.encryptPassword(usuario.getPasswordUsuario());
        usuario.setPasswordUsuario(passwordEncriptado);
        user.save(usuario);
        return "redirect:/usuario/listar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Integer id) {
        if(id>0){
            user.delete(id);
        }
        return "redirect:/usuario/listar";
    }

    @GetMapping("/actualizar/{id}")
    public String actualizarUsuario(@PathVariable Integer id,Model model) {
        Optional<Usuario> usuario = user.findOne(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Actualizar Usuario");
        return "pages/usuario/registrarUsuario";
    }
}
