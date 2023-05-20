package model;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		System.out.println("Testando mensagem.");
		
		// Integer e Float trazem funções prontas para as classes
		int idade;
		float peso;
		char primeiraLetra;
		boolean temFilhos;
		Integer idade2;
		Float peso2;
		
		String nome;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.print("Digite sua idade: ");
		idade = input.nextInt();
		
		System.out.println("Seu nome é "+ nome);
		System.out.println("Sua idade é "+ idade);
		
	}
	 
		
	
}
