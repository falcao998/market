package br.com.syssouza.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.syssouza.entity.Produto;
import br.com.syssouza.service.ProdutoService;
import br.com.syssouza.service.ServiceInterface;

@RestController
@RequestMapping("/produto")
public class ProdutoController implements ServiceInterface<Produto>{
	
	@Autowired
	public ProdutoService service;

	@Override
	@RequestMapping(path="/",method=RequestMethod.GET)
	public Iterator<Produto> findAll() {
		return service.findAll();
	}

	@Override
	@RequestMapping(path="/{id}",method=RequestMethod.GET)
	public Produto findById(@PathVariable("id")Long id) {
		return service.findById(id);
	}

	@Override
	@RequestMapping(path="/",method=RequestMethod.POST)
	public Produto save(@RequestBody Produto object) {
		return service.save(object);
	}

	@Override
	@RequestMapping(path="/delete",method=RequestMethod.DELETE)
	public String delete(@RequestBody Produto object) {
		return service.delete(object);
	}

	@Override
	@RequestMapping(path="/delete/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		return service.delete(id);
	}

	@RequestMapping(path="/categoria/{id}",method=RequestMethod.GET)
	public List<Produto> findByCategoriaId(@PathVariable("id")Long id) {
		return service.findByCategoria(id);
	}
	
	@RequestMapping(path="/subcategoria/{id}",method=RequestMethod.GET)
	public List<Produto> findBySubCategoriaId(@PathVariable("id")Long id) {
		return service.findBySubCategoria(id);
	}
	
}