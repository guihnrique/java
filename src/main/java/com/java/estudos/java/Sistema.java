package com.java.estudos.java;

import java.util.Scanner;

public class Sistema {

	public int start() {
		// TODO implementação pendente

		// aqui inicia o sistema, exibe um menu
		// a partir da opção escolhida no menu, chama uma funcionalidade

		Scanner entradaTexto = new Scanner(System.in);
		int opcao;

			System.out.println("\n\n### Cadastro Escola JAVA ###");
			System.out.println("============================");
			System.out.println("|     1 - Alunos		  	|");
			System.out.println("|     2 - Funcionários      |");
			System.out.println("|     3 - Turma	        	|");
			System.out.println("|     0 - Sair          	|");
			System.out.println("============================\n");

			System.out.println("Digite a opção desejada: \n");
			opcao = entradaTexto.nextInt();

			if(opcao == 1){
				System.out.println("\n\n### Cadastro Escola JAVA - Alunos ###");
				System.out.println("============================");
				System.out.println("|     1 - Cadastrar Aluno	|");
				System.out.println("|     2 - Alterar Aluno     |");
				System.out.println("|     3 - Excluir Aluno	    |");
				System.out.println("|     4 - Listar Alunos     |");
				System.out.println("|     9 - Voltar		    |");
				System.out.println("|     0 - Sair              |");
				System.out.println("============================\n");
				System.out.print("\n");
			}

		// sugestão: sistema de escola com opções:
		// cadastrar aluno
		// alterar aluno
		// excluir aluno
		// listar alunos

		// cadastrar aluno supletivo
		// alterar aluno supletivo
		// excluir aluno supletivo
		// listar alunos supletivo

		// cadastrar professor
		// alterar professor
		// excluir professor
		// listar professores

		// cadastrar funcionário
		// alterar funcionário
		// excluir funcionário
		// listar funcionários

		return 0;
	}
	
}
