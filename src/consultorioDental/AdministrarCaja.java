package consultorioDental;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AdministrarCaja extends MetodosDiseño implements ActionListener {
	JFrame fCR;
	public static void main(String[] args) {
		AdministrarCaja fg = new AdministrarCaja(); //nombre del archivo
		fg.CrearGui();
	}

<<<<<<< HEAD
	void CrearGui() {
		JFrame fCR = new JFrame("Administrar Caja");
=======
	protected  JFrame CrearGui() {
		fCR = new JFrame("Administrar Caja");
>>>>>>> refs/heads/MetodosBD
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Administrar caja");
		lbTitulo.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		adjustComponents(gbc_lbTitulo,0,0,3,1,1.0,1.0,GridBagConstraints.NORTH);
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
		btnCorteCaja.addActionListener(this);
		
		c.fill = GridBagConstraints.NONE;
		buttonHome(fCR,false,c,con,1,3,4,1,1.0,1.0,GridBagConstraints.CENTER);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
<<<<<<< HEAD
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{100, 0, 230, 298, 230, 105, 0, 0};
		gbl_contentPane.rowHeights = new int[]{96, 0, 180, 62, 121, 85, 53, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		con.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Administrar caja");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		con.add(lbTitulo, gbc_lbTitulo);
		
		//Queeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
	//	JButton btnGenerarRecibo = new JButton("Generar recibo");
	//	btnGenerarRecibo.setFont(new Font("Tahoma", Font.PLAIN, 29));
	//	GridBagConstraints gbc_btnGenerarRecibo = new GridBagConstraints();
	//	gbc_btnGenerarRecibo.fill = GridBagConstraints.BOTH;//este tiene que ir primero
	//	adjustButton(btnGenerarRecibo, gbc_btnGenerarRecibo,con,2,3,1,1,0.0,0.0,GridBagConstraints.CENTER);
	//	btnGenerarRecibo.addMouseListener(new MouseAdapter() {
	//		public void mouseClicked(MouseEvent e) {
	//			Recibo rb = new Recibo();
	//			rb.crearGUI();
	//			fCR.setVisible(false);
	//		}
	//	});
		
		JButton btnCorteCaja = new JButton("Corte de caja");
		btnCorteCaja.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnCorteCaja = new GridBagConstraints();
		gbc_btnCorteCaja.fill = GridBagConstraints.BOTH;
		adjustButton(btnCorteCaja, gbc_btnCorteCaja,con,2,5,1,1,0.0,0.0,GridBagConstraints.CENTER);
		btnCorteCaja.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CorteDeCaja cdc = new CorteDeCaja();
				cdc.CrearGui();
				fCR.setVisible(false);
			}
		});

		
		JButton btnTransaccion = new JButton("Transaccion");
		btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
		gbc_btnTransaccion.fill = GridBagConstraints.BOTH;
		adjustButton(btnTransaccion, gbc_btnTransaccion,con,3,3,1,1,0.0,0.0,GridBagConstraints.CENTER);
		btnTransaccion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Transaccion tr = new Transaccion();
				tr.CrearTransaccionGUI();
				fCR.setVisible(false);
			}
		});
		
		JButton btnMovExtra = new JButton("<html>Movimiento<br>extraordinario</html");
		btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
		gbc_btnMovExtra.fill = GridBagConstraints.BOTH;
		gbc_btnMovExtra.insets = new Insets(0, 0, 5, 5);
		adjustButton(btnMovExtra, gbc_btnMovExtra,con,4,5,1,1,0.0,0.0,GridBagConstraints.CENTER);
		btnMovExtra.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MovimientoExtraordinario movextra = new MovimientoExtraordinario();
				movextra.CrearGui();
				fCR.setVisible(false);
			}
		});
		

		
		buttonHome(fCR,false,new GridBagConstraints(),con,6,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		fCR.revalidate();
		fCR.repaint();
=======
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
			case "Corte de caja":
				CorteDeCaja cdc = new CorteDeCaja();
				cdc.CrearGui();
				fCR.setVisible(false);
			break;
		}
>>>>>>> refs/heads/MetodosBD
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		switch(e.getActionCommand()) //el switch hace llamar a la funcion concatenar
		{
			case "k":
				System.out.println("hola");
				break;
		}
	}

}