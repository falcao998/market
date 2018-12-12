package br.com.syssouza.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.syssouza.entity.Categoria;
import br.com.syssouza.entity.Produto;
import br.com.syssouza.entity.SubCategoria;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

	List<Produto> findByCategoria(Categoria categoria);
	
	List<Produto> findBySubCategoria(SubCategoria subCategoria);
}
