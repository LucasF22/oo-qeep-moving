package br.com.universidade;

public class Coordenador extends Funcionario {
	
	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String CPF, int numeroRegistro, String orgaoLotado, float salario) {
		super(nome, CPF, numeroRegistro, orgaoLotado, salario);
		this.professoresSupervisionados = new Professor [10];
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void adicionaProfessor(Professor professor) {
		
		for (int i = 0; i < this.professoresSupervisionados.length; i++) {
			
			if (this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;
				break;	
			}		
		}
	}
	
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.05F);
	}
}
