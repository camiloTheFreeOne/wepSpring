package com.crud.crud_practica;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "Contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaRegistro;
    public Contacto() {
    }
    public Contacto (int id, String Name, LocalDate fechaNacimiento, LocalDateTime fechaRegistro){

        super();
        this.id= id;
        this.Name= Name;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Name) {
        this.Name = Name;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

  
    public int getId() {
        return id;
    }

    public String getNombre() {
        return Name;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    
}
