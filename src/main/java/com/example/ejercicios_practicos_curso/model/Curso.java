package com.example.ejercicios_practicos_curso.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Curso {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private LocalDate fechaFinalizacion;
    @OneToMany
    private List<Tema> listaTemas;
}
