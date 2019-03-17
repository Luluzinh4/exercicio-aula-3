package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;
	private static double taxaJurosChequeEspecial;
	
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
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public static double getTaxaJurosChequeEspecial() {
		return taxaJurosChequeEspecial;
	}
	
	public static void setTaxaJurosChequeEspecial(double taxaJurosChequeEspecial) {
		ContaCorrente.taxaJurosChequeEspecial = taxaJurosChequeEspecial;
	}
	
	public void debitarJuros() {
		if(getSaldo() < 0) {
			setSaldo(getSaldo() - taxaJurosChequeEspecial);
		}
	}
	
	@Override
	public double sacar(double valor) {
		setSaldo(getSaldo() - (valor * (1.01)));
		return valor;
	}
	
}
