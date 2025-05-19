package com.example.ejercicios_practicos_curso.service;

import com.example.ejercicios_practicos_curso.model.Curso;
import com.example.ejercicios_practicos_curso.model.Tema;

import java.util.List;

public interface CursoService {
    //Create
    Curso saveCourse(Curso curso);
    //Read
    List<Curso> getCourses();
    //Update
    void updateCourse(Curso curso);
    //Delete
    void deleteCourse(Long id_curso);
    //buscar cursos filtrando por nombre
    List<Curso> getCoursesContainingWord(String word);
}
