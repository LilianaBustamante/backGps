package com.example.sistemadocente;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface DocenteService {
    List<Docente>listar();
    Docente listarId(int id);
    Docente add(Docente d);
    Docente edit(Docente d);
    Docente delete(int id);
}
