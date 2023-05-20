package model;

import javax.swing.JOptionPane;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	float peso;
	
	Cachorro(){
		this.nome = JOptionPane.showInputDialog(null, "Digite o nome do seu cão: ");
		this.peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso do cão: "));
		this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do cão: "));
		this.raca = JOptionPane.showInputDialog(null, "Digite a raça do cão: ");
	}
	
	
	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + "]";
	}
	

}
