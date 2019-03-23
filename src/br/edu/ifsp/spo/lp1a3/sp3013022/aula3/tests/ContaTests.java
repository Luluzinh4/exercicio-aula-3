package br.edu.ifsp.spo.lp1a3.sp3013022.aula3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.Conta;

class ContaTests {
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	void criar_uma_nova_conta_com_titular_e_numero_da_conta() {
		//1. Configura��o
		String titular = "Marilda Fernades";
		String numeroConta = "0034 - 76519";
		
		//2. Execu��o
		Conta conta = new Conta(numeroConta, titular);
		
		//3. Valida��o / Asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
	}
	
	@Test
	void criar_uma_nova_conta_com_saldo_inicial() {
		//1. Configura��o
		String titular = "Hernadez Ludembergue";
		String numeroConta = "0234 - 86243";
		double saldoInicial = 400.00;
		
		//2. Execu��o
		Conta conta = new Conta(numeroConta, titular, saldoInicial);
		
		//3. Valida��o / Asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(saldoInicial, conta.getSaldo());
	}
	
	@Test
	void depositar_um_valor_em_conta() {
		//1. Configura��o
		Conta conta = new Conta("0054 - 67291", "Hector Farias");
		double valorADepositar = 150.00;
		double saldoInicial = conta.getSaldo();
		
		//2. Execu��o
		conta.depositar(valorADepositar);
		
		//3. Valida��o / Asser��o
		assertEquals(valorADepositar, conta.getSaldo() - saldoInicial);
	}
	
	@Test
	void sacar_um_valor_em_conta() {
		//1. Configura��o
		Conta conta = new Conta("0263 - 27002", "Joaquim Mathias");
		double valorSacado;
		double saldoInicial = conta.getSaldo();
		
		//2. Execu��o
		valorSacado = conta.sacar(100);
		
		//3. Valida��o / Asser��o
		assertEquals(valorSacado, saldoInicial - conta.getSaldo());
	}
	
	/*@Test
	void sacar_um_valor_em_conta() {
		//1. Configura��o
		Conta conta = new Conta("0934 - 73648", "Geraldo Manzotti", 500.00);
		double saldoInicial = conta.getSaldo();
		double valorSacado = 100.00;
		
		//2. Execu��o
		conta.sacar(valorSacado);
		
		//3. Valida��o / Asser��o
		assertEquals(valorSacado, saldoInicial - conta.getSaldo());
	}*/
	
	@Test
	void transferir_dinheiro_para_outra_conta() {
		//1. Configura��o
		Conta conta = new Conta("0934 - 73648", "Geraldo Manzotti", 500.00);
		Conta outraConta = new Conta("0576 - 83471", "Lu�sa Damasceno", 450.00);
		double valor = 100.00;
				
		//2. Execu��o
		conta.transferirPara(outraConta, valor);
				
		//3. Valida��o / Asser��o
		assertEquals(400.00, conta.getSaldo());
		assertEquals(550.00, outraConta.getSaldo());	
	}
}
