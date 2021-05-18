package br.com.elevador;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(10,6);
		//Elevador elevadorServiço = new Elevador(10,6);
		elevador.status();
		
		for (int i =0; i <10; i++) {
			elevador.sobe();
		}
		elevador.status();
		
//		for (int i = 0; i < 7; i++) {
//			try {
//				elevador.sai();
//			} catch (CargaElevadorException e) {
//				System.err.println(e.getMensagem());
//				e.printStackTrace();
//				break;
//			}
//		}
		
		elevador.status();
		
		elevador.desce();
		
		
		elevador.status();
	}

}
