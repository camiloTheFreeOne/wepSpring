package com.crud.crud_practica;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactos extends CrudRepository<Contacto, Integer> {

}
