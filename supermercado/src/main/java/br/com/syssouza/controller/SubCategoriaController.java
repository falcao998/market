package br.com.syssouza.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.entity.SubCategoria;
import br.com.syssouza.service.SubCategoriaService;

@RestController
@RequestMapping("/subcategoria")
public class SubCategoriaController {
	
	@Autowired
	private SubCategoriaService service;

	@RequestMapping(path="/",method=RequestMethod.GET)
	public Iterator<SubCategoria> getSubCategoria() {
		return service.findAll();
	}
	
	@RequestMapping(path="/{id}")
	public SubCategoria findById(@PathVariable("id")Long id){
		return service.findById(id);
	}
	
	@RequestMapping(path="/",method=RequestMethod.POST)
	public SubCategoria saveSubCategoria(@RequestBody SubCategoria subCategoria) {
		return service.save(subCategoria);
	}
	
	@RequestMapping(path="/",method=RequestMethod.DELETE)
	public String deleteSubCategoria(SubCategoria subCategoria) {
		return service.delete(subCategoria);
	}
	
	@RequestMapping(path="/categoria/{id}",method=RequestMethod.GET)
	public List<SubCategoria> findSubCategoriaByCategoria(@PathVariable("id") Long id) {
		Categoria categoria = new Categoria(id);
		return service.findSubCategoriaByCategoriaId(categoria);
	}

}
