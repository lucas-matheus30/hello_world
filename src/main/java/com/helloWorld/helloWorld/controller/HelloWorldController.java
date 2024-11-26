package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Endpoint 1:
	@GetMapping("/hello-world")
	
	public String helloWorld() {
		return "Hello World!!";
	}
	
	//Endpoint 2 - Lista de BSM
	@GetMapping("/bsm")
	public List<String> Bsm(){
		return Arrays.asList(
				"Mentalidade de Cresimento",
				"Persistência",
				"Responsabilidade Pessoal",
				"Trabalho em Equipe",
				"Orientação aos Detalhes",
				"Proatividade",
				"Comunicação"
				);
	}
	
	//Endpoint 3 - Lista Objetivos
	@GetMapping("/objetivos")
	public List<String> Objetivos(){
		return Arrays.asList(
				"Entender as nuances e a estrutura do Spring.",
				"Compreender melhor como criar os endpoints.",
				"Desenvolver mais projetos para entender na prática."
				);
	}
	
}


