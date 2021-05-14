package consultorioDental;

import javax.swing.*;

public class MenuPrincipal {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Principal");
		JLabel jl = new JLabel("ok esta bien");
		frame.add(jl);
		frame.setVisible(true);
		frame.setSize(100,50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
