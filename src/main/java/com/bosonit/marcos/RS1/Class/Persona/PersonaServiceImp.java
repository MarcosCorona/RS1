package com.bosonit.marcos.RS1.Class.Persona;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService {
    private List<Persona> personaList;

    PersonaServiceImp() {
        this.personaList = new ArrayList<>();
    }

    @Override
    public void addPerson(Persona persona) {
        //de esta forma hacemos que el id sea autoincremental:
        persona.setId(personaList.size());

        personaList.add(persona);
    }

    @Override
    public Persona buscarPersona(int id) {
        Persona person = null;
        for(Persona p : personaList){
            if(p.getId() == id){
                person = p;
                break;
            }
        }
        return person;
    }

    @Override
    public ArrayList<Persona> buscarPersonaxNombre(String nombre) {
        Persona person = null;
        ArrayList<Persona> personasBuscadas = new ArrayList<>();
        for(Persona p : personaList){
            if(p.getNombre().equalsIgnoreCase(nombre)){
                person = personaList.get(p.getId());
                personasBuscadas.add(person);
            }else{
                System.out.println("No se encontro la persona.");
            }
        }
        return personasBuscadas;
    }


    @Override
    public boolean eliminarPersona(int id) {
        Persona personaOk = buscarPersona(id);
        return personaList.remove(personaOk);
    }
}
