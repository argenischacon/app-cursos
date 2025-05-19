package com.example.ejercicios_practicos_curso.service;

import com.example.ejercicios_practicos_curso.model.Tema;

import java.util.List;

public interface TemaService {
    //create
    Tema saveTheme(Tema tema);
    //read
    List<Tema> getThemes();
    //update
    void updateTheme(Tema tema);
    //delete
    void deleteTheme(Long id_tema);
    //Buscar temas que pertenezcan a un curso
    List<Tema> getThemesByCourse(Long id_curso);
}
