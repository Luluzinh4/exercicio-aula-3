package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class Conta {

	private String numeroDaConta;
	private String titular;
	private double saldo;
	
	public Conta(String numeroDaConta, String titular) {
		setNumeroDaConta(numeroDaConta);
		setTitular(titular);
		setSaldo(0);
	}
	
	public Conta(String numeroDaConta, String titular, double saldoInicial) {
		setNumeroDaConta(numeroDaConta);
		setTitular(titular);
		setSaldo(saldoInicial);
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	protected void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	protected void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	} 
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(double valor) {
		this.saldo = this.saldo - valor;
		return valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void transferirPara(Conta outraConta, double valor) {
		double valorADepositar = sacar(valor);
		outraConta.depositar(valorADepositar);
	}
	
	@Override
	public String toString() {
		return this.getNumeroDaConta() + " , " + this.getTitular() + " , " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			Conta other = (Conta)obj;
			resultado = this.getNumeroDaConta().equals(other.getNumeroDaConta());
		}
		
		return resultado;
	}
	
}
