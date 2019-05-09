package com.stefanini.projeto.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Brasil;
import com.stefanini.projeto.repository.BrasilRepository;
import com.stefanini.projeto.service.BrasilService;

@CrossOrigin
@Controller
@RequestMapping(value = "/brasil")
public class BrasilController {

	@Autowired
	private BrasilService service;
	

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Brasil> findAll() throws TreinaException {
		return service.findAll();
		
	
		
	}	
	
 @PostMapping("/brasil")
 public Brasil salvaBrasil(@Valid @RequestBody Brasil brasil ) {
	 return service.salvarBrasil(brasil);
 }
 
	@PutMapping("/buscar/{id}")
	public Brasil get(@PathVariable("id") Long id) throws TreinaException {
		return service.buscar(id);
	}
 
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") Long id){
		System.out.println("id " + id);
		service.delete(id);
	 }


}
