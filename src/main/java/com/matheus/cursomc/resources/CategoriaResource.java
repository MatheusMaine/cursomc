package com.matheus.cursomc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.cursomc.domain.Categoria;
import com.matheus.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping(value = "/listar/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Categoria> categorias = categoriaService.buscar(id);
		return ResponseEntity.ok().body(categorias);
	}

}
