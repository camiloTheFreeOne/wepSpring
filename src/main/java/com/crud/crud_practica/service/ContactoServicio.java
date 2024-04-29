package com.crud.crud_practica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud_practica.Contacto;
import com.crud.crud_practica.IContactoServicio;
import com.crud.crud_practica.IContactos;

@Service
public class ContactoServicio implements IContactoServicio{

    @Autowired
    private IContactos data;
    @Override
    public void Delete(int id) {

        
    }

    @Override
    public int Save(Contacto contacto) {
        
        return 0;
    }

    @Override
    public List<Contacto> listar() {
        
        return (List<Contacto>)data.findAll();
    }

    @Override
    public Optional<Contacto> listarId(int id) {
       
        return Optional.empty();
    }
   
}
