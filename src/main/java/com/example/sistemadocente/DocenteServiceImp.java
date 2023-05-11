package com.example.sistemadocente;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServiceImp implements DocenteService{
    
    @Autowired
    private DocenteRepositorio repositorio;

    @Override
    public List<Docente> listar() {
        return repositorio.findAll();
    }

    @Override
    public Docente listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Docente add(Docente d) {
        return repositorio.saveAndFlush(d);
    }

    @Override
    public Docente edit(Docente d) {
        return repositorio.saveAndFlush(d);
    }

    @Override
    public Docente delete(int id) {
        Docente d=repositorio.findById(id);
        if(d!=null){
            repositorio.delete(d);
        }
       return d;
    }
    
}   
