package br.edu.ifsp.spo.lp1a3.sp3013022.aula3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.*;

class ContaTests {
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
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
	
	@Test
	void sacar_um_valor_em_conta() {
		//1. Configuração
		Conta conta = new Conta("0263 - 27002", "Joaquim Mathias");
		double valorSacado;
		double saldoInicial = conta.getSaldo();
		
		//2. Execução
		valorSacado = conta.sacar(100);
		
		//3. Validação / Asserção
		assertEquals(valorSacado, saldoInicial - conta.getSaldo());
	}
	
	/*@Test
	void sacar_um_valor_em_conta() {
		//1. Configuração
		Conta conta = new Conta("0934 - 73648", "Geraldo Manzotti", 500.00);
		double saldoInicial = conta.getSaldo();
		double valorSacado = 100.00;
		
		//2. Execução
		conta.sacar(valorSacado);
		
		//3. Validação / Asserção
		assertEquals(valorSacado, saldoInicial - conta.getSaldo());
	}*/
	
	@Test
	void transferir_dinheiro_para_outra_conta() {
		//1. Configuração
		Conta conta = new Conta("0934 - 73648", "Geraldo Manzotti", 500.00);
		Conta outraConta = new Conta("0576 - 83471", "Luísa Damasceno", 450.00);
		double valor = 100.00;
				
		//2. Execução
		conta.transferirPara(outraConta, valor);
				
		//3. Validação / Asserção
		assertEquals(400.00, conta.getSaldo());
		assertEquals(550.00, outraConta.getSaldo());	
	}
	
	@Test
	void verificar_toString() {
		//1. Configuração
		Conta conta = new Conta("0009 - 87549", "Gabriela Cantiffi");
		String resultado = null;
		
		//2. Execução
		resultado = conta.toString();
		
		//3. Validação / Asserção
		assertNotNull(resultado);
	}
	
	@Test
	void verificar_equals_false() {
		//1. Configuração
		Conta conta = new Conta("1923 - 89462", "Giovanna Sobrero");
		ContaCorrente outraConta = new ContaCorrente("9834 - 87264", "Suzana Jerimum", 540.00);
		boolean resultado;
		
		//2. Execução
		resultado = conta.equals(outraConta);
		
		//3. Validação / Asserção
		assertFalse(resultado); 
	}
	
	@Test
	void verificar_equals_true() {
		//1. Configuração
		Conta conta = new Conta("0357 - 78674", "Carlos Andrade");
		Conta outraConta = new Conta("0357 - 78674", "Carlos Andrade");
		
		//2. Execução
		boolean resultado1 = conta.equals(outraConta);
		boolean resultado2 = outraConta.equals(conta);
		
		//3. Validação / Asserção
		assertTrue(resultado1);
		assertTrue(resultado2);
	}
}
