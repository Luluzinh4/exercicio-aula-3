package br.edu.ifsp.spo.lp1a3.sp3013022.aula3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.sp3013022.aula3.*;

class ContaCorrenteTests {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	void criar_uma_nova_conta() {
		//1. Configuração
		String numeroConta = "0034 - 89732";
		String titular = "Isadora Ferreira";
		double limiteCheque = 500.00;
		
		//2. Execução
		ContaCorrente conta = new ContaCorrente(numeroConta, titular, limiteCheque);
		
		//3. Validação / Asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(limiteCheque, conta.getLimiteChequeEspecial());
		assertEquals(13, ContaCorrente.getTaxaJurosChequeEspecial());
	}
	
	@Test
	void criar_conta_com_saldo_inicial() {
		//1. Configuração
		String numeroConta = "0034 - 89732";
		String titular = "Isadora Ferreira";
		double saldoInicial = 200.00;
		double limiteCheque = 500.00;
				
		//2. Execução
		ContaCorrente conta = new ContaCorrente(numeroConta, titular, saldoInicial, limiteCheque);
		
		//3. Validação / Asserção
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroDaConta());
		assertEquals(saldoInicial, conta.getSaldo());
		assertEquals(limiteCheque, conta.getLimiteChequeEspecial());
		assertEquals(13, ContaCorrente.getTaxaJurosChequeEspecial());
	}
	
	@Test
	void sacar_valor_da_conta() {
		//1. Configuração
		ContaCorrente conta = new ContaCorrente("0087 - 86326", "Giulia Oliveira", 200.00, 100.00);
		double valorASacar = 150.00;
		double saldoInicial = conta.getSaldo();
		
		//2. Execução
		conta.sacar(valorASacar);
		
		//3. Validação / Asserção
		assertEquals(valorASacar, saldoInicial - (conta.getSaldo() + valorASacar * 0.01)); 
	}
	
	@Test
	void sacar_valor_da_conta_usando_cheque_especial() {
		//1. Configuração
		ContaCorrente conta = new ContaCorrente("0298 - 72487", "Juliana Hortelo", 300.00, 100.00);
		double valorASacar = 350.00;
		double saldoInicial = conta.getSaldo();
		double taxaJuros = ContaCorrente.getTaxaJurosChequeEspecial()/100;
		
		//2. Execução
		conta.sacar(valorASacar);
		
		//3. Validação / Asserção
		assertEquals(valorASacar, saldoInicial - ((conta.getSaldo() + valorASacar * 0.01 - ((saldoInicial - valorASacar * 1.01) * taxaJuros))));
	}
	
	@Test
	void tentar_sacar_sem_limite_de_cheque_especial() {
		//1. Configuração
		ContaCorrente conta = new ContaCorrente("0023 - 98647", "Heitor Barcellos", 100.00, 0);
		double valorASacar = 150.00;
		double saldoInicial = conta.getSaldo();
		
		//2. Execução
		conta.sacar(valorASacar);
		
		//3. Validação / Asserção
		assertEquals(saldoInicial, conta.getSaldo());
	}

}
