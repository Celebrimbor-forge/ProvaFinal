package br.edu.ifpb.daw2.crudEstagio.entities;
import javax.persistence.Id;

public class Empresa {
	@Id
	private int Id;
	private String nome;
	private String endereco;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
