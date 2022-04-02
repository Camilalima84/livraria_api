package com.ifce.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.data.FuncionarioRepository;
import com.ifce.br.model.Funcionario;



@Service
public class FuncionarioService{

	
	@Autowired
	private FuncionarioRepository funcionarioRepo;
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarioRepo.save(funcionario);

	}

	public Iterable<Funcionario> listarFuncionario() {
		return funcionarioRepo.findAll();

	}

	public void excluir(Long id) {
		funcionarioRepo.deleteById(id);

	}

	public Optional<Funcionario> retornarPeloCodigo(Long codigo) {
		return funcionarioRepo.findById(codigo);
	}
}
