package com.ifce.br.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ifce.br.model.Funcionario;
import com.ifce.br.service.FuncionarioService;





@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	

	@GetMapping("/funcionario/formfuncionario")
	public String Form(Model model) {
		model.addAttribute("funcionario", new Funcionario());
		return "formfuncionario";

		
	}
	
	@GetMapping("/funcionario/cadastrar")
	public String cadatrarFuncionario(Model model) {
		model.addAttribute("cliente", funcionarioService.listarFuncionario());
		return "listagemdefuncionario.html";

	}


		@GetMapping("/funcionario/excluir/{codigo}")
		public String excluirCliente(@PathVariable Long codigo) {
			funcionarioService.excluir(codigo);
			return "redirect:/funcionario/listar";

		}

		
		@GetMapping("/funcionario/atualizar/{codigo}")
		public String atualizarFuncionario(@PathVariable Long codigo, Model model) {
	    Optional<Funcionario> funcionarioOptional= funcionarioService.retornarPeloCodigo(codigo);
	    Funcionario funcionario = funcionarioOptional.get();
	    model.addAttribute("funcionario", funcionario);
	    return "redirect:/funcionario/formfuncionario";
			
			
		}
	
	
	

}
