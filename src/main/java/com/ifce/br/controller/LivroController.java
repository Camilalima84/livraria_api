package com.ifce.br.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifce.br.model.Livro;
import com.ifce.br.service.LivroService;

@Controller
public class LivroController {

	
	@Autowired
		private LivroService livroService;

	@GetMapping("/livro/formularioLivro")
		public String form(Model model) {
			model.addAttribute("livro", new Livro());
			return "formularioLivro";
		}

	@PostMapping("/livro/salvar")
		public String cadastrarLivro(Livro livro) {
		 livroService.cadastrarLivro(livro);
		  return "redirect:/livro/listar";
		}

	@GetMapping("/livro/listar")
		public String listarLivro(Model model) {
		 model.addAttribute("livro", livroService.listarLivro());
		  return "listagemlivro";
			
		}

	@GetMapping("/livro/excluir/{codigo}")
		public String excluirLivro(@PathVariable Long codigo) {
		 livroService.excluir(codigo);
		  return "redirect:/livro/listar";
			
		}

	@GetMapping("/livro/atualizar/{codigo}")
		public String atualizarLivro(@PathVariable Long codigo, Model model) {
		Optional<Livro> livroOptional = livroService.retornarPeloCodigo(codigo);
			
			Livro livro = livroOptional.get();
			model.addAttribute("livro", livro);
			return "formularioLivro";
		}

}
