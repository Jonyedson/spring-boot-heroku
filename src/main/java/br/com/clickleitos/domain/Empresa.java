package br.com.clickleitos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome ;
	private String cnpj;
	private String longitude;
	private String latitude;
	private Integer leitos_totais;
	private Integer leitos_disponiveis;
	
	
	public Empresa() {
		
	}
	
	
	public Empresa(Long id, String nome, String cnpj, String longitude, String latitude, Integer leitos_totais,
			Integer leitos_disponiveis) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.longitude = longitude;
		this.latitude = latitude;
		this.leitos_totais = leitos_totais;
		this.leitos_disponiveis = leitos_disponiveis;
	}


	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public Integer getLeitos_totais() {
		return leitos_totais;
	}


	public void setLeitos_totais(Integer leitos_totais) {
		this.leitos_totais = leitos_totais;
	}


	public Integer getLeitos_disponiveis() {
		return leitos_disponiveis;
	}


	public void setLeitos_disponiveis(Integer leitos_disponiveis) {
		this.leitos_disponiveis = leitos_disponiveis;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
