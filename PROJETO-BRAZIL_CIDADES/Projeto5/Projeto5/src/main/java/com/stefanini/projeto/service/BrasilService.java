package com.stefanini.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Brasil;
import com.stefanini.projeto.repository.BrasilRepository;

@Service
public class BrasilService {

	@Autowired
	private BrasilRepository repository;
	
	public List<Brasil> findAll() throws TreinaException {
		return (List<Brasil>) repository.findAll();
	}

}