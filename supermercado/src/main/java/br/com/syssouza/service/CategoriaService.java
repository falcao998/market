package br.com.syssouza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findCategoria(Long id) {
		return repository.findById(id).get();
	}
	
	public Iterable<Categoria> findCategoria() {
		return repository.findAll();
	}
	
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public void delete(Categoria categoria) {
		repository.delete(categoria);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
