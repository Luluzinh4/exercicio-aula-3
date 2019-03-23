package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaPoupanca extends Conta{

	//Taxa (em %) de rendimento da poupança ao ano: 4.8 (ao mês, 0.4)
	private static double taxaRendimento = 0.4;
	
	public ContaPoupanca(String numeroDaConta, String titular) {
		super(numeroDaConta, titular);
	}
	
	public ContaPoupanca(String numeroDaConta, String titular, double saldoInicial) {
		super(numeroDaConta, titular, saldoInicial);
	}

	public static double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void aplicarRendimento() {
		setSaldo(getSaldo() * (1 + (taxaRendimento/100)));
	}
}
