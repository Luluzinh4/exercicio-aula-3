package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;
	private static double taxaJurosChequesEspecial;
	
	public ContaCorrente() {
		
	}
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public static double getTaxaJurosChequesEspecial() {
		return taxaJurosChequesEspecial;
	}
	
	public static void setTaxaJurosChequesEspecial(double taxaJurosChequesEspecial) {
		ContaCorrente.taxaJurosChequesEspecial = taxaJurosChequesEspecial;
	}
	
}
