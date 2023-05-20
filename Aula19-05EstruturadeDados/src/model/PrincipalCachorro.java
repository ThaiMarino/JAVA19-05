package model;

import javax.swing.JOptionPane;

public class PrincipalCachorro {
	public static void main(String arg[]) {
		Cachorro cao1 = new Cachorro();
		JOptionPane.showMessageDialog(null, cao1);
		
		//Cachorro cao2 = new Cachorro();
		//JOptionPane.showMessageDialog(null, cao2);
		
		Dono dono = new Dono(cao1);
		JOptionPane.showMessageDialog(null, dono);
	}

}
