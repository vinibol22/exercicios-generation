package br.org.generation.exercicios.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosSemanal {
	@GetMapping
	public String objetivos() {
		return "Meus objetivos são : <br />"
				+ "Aprender mais sobre o spring boot <br />"
				+" Ter um bom caminho traçado para o projeto integrador";
	}
}
