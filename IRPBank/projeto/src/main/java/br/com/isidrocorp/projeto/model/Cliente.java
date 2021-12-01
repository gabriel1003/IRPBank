package br.com.isidrocorp.projeto.model;

import javax.persistence.*;

@Entity
@Table(name = "tbcliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nome", length = (100))
	private String nome;
	@Column(name = "email", length = 100)
	private String email;
	@Column(name = "cpf", length = 20)
	private String cpf;
	@Column(name = "telefone", length = 20)
	private String telefone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
