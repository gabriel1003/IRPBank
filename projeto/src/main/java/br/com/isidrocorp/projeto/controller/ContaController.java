package br.com.isidrocorp.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.projeto.dao.ContaDao;
import br.com.isidrocorp.projeto.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;

	@GetMapping("/contas")
	public ArrayList<Conta> recuperarTudo() {
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>) dao.findAll();
		return lista;
	}

	@GetMapping("/contas/{numero}")
	public Conta recuperarConta(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}

}
