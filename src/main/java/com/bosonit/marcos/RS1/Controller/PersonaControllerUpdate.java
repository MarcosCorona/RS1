package com.bosonit.marcos.RS1.Controller;
import com.bosonit.marcos.RS1.Class.Persona.Persona;
import com.bosonit.marcos.RS1.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaControllerUpdate {
    @Autowired
    PersonaService personaService;

    @PutMapping("/update/{id}")
    public Persona actualizarPersona(@PathVariable("id") int id, @RequestBody Persona persona) {
        Persona personaEncontrada = personaService.buscarPersona(id);
        personaEncontrada.setNombre(persona.getNombre());
        personaEncontrada.setEdad(persona.getEdad());
        personaEncontrada.setPoblacion(persona.getPoblacion());
        return personaEncontrada;
    }
}
