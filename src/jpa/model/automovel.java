package jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity                // indica que os objetos dessa classe sejam operaveis no bd

public class automovel {
	
	@Id             //indica que o atributo id dessa classe, será a key primaria
	@GeneratedValue // é o auto_increment usado no bd
	private Long id;
	private String marca;
	private String modelo;
	private Integer anoFrabricacao;
	private Integer anoModelo;
	private String observacao;
	
	public automovel() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFrabricacao() {
		return anoFrabricacao;
	}

	public void setAnoFrabricacao(Integer anoFrabricacao) {
		this.anoFrabricacao = anoFrabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
