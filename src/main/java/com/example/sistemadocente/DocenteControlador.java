package com.example.sistemadocente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/docentes"})
public class DocenteControlador {

    @Autowired
    DocenteService service;

    @GetMapping
    public List<Docente>listar(){
        return service.listar();
    }

    @PostMapping
    public Docente postDocente(@RequestBody Docente docente){
        return service.add(docente);
    }

    @GetMapping(path = {"/{id}"})
    public Docente listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }

    @PutMapping(value="path/{id}")
    public Docente editar(@RequestBody Docente d, @PathVariable("id") int id) {
        d.setId(id);
        return service.edit(d);
    }

    @DeleteMapping(path = {"/{id}"})
    public Docente delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
