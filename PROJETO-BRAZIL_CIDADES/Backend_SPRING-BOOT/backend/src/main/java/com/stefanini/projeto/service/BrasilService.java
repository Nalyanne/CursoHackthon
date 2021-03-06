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
	
	
	public Brasil buscar(Long id) {
		return repository.findById(id).get();
	}
	
	
	 public Brasil salvarBrasil(Brasil brasil) {
	 	return repository.save(brasil);
	 	
	}

	public Brasil atualizarBrasil(Brasil brasil) {
		
		return repository.save(brasil);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
