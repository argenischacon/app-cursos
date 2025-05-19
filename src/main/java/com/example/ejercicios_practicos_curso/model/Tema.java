package com.example.ejercicios_practicos_curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Tema {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre;
    private String descripcion;
}
