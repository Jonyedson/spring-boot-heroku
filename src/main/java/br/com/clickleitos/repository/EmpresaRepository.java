package br.com.clickleitos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clickleitos.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
