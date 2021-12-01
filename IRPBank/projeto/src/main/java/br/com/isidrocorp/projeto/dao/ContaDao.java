package br.com.isidrocorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projeto.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer>{

}
