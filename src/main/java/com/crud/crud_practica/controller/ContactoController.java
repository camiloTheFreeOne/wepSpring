package com.crud.crud_practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class ContactoController{

    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/nuevo")
    public String nuevo(Model model){
       
        return "nuevo";
    }
}