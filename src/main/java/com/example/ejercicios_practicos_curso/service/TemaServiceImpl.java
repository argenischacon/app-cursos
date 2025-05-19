package com.example.ejercicios_practicos_curso.service;

import com.example.ejercicios_practicos_curso.model.Curso;
import com.example.ejercicios_practicos_curso.model.Tema;
import com.example.ejercicios_practicos_curso.repository.CursoRepository;
import com.example.ejercicios_practicos_curso.repository.TemaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TemaServiceImpl implements TemaService{

    @Autowired
    private TemaRepository temaRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Tema saveTheme(Tema tema) {
        return temaRepository.save(tema);
    }

    @Override
    public List<Tema> getThemes() {
        return temaRepository.findAll();
    }

    @Override
    @Transactional
    public void updateTheme(Tema tema) {
        this.saveTheme(tema);
    }

    @Override
    @Transactional
    public void deleteTheme(Long id_tema) {
        temaRepository.deleteById(id_tema);
    }

    @Override
    public List<Tema> getThemesByCourse(Long id_curso) throws NoSuchElementException{
        return cursoRepository.findById(id_curso)
                .map(Curso::getListaTemas)
                .orElseThrow(() -> new NoSuchElementException("Curso con id "+ id_curso +" no encontrado"));
    }
}
