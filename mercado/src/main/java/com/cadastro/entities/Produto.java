package com.cadastro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tab_produto")

public class Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_prod;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "valor")
	private int valor;
	
	@Column(name = "id_vend")
	public Long id_vend;
	
	//Construtores
	public Produto () {
		
	}
	public Produto(Long id_prod, String nome, int valor, Long id_vend) {
		this.id_prod = id_prod;  
		this.nome = nome;
		this.valor = valor;
		this.id_vend = id_vend;
	}
	
	//Getters e Setters
	public Long getId_prod() {
		return id_prod;
	}
	public void setId_prod(Long id_prod) {
		this.id_prod = id_prod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Long getId_vend() {
		return id_vend;
	}
	public void setId_vend(Long id_vend) {
		this.id_vend = id_vend;
	}
}
 