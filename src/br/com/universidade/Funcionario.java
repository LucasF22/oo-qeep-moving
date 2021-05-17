package br.com.universidade;

public class Funcionario {
	
	protected String nome;
	protected String CPF;
	protected int numeroRegistro;
	protected String orgaoLotado;
	protected float salario;
	
	public Funcionario(String nome, String CPF, int numeroRegistro, String orgaoLotado, float salario) {
		this.nome = nome;
		this.CPF = CPF;
		this.numeroRegistro = numeroRegistro;
		this.orgaoLotado = orgaoLotado;
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	protected void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getOrgaoLotado() {
		return orgaoLotado;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setOrgaoLotado(String orgaoLotado) {
		this.orgaoLotado = orgaoLotado;
	}
	
	public void aumentaSalario() {
		this.salario = salario * 1.1F;
	}
	
	
}
