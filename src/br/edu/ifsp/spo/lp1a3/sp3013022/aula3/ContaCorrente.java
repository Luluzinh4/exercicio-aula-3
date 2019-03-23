package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;
	//Taxa (em %) de juros do cheque especial (Agosto/2018)
	private static double taxaJurosChequeEspecial = 13;
	
	public ContaCorrente(String numeroDaConta, String titular, double limiteChequeEspecial) {
		super(numeroDaConta, titular);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public ContaCorrente(String numeroDaConta, String titular, double saldoInicial, double limiteChequeEspecial) {
		super(numeroDaConta, titular, saldoInicial);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public static double getTaxaJurosChequeEspecial() {
		return taxaJurosChequeEspecial;
	}
	
	public void debitarJuros() {
		double taxa = - getSaldo() * (taxaJurosChequeEspecial/100);
		depositar(- taxa);
	}
	
	@Override
	public double sacar(double valor) {
		if (getSaldo() - valor >= 0) {
			setSaldo(getSaldo() - valor);
			depositar(- valor * 0.01);
		} else {
			if (valor <= getSaldo() + limiteChequeEspecial) {
				setSaldo(getSaldo() - valor);
				depositar(- valor * 0.01);
				debitarJuros();
			} else {
				System.out.println("Saque Indisponível. Sem Limite de Cheque Especial");
			}
		}
		return valor;
	}
	
}
