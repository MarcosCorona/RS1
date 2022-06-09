package com.bosonit.marcos.RS1.Class.Persona;

import lombok.*;


@Data
@Builder
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String poblacion;

}