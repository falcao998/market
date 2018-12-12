package br.com.syssouza.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.syssouza.entity.Categoria;

public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long> {

}
