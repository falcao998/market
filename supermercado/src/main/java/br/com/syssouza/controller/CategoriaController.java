package br.com.syssouza.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public Iterator<Categoria> getCategorias() {
		return service.findCategoria().iterator();
	}
	
	@RequestMapping(value="/{categoriaId}",method=RequestMethod.GET)
	public Categoria getCategoria(@PathVariable("categoriaId") Long categoriaId) {
		return service.findCategoria(categoriaId);
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public Categoria saveCategoria(@RequestBody Categoria categoria) {
		return service.save(categoria);
	}
	
	@RequestMapping(value="/",method=RequestMethod.DELETE)
	public String deleteCategoria(@RequestBody Categoria categoria) {
		service.delete(categoria);
		return "Categoria foi apagada.";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String deleteCategoria(@PathVariable("id") Long id) {
		service.delete(id);
		return "Categoria foi apagada";
	}

}
