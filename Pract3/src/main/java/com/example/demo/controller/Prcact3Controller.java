package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pract3Model;
import com.example.demo.service.Pract3service;

@RestController
@RequestMapping("/api/medicamento")
@CrossOrigin(origins = "*") //_Permite_peticiones_desde_cualquier_origen
public class Prcact3Controller {
	@Autowired
    private Pract3service pract3service;

    // Método_GET_para_obtener_lista_de_personas
    @GetMapping
    public List<Pract3Model> mostrar() {
        return pract3service.mostrarMedicamentos();
    }

    // Método_POST_para_agregar_persona_nueva
    @PostMapping
    public Pract3Model agregar(@RequestBody Pract3Model pract3Model) {
        return (Pract3Model) pract3service.agregarMedicamento(pract3Model);
    }
}
