package model;

import javax.swing.JOptionPane;

public class Dono {
	String nome;
	String CPF;
	Cachorro cao;
	
	
	Dono(Cachorro cao){
		this.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		this.CPF = JOptionPane.showInputDialog(null, "Digite seu CPF ");
		this.cao = cao;
	}


	@Override
	public String toString() {
		return "Dono [nome=" + nome + ", CPF=" + CPF + ", cao=" + cao + "]";
	}

	

	
}
