package consultorioDental;

import javax.swing.*;

public class MenuPrincipal {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Principal");
		JLabel jl = new JLabel("ok esta bien");
		System.out.println("Seguro?");
		System.out.print("HOLA FER");
		System.out.print("Hola a todos");
		System.out.print("Kevin");
		System.out.print("Kevin2");
		frame.add(jl);
		frame.setVisible(true);
		frame.setSize(100,50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void  crearMenu()
	{
		System.out.print("Aquí voy a crear el menu");
	}
}
