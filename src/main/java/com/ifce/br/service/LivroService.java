package com.ifce.br.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.data.LivroRepository;
import com.ifce.br.model.Livro;



@Service
public class LivroService {

	
	@Autowired
	private LivroRepository livroRepo;
	
	public void cadastrarLivro(Livro livro) {
		livroRepo.save(livro);
	}
	
	public Iterable<Livro> listarLivro(){
		return livroRepo.findAll();
	}
	
	public void excluir (Long id) {
		livroRepo.deleteById(id);
	}
	
	public Optional<Livro> retornarPeloCodigo(Long codigo) {
		return livroRepo.findById(codigo);
	}
	
	
	
	
	
}
