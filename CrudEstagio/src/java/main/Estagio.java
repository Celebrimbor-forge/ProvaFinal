import java.util.Date;

import javax.persistence.Id;

public class Estagio {
	@Id
	private int id;
	private Date dataInicio;
	private Date dateaFinal;
	private Empresa empresa;
	private Apolice apolice;
	private Supervisor supervisor;
	private Orientador orientador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDateaFinal() {
		return dateaFinal;
	}

	public void setDateaFinal(Date dateaFinal) {
		this.dateaFinal = dateaFinal;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

}
