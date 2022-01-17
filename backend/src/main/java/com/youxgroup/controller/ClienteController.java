package com.youxgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.youxgroup.model.Formulario;
import com.youxgroup.repository.FormularioRepository;

@Repository
@RestController
@RequestMapping("/formulario")
public class ClienteController {
	
	@Autowired
	private FormularioRepository formularioRepository;
	
	@PostMapping
	public Formulario save(@RequestBody Formulario formulario) {
		return formularioRepository.save(formulario);
	}
	
	
	

	
}
