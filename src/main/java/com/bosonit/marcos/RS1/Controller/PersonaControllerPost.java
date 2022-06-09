package com.bosonit.marcos.RS1.Controller;

import com.bosonit.marcos.RS1.Class.Persona.Persona;
import com.bosonit.marcos.RS1.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/persona")
public class PersonaControllerPost {
    @Autowired
    PersonaService personaService;

    @PostMapping
    public Persona addPersona(@RequestBody Persona persona) {
        personaService.addPerson(persona);
        return persona;
    }
}
