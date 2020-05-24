package br.com.clickleitos.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.parser.ParseException;

import br.com.clickleitos.domain.Empresa;
import br.com.clickleitos.repository.EmpresaRepository;

@Service
public class DBService {
	
	@Autowired
	private EmpresaRepository repository; 
	
	public void instantiateTestDatabase() throws ParseException{
	
		Empresa unidade01 = new Empresa(null, "UPA-Depresão","3242345435", "234234", "23423432", 20, 8);
		Empresa unidade02 = new Empresa(null, "UPA-Covid19","324238935", "234234", "23423432", 20, 8);
		
		repository.saveAll(Arrays.asList(unidade01,unidade02));

	}
}
