package com.stefanini.projeto.exception;

import org.springframework.data.repository.CrudRepository;

import com.stefanini.projeto.model.Brasil;
import com.stefanini.projeto.repository.BrasilRepository;


public class TreinaException extends Exception {

	private static final long serialVersionUID = 1L;

	public TreinaException(String mensagem) {
		super(mensagem);
		
		
	}
	
	public void salvar(Brasil brasil) throws TreinaException {
		if( brasil.getNome().length() >20){
			throw new TreinaException ("Tamanho do campo maior que o permitido!");
		}if (brasil.getCidades().size()>5){

		}

		
		CrudRepository<Brasil, Long> repository = null;
		repository.save(brasil);
	}

}
