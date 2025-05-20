package com.example.ejercicios_practicos_curso.service;

import com.example.ejercicios_practicos_curso.model.Curso;
import com.example.ejercicios_practicos_curso.repository.CursoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso saveCourse(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> getCourses() {
        return cursoRepository.findAll();
    }

    @Override
    @Transactional
    public void updateCourse(Curso curso) {
        this.saveCourse(curso);
    }

    @Override
    @Transactional
    public void deleteCourse(Long id_curso) {
        cursoRepository.deleteById(id_curso);
    }

    @Override
    public List<Curso> getCoursesContainingWord(String word) {
        return cursoRepository.findAll().stream()
                .filter((curso -> curso.getNombre().toLowerCase().contains(word)))
                .toList();
    }
}
