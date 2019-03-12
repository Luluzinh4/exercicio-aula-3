package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaPoupanca extends Conta{

	private static double taxaRendimento;
	
	public ContaPoupanca() {
		
	}

	public static double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
}
