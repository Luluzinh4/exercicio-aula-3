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
	
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
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
	
}
