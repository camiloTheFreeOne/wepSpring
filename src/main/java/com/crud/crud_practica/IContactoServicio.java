package com.crud.crud_practica;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface IContactoServicio {
    public java.util.List<Contacto>listar();
    public Optional<Contacto>listarId(int id);
    public int Save(Contacto contacto);
    public void Delete(int id);
}
