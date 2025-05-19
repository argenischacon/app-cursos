package com.example.ejercicios_practicos_curso.controller;

import com.example.ejercicios_practicos_curso.model.Tema;
import com.example.ejercicios_practicos_curso.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    private TemaService temaService;

    @PostMapping ("/save")
    public String saveTheme(@RequestBody Tema tema){
        temaService.saveTheme(tema);
        return "El tema se ha creado correctamente";
    }

    @GetMapping ("/temas-por-curso")
    public ResponseEntity<List<Tema>> getThemesByCourse(@RequestParam Long id_curso){
        try {
            return ResponseEntity.ok(temaService.getThemesByCourse(id_curso));
        }catch (NoSuchElementException ex){
            return ResponseEntity.notFound().build();
        }catch (Exception ex){
            return ResponseEntity.internalServerError().build();
        }
    }

    @PutMapping ("/update")
    public String updateTheme (@RequestBody Tema tema){
        temaService.updateTheme(tema);
        return "Se actualizo el tema correctamente";
    }
}
