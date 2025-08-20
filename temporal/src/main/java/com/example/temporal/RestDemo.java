package com.example.temporal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

	@GetMapping("/tempo")
	public String saludar() {
		return "Hola TEMPO";
	}
}
