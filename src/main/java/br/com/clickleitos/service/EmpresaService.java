package br.com.clickleitos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.clickleitos.domain.Empresa;
import br.com.clickleitos.repository.EmpresaRepository;
import br.com.clickleitos.service.exceptions.DatabaseException;
import br.com.clickleitos.service.exceptions.ResourceNotFoundException;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository repository;
	
	
	public List<Empresa> findAll() {
		return repository.findAll();
	}

	public Empresa findById(Long id) {
		Optional<Empresa> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Empresa insert(Empresa obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
}
