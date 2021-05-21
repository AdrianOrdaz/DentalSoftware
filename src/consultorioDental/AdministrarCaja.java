package consultorioDental;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministrarCaja extends MetodosDiseño implements ActionListener {
	JFrame fCR;
	public static void main(String[] args) {
		AdministrarCaja fg = new AdministrarCaja(); //nombre del archivo
		fg.CrearGui();
	}

	protected  JFrame CrearGui() {
		fCR = new JFrame("Administrar Caja");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Administrar caja");
		lbTitulo.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		adjustComponents(gbc_lbTitulo,0,0,4,1,1.0,1.0,GridBagConstraints.NORTH);
		con.add(lbTitulo, gbc_lbTitulo);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		JButton btnTransaccion = new JButton("Transaccion");
		btnTransaccion.setFont(new Font("Arial",Font.PLAIN,30));
		adjustButton(btnTransaccion,c,con,1,2,1,1,1.0,1.0,GridBagConstraints.CENTER);
		btnTransaccion.addActionListener(this);
		
		JButton btnCorteCaja = new JButton("Corte de caja");
		btnCorteCaja.setFont(new Font("Arial",Font.PLAIN,30));
		adjustButton(btnCorteCaja,c,con,2,2,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnMovExtra = new JButton("<html>Movimiento<br>extraordinario</html>");
		btnMovExtra.setFont(new Font("Arial",Font.PLAIN,30));
		adjustButton(btnMovExtra,c,con,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		c.fill = GridBagConstraints.NONE;
		buttonHome(fCR,false,c,con,1,3,4,1,1.0,1.0,GridBagConstraints.CENTER);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		return fCR;
	}

	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Transaccion":
				Transaccion tran = new Transaccion();
				tran.crearTransaccionGUI();
				fCR.setVisible(false);
			break;
		}
	}

}
