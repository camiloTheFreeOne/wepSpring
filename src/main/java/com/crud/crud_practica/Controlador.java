package com.crud.crud_practica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IContactoServicio servicio;
    @GetMapping("/listar")
    public String Listar(Model model){
        List<Contacto>contactos=servicio.listar();
        model.addAttribute("contactos", contactos);
        return "index"; 
    }
}
