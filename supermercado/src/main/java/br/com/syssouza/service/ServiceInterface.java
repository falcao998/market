package br.com.syssouza.service;

import java.util.Iterator;

import br.com.syssouza.entity.EntityBase;

public interface ServiceInterface<T extends EntityBase> {

	public Iterator<T> findAll();
	
	public T findById(Long id);
	
	public T save(T object);
	
	public String delete(T object);
	
	public String delete(Long id);
	
}