package br.com.universidade;

public class FuncionarioAdiministrativo extends Funcionario{
	
	private String funcaoAdmin;
	private String senioridade;
	
	public FuncionarioAdiministrativo(String nome, String CPF, int numeroRegistro, String orgaoLotado, float salario,
			String funcaoAdmin, String senioridade) {
		super(nome, CPF, numeroRegistro, orgaoLotado, salario);
		this.funcaoAdmin = funcaoAdmin;
		this.senioridade = senioridade;
	}

	public String getFuncaoAdmin() {
		return funcaoAdmin;
	}

	public void setFuncaoAdmin(String funcaoAdmin) {
		this.funcaoAdmin = funcaoAdmin;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	
}
