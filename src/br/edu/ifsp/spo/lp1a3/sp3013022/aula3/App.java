package br.edu.ifsp.spo.lp1a3.sp3013022.aula3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		
		String nomeTitular;
		String numConta;
		double saldoInicial;
		double saldoChequeEspecial;
//		int auxiliar;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o nome do titular: ");
		nomeTitular = ler.nextLine();
		
		System.out.print("Digite o número da conta: ");
		numConta = ler.nextLine();
		
		System.out.print("Digite o saldo inicial: ");
		saldoInicial = ler.nextDouble();
		
		System.out.print("Insira o limite da cheque especial: ");
		saldoChequeEspecial = ler.nextDouble();
		
		Conta cc = new ContaCorrente(numConta, nomeTitular, saldoInicial, saldoChequeEspecial);
		
		System.out.println(cc.getTitular());
		
//		System.out.println("Bem Vindo ao Banco XPTO!");
//		System.out.println("Se você deseja se cadastrar, digite 1: ");
		// Há um problema. Indicar qual é o problema, o por quê do problema e como corrigí-lo
		// Não é um problema da Orientação, mas pode arrumar com isso com Orientação
		// Se souber, mandar um email para ele
		

	}

}
