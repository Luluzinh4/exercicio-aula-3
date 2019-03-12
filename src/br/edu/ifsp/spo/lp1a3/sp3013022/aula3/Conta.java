package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

public class Conta {

	private String numeroDaConta;
	private String titular;
	private double saldo;
	
	public Conta() {
		
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
	
}
