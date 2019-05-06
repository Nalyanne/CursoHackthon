package com.stefanini.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Brasil;
import com.stefanini.projeto.model.Cidades;
import com.stefanini.projeto.repository.BrasilRepository;

@Service
public class BrasilService {

	@Autowired
	private BrasilRepository repository;
	
	public List<Brasil> findAll() throws TreinaException {
		return (List<Brasil>) repository.findAll();
		
	}
	
	public Brasil getBrasil(Brasil nome) {
		return nome;
	}
	
	public Cidades getCidades(Cidades nome) {
		return nome;
		
	}
	
	
	public Brasil postBrasil(Brasil nome) {
		return nome;
	} 
	
	public Cidades postCidades(Cidades nome) {
		return nome;
	}
	
	public Brasil updateBrasil(Brasil nome) {
		return nome;
	}
	
	public Cidades updateCidades(Cidades nome) {
		return nome;
	}
	
	public Brasil deleteBrasil(Brasil brasil) {
		return brasil;
	}
	
	public Cidades deleteCidades(Cidades cidades) {
		return cidades;
	}
	
}
