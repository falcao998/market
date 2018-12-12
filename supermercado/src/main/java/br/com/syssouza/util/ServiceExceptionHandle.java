package br.com.syssouza.util;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceExceptionHandle {

	@ExceptionHandler(NoSuchElementException.class)
	public String errorNoSuchElementException() {
		return "Elemento não encontrado.";
	}

}
