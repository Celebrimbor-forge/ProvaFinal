package br.edu.ifpb.daw2.crudEstagio.entities;
import javax.persistence.Id;

public class Apolice {
	@Id
	private int id;
	private Empresa empresa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
