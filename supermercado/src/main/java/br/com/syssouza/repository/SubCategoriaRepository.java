package br.com.syssouza.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.entity.SubCategoria;

public interface SubCategoriaRepository extends PagingAndSortingRepository<SubCategoria, Long> {

	List<SubCategoria> findByCategoria(Categoria categoria);
	
}
