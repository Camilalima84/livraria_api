package com.ifce.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ifce.br.data.ClienteRepository;
import com.ifce.br.model.Cliente;



@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;
	
	public void cadastrarCliente(Cliente cliente) {
		clienteRepo.save(cliente);
	}
	
	public Iterable<Cliente> listarCliente(){
		return clienteRepo.findAll();
	}
	
	public void excluir (Long id) {
		clienteRepo.deleteById(id);
	}
	
	public Optional<Cliente> retornarPeloCodigo(Long codigo) {
		return clienteRepo.findById(codigo);
	}

}


