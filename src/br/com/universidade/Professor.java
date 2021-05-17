package br.com.universidade;

public class Professor extends Funcionario {
	
	private String nivelGraduacao;
	private String disciplina;
	private int qtdAlunos;
	private int qtdTurma;
	
	
	public Professor(String nome, String CPF, int numeroRegistro, String orgaoLotado, float salario, String nivelGraduacao, 
			String disciplina, int qtdAlunos, int qtdTurma) {
		super(nome, CPF, numeroRegistro, orgaoLotado, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplina = disciplina;
		this.qtdAlunos = qtdAlunos;
		this.qtdTurma = qtdTurma;
	}


	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public int getQtdTurma() {
		return qtdTurma;
	}
	public void setQtdTurma(int qtdTurma) {
		this.qtdTurma = qtdTurma;
	}
	public String getNivelGraduacao() {
		return nivelGraduacao;
	}
	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}
	
	
	
}
