package com.ifce.br.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Funcionario {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public Long codigo;
	public String Nome;
	public String Cpf;
	public Float Salario;
	
	  @DateTimeFormat(pattern= "dd/mm/yyyy")
	    @Temporal(TemporalType.DATE)
	    private Date dataNascimento;


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public Float getSalario() {
		return Salario;
	}

	public void setSalario(Float salario) {
		Salario = salario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
	
	

	
	
}
