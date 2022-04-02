package com.ifce.br.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifce.br.model.Cliente;
import com.ifce.br.service.ClienteService;

@Controller
public class ClienteController {
	
		
		@Autowired
		private ClienteService clienteService;
		
		@GetMapping("/cliente/formulariocliente")
		public String form(Model model) {
			
			model.addAttribute("cliente", new Cliente());
			return "Formulariocliente";
		}
		
		@PostMapping("/cliente/cadastrar")
		public String cadastrarCliente(Cliente cliente) {
			
			clienteService.cadastrarCliente(cliente);
			
			return "redirect:/cliente/listar";
		}
		
		@GetMapping("/cliente/listar")
		public String listarCliente(Model model) {
			model.addAttribute("cliente", clienteService.listarCliente());
			return "PaginaListagem";
			
		}
		
		@GetMapping("/cliente/excluir/{codigo}")
		public String excluirCliente(@PathVariable Long codigo) {
			clienteService.excluir(codigo);
			return "redirect:/cliente/listar";
			
			
		}
		
		@GetMapping("/cliente/atualizar/{codigo}")
		public String atualizarcliente(@PathVariable Long codigo, Model model) {			
			Optional<Cliente> clienteOptional = clienteService.retornarPeloCodigo(codigo);
			Cliente cliente = clienteOptional.get();
			model.addAttribute("cliente", cliente);
			return "Formulariocliente";
		}
		
		
	}



