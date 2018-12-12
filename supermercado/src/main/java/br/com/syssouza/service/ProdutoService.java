package br.com.syssouza.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.entity.Produto;
import br.com.syssouza.entity.SubCategoria;
import br.com.syssouza.repository.ProdutoRepository;

@Service
public class ProdutoService implements ServiceInterface<Produto> {
	
	@Autowired
	ProdutoRepository repository;

	@Override
	public Iterator<Produto> findAll() {
		return repository.findAll().iterator();
	}

	@Override
	public Produto findById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Produto save(Produto object) {
		return repository.save(object);
	}

	@Override
	public String delete(Produto object) {
		repository.delete(object);
		return "Produto removido.";
	}

	@Override
	public String delete(Long id) {
		repository.deleteById(id);
		return "Produto removido.";
	}
	
	@JsonIgnore
	public List<Produto> findByCategoria(Long categoriaId) {
		Categoria categoria = new Categoria(categoriaId);
		return repository.findByCategoria(categoria);
	}
	
	public List<Produto> findBySubCategoria(Long subCategoriaId) {
		SubCategoria subCategoria = new SubCategoria(subCategoriaId);
		return repository.findBySubCategoria(subCategoria);
	}

}