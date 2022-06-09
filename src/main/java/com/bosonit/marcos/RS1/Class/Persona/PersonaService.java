package com.bosonit.marcos.RS1.Class.Persona;

import java.util.ArrayList;

public interface PersonaService {
    void addPerson(Persona persona);
    Persona buscarPersona(int id);
    ArrayList<Persona> buscarPersonaxNombre(String nombre);
    boolean eliminarPersona(int id);

}