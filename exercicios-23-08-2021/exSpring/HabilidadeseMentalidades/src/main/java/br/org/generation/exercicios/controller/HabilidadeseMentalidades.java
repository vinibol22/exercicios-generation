package br.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeseMentalidades {
	
	@GetMapping
	public String habilidades() {
		return "Persistencia e atenção aos detalhes /";
	}

}
