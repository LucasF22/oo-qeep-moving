package br.com.televisão;

public class Controle {
	private Televisao televisao;
	private int aumentaVol;
	private int diminuiVol;
	private int aumentaCan;
	private int diminuiCan;
	
	public Controle(int aumentaVol, int diminuiVol, int aumentaCan, int diminuiCan) {
		this.televisao = new Televisao(0, 0);
		this.aumentaVol = aumentaVol;
		this.diminuiVol = diminuiVol;
		this.aumentaCan = aumentaCan;
		this.diminuiCan = diminuiCan;
	}
	
	
}
