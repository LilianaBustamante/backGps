package com.example.sistemadocente;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepositorio extends JpaRepository<Docente, Integer>{
    List<Docente>findAll();
    Docente findById(int id);
    Docente save(Docente d);
    void delete(Docente d);
}
