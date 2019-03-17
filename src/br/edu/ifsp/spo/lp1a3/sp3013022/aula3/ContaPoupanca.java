package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaPoupanca extends Conta{

	private static double taxaRendimento;
	
	public ContaPoupanca(String numeroDaConta, String titular) {
		super(numeroDaConta, titular);
	}
	
	public ContaPoupanca(String numeroDaConta, String titular, double saldoInicial) {
		super(numeroDaConta, titular, saldoInicial);
	}

	public static double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
	public void aplicarRendimento() {
		setSaldo(getSaldo() * (1 + (taxaRendimento/100)));
	}
}
