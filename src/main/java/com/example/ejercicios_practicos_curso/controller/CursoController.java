package com.example.ejercicios_practicos_curso.controller;

import com.example.ejercicios_practicos_curso.model.Curso;
import com.example.ejercicios_practicos_curso.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping ("/save")
    public String saveCurso(@RequestBody Curso curso){
        cursoService.saveCourse(curso);
        return "Curso creado correctamente";
    }

    @GetMapping ("/get-courses")
    public List<Curso> getCourses(){
        return cursoService.getCourses();
    }

    @GetMapping ("/get-courses-containing-words")
    public List<Curso> getCoursesContainingWords(@RequestParam String word){
        return cursoService.getCoursesContainingWord(word);
    }

    @PutMapping ("/update")
    public String updateCourse(@RequestBody Curso curso){
        cursoService.updateCourse(curso);
        return "El curso se actualizo correctamente";
    }


}
