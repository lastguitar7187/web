package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Pract3Model;

@Service
public class Pract3service {
	private List<Pract3Model>medicamento=new ArrayList<>();
	
	public List<Pract3Model>mostrarMedicamentos(){
		return medicamento;
	}
	public Pract3Model agregarMedicamento(Pract3Model p){
		medicamento.add(p);
        return p;
	}
}
