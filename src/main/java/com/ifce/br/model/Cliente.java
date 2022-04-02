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
public class Cliente {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long codigo;
	private String Nome;
	private String Profissao;
    private String Cpf;
    
    
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


	public String getProfissao() {
		return Profissao;
	}


	public void setProfissao(String profissao) {
		Profissao = profissao;
	}


	public String getCpf() {
		return Cpf;
	}


	public void setCpf(String cpf) {
		Cpf = cpf;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	
    
    
    
    
}
