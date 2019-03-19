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
		//1 Configuração
		String titular = "Marilda Fernades";
		String numeroConta = "0234 - 86243";
		double saldoInicial = 400.00;
		
		//2. Execução
		Conta conta = new Conta(numeroConta, titular, saldoInicial);
		
		//3. Validação
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(saldoInicial, conta.getSaldo());
	}

}
