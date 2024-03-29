package br.com.clickleitos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sun.el.parser.ParseException;

import br.com.clickleitos.service.DBService;

@Configuration
@Profile("test")
public class TestConfig{

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException{
		dbService.instantiateTestDatabase();
		return true;
	}
	
}
