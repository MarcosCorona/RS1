package com.bosonit.marcos.RS1.Controller;

import com.bosonit.marcos.RS1.Class.Persona.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaControllerDelete {
    @Autowired
    PersonaService personaService;
    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable("id") int id) {
        if (personaService.eliminarPersona(id))
        {
            return "Persona eliminada.";
        } else
        {
            return "Error al eliminar la persona";
        }
    }
}
