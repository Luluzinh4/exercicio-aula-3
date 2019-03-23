package br.edu.ifsp.spo.lp1a3.sp3013022.aula3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.*;

class ContaPoupancaTests {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

	@Test
	void criar_uma_conta_poupanca() {
		//1. Configura��o
		String numeroConta = "0478 - 92005";
		String titular = "Ana L�cia Guimar�es";
		
		//2. Execu��o
		ContaPoupanca conta = new ContaPoupanca(numeroConta, titular);
		
		//3. Valida��o / Asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(0.4, ContaPoupanca.getTaxaRendimento());
	}
	
	@Test
	void criar_uma_conta_poupanca_com_saldo_inicial() {
		//1. Configura��o
		String numeroConta = "1897 - 83643";
		String titular = "Sabrina Carpenter";
		double saldoInicial = 300.00;
		
		//2. Execu��o
		ContaPoupanca conta = new ContaPoupanca(numeroConta, titular, saldoInicial);
				
		//3. Valida��o / Asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(saldoInicial, conta.getSaldo());
		assertEquals(0.4, ContaPoupanca.getTaxaRendimento());
	}
	
	@Test
	void aplicar_rendimento_em_conta() {
		//1. Configura��o
		ContaPoupanca conta = new ContaPoupanca("0093 - 29355", "Camila Figueiredo", 400.00);
		double saldoInicial = conta.getSaldo();
		double rendimento = ContaPoupanca.getTaxaRendimento() / 100;
		
		//2. Execu��o
		conta.aplicarRendimento();
		
		//3. Valida��o / Asser��o
		assertEquals(saldoInicial * (1 + rendimento), conta.getSaldo());
	}
}
