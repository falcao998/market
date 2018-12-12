package br.com.syssouza.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.entity.SubCategoria;
import br.com.syssouza.repository.SubCategoriaRepository;

@Service
public class SubCategoriaService implements ServiceInterface<SubCategoria> {
	
	@Autowired
	private SubCategoriaRepository repository;

	public Iterator<SubCategoria> findAll(){
		return repository.findAll().iterator();
	}
	
	public SubCategoria findById(Long id) {
		return repository.findById(id).get();
	}
	
	public SubCategoria save(SubCategoria subCategoria) {
		return repository.save(subCategoria);
	}
	
	public String delete(SubCategoria subCategoria) {
		repository.delete(subCategoria);
		return "Sub-Categoria foi removida.";
	}
	
	public String delete(Long id) {
		repository.deleteById(id);
		return "Sub-Categoria foi removida.";
	}
	
	public List<SubCategoria> findSubCategoriaByCategoriaId(Categoria categoria) {
		return repository.findByCategoria(categoria);
	}

}
