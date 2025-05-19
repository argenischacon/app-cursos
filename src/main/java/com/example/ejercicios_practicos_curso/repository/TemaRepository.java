package com.example.ejercicios_practicos_curso.repository;

import com.example.ejercicios_practicos_curso.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
}
