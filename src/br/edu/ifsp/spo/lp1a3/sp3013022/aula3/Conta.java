package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.exception.*;

public class Conta {

	private String numeroDaConta;
	private String titular;
	private double saldo;
	
	public Conta(String numeroDaConta, String titular) throws Exception {
		if(numeroDaConta.isEmpty()) {
			throw new NumeroContaInvalidoException("Número da conta não foi inserido!");
		} else {
			setNumeroDaConta(numeroDaConta);
		}
		
		if(titular.isEmpty()) {
			throw new NomeTitularException("Nome do titular não foi inserido!");
		} else {
			setTitular(titular);
		}
		
		setSaldo(0);
	}
	
	public Conta(String numeroDaConta, String titular, double saldoInicial) throws Exception {
		if(numeroDaConta.isEmpty()) {
			throw new NumeroContaInvalidoException("Número da conta não foi inserido!");
		} else {
			setNumeroDaConta(numeroDaConta);
		}
		
		if(titular.isEmpty()) {
			throw new NomeTitularException("Nome do titular não foi inserido!");
		} else {
			setTitular(titular);
		}
		
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
	
	public double sacar(double valor) throws Exception {
		if(valor > getSaldo()) {
			throw new SaldoIndisponivelException("Saldo Indisponível!");
		} else {
			this.saldo = this.saldo - valor;
		}
		return valor;
	}
	
	/*public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}*/
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void transferirPara(Conta outraConta, double valor) throws Exception {
		double valorADepositar = sacar(valor);
		outraConta.depositar(valorADepositar);
	}
	
	/*public void transferirPara(Conta outraConta, double valor) {
		sacar(valor);
		outraConta.depositar(valor);
	}*/
	
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
