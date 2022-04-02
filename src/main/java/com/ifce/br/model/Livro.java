package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long codigo;
	private String Titulo;
	private String Autor;
	private Float Preco;
	private String ISBN;
	
	  public Livro() {
	    	
	    	
	    }
	public Livro(Long codigo, String titulo, String autor, Float preco, String iSBN) {
		super();
		this.codigo = codigo;
		Titulo = titulo;
		Autor = autor;
		Preco = preco;
		ISBN = iSBN;
	}


	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public Float getPreco() {
		return Preco;
	}
	public void setPreco(Float preco) {
		Preco = preco;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
	
	
	
	

}
