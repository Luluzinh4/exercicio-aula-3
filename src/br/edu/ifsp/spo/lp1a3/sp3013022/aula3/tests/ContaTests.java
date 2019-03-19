package br.edu.ifsp.spo.lp1a3.sp3013022.aula3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.Conta;

class ContaTests {
	
	@Test
	void criar_uma_nova_conta_com_titular_e_numero_da_conta() {
		//1. Configuração
		String titular = "Marilda Fernades";
		String numeroConta = "0034 - 76519";
		
		//2. Execução
		Conta conta = new Conta(numeroConta, titular);
		
		//3. Validação / Asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
	}
	
	@Test
	void criar_uma_nova_conta_com_saldo_inicial() {
		//1. Configuração
		String titular = "Hernadez Ludembergue";
		String numeroConta = "0234 - 86243";
		double saldoInicial = 400.00;
		
		//2. Execução
		Conta conta = new Conta(numeroConta, titular, saldoInicial);
		
		//3. Validação / Asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(saldoInicial, conta.getSaldo());
	}
	
	@Test
	void depositar_um_valor_em_conta() {
		//1. Configuração
		Conta conta = new Conta("0054 - 67291", "Hector Farias");
		double valorADepositar = 150.00;
		double saldoInicial = conta.getSaldo();
		
		//2. Execução
		conta.depositar(valorADepositar);
		
		//3. Validação / Asserção
		assertEquals(valorADepositar, conta.getSaldo() - saldoInicial);
	}
	
//	void sacar_um_valor_em_conta() {
//		//1. Configuração
//		Conta conta = new Conta("0263 - 27002", "Joaquim Mathias");
//		double valorSacado;
//		double saldoInicial = conta.getSaldo();
//		
//		//2. Execução
//		valorSacado = conta.sacar(100);
//		
//		//3. Validação / Asserção
//		assertEquals(valorSacado, saldoInicial - conta.getSaldo());
//	}

}
