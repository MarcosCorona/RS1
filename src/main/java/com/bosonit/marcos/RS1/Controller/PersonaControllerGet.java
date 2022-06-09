package com.bosonit.marcos.RS1.Controller;
import com.bosonit.marcos.RS1.Class.Persona.Persona;
import com.bosonit.marcos.RS1.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/persona")
public class PersonaControllerGet {
    @Autowired
    PersonaService personaService;

    @GetMapping("/nombre/{nombre}")
    public ArrayList<Persona> buscarPersonaNombre(@PathVariable("nombre") String nombre) {
        return personaService.buscarPersonaxNombre(nombre);
    }

    @GetMapping("/id/{id}")
    public Persona buscarPersonaId(@PathVariable("id") int id) {
        return personaService.buscarPersona(id);
    }

}
