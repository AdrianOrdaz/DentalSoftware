package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class agregarpromocion extends metodosDiseño implements ActionListener{

	private JPanel contentPane;
	private JTextField jtIdPromocion;
	private JTextField jtNombrePromocion;
	private JTextField jtCostoPromocion;
	private JTextField jtCostoSeparado;
	private JTextField jtDineroAhorrado;
	private JTextField jtPorcentajeAhorrado;
	private JTextField jtTerminos;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarpromocion frame = new agregarpromocion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected agregarpromocion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);;
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screen.width,screen.height - 30);
		this.setExtendedState(MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 77, 45, 0, 44, 41, 44, 45, 54, 44, 88, 112, 54, 21, 0, 0, 44, 0, 45, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbAgregarPromocion = new JLabel("Agregar una promoci\u00F3n");
		lbAgregarPromocion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lbAgregarPromocion = new GridBagConstraints();
		gbc_lbAgregarPromocion.anchor = GridBagConstraints.WEST;
		gbc_lbAgregarPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbAgregarPromocion.gridx = 2;
		gbc_lbAgregarPromocion.gridy = 2;
		contentPane.add(lbAgregarPromocion, gbc_lbAgregarPromocion);
		

		
		JLabel lbCompleteCampos = new JLabel("Complete obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 16));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		gbc_lbCompleteCampos.anchor = GridBagConstraints.WEST;
		gbc_lbCompleteCampos.insets = new Insets(0, 0, 5, 5);
		gbc_lbCompleteCampos.gridx = 2;
		gbc_lbCompleteCampos.gridy = 3;
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		JLabel lbIdPromocion = new JLabel("Id de la promoci\u00F3n*:");
		lbIdPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbIdPromocion = new GridBagConstraints();
		gbc_lbIdPromocion.anchor = GridBagConstraints.EAST;
		gbc_lbIdPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdPromocion.gridx = 1;
		gbc_lbIdPromocion.gridy = 5;
		contentPane.add(lbIdPromocion, gbc_lbIdPromocion);
		
		jtIdPromocion = new JTextField();
		jtIdPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtIdPromocion = new GridBagConstraints();
		gbc_jtIdPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtIdPromocion.gridx = 2;
		gbc_jtIdPromocion.gridy = 5;
		contentPane.add(jtIdPromocion, gbc_jtIdPromocion);
		jtIdPromocion.setColumns(10);
		
		JLabel lbNombrePromocion = new JLabel("Nombre de la promoci\u00F3n*:");
		lbNombrePromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombrePromocion = new GridBagConstraints();
		gbc_lbNombrePromocion.anchor = GridBagConstraints.EAST;
		gbc_lbNombrePromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbNombrePromocion.gridx = 1;
		gbc_lbNombrePromocion.gridy = 6;
		contentPane.add(lbNombrePromocion, gbc_lbNombrePromocion);
		
		jtNombrePromocion = new JTextField();
		jtNombrePromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtNombrePromocion = new GridBagConstraints();
		gbc_jtNombrePromocion.insets = new Insets(0, 0, 5, 5);
		gbc_jtNombrePromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtNombrePromocion.gridx = 2;
		gbc_jtNombrePromocion.gridy = 6;
		contentPane.add(jtNombrePromocion, gbc_jtNombrePromocion);
		jtNombrePromocion.setColumns(10);
		
		JLabel lbCostoPromocion = new JLabel("Costo de la promoci\u00F3n*:");
		lbCostoPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoPromocion = new GridBagConstraints();
		gbc_lbCostoPromocion.anchor = GridBagConstraints.EAST;
		gbc_lbCostoPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbCostoPromocion.gridx = 1;
		gbc_lbCostoPromocion.gridy = 7;
		contentPane.add(lbCostoPromocion, gbc_lbCostoPromocion);
		
		jtCostoPromocion = new JTextField();
		jtCostoPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtCostoPromocion = new GridBagConstraints();
		gbc_jtCostoPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_jtCostoPromocion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtCostoPromocion.gridx = 2;
		gbc_jtCostoPromocion.gridy = 7;
		contentPane.add(jtCostoPromocion, gbc_jtCostoPromocion);
		jtCostoPromocion.setColumns(10);
		
		JLabel lbCostoSeparado = new JLabel("Costo de los servicios por separado*:");
		lbCostoSeparado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoSeparado = new GridBagConstraints();
		gbc_lbCostoSeparado.anchor = GridBagConstraints.WEST;
		gbc_lbCostoSeparado.insets = new Insets(0, 0, 5, 5);
		gbc_lbCostoSeparado.gridx = 1;
		gbc_lbCostoSeparado.gridy = 8;
		contentPane.add(lbCostoSeparado, gbc_lbCostoSeparado);
		
		jtCostoSeparado = new JTextField();
		jtCostoSeparado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtCostoSeparado = new GridBagConstraints();
		gbc_jtCostoSeparado.insets = new Insets(0, 0, 5, 5);
		gbc_jtCostoSeparado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtCostoSeparado.gridx = 2;
		gbc_jtCostoSeparado.gridy = 8;
		contentPane.add(jtCostoSeparado, gbc_jtCostoSeparado);
		jtCostoSeparado.setColumns(10);
		
		JLabel lbDineroAhorrado = new JLabel("Dinero que se ahorra*:");
		lbDineroAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDineroAhorrado = new GridBagConstraints();
		gbc_lbDineroAhorrado.anchor = GridBagConstraints.EAST;
		gbc_lbDineroAhorrado.insets = new Insets(0, 0, 5, 5);
		gbc_lbDineroAhorrado.gridx = 1;
		gbc_lbDineroAhorrado.gridy = 9;
		contentPane.add(lbDineroAhorrado, gbc_lbDineroAhorrado);
		
		jtDineroAhorrado = new JTextField();
		jtDineroAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtDineroAhorrado = new GridBagConstraints();
		gbc_jtDineroAhorrado.insets = new Insets(0, 0, 5, 5);
		gbc_jtDineroAhorrado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDineroAhorrado.gridx = 2;
		gbc_jtDineroAhorrado.gridy = 9;
		contentPane.add(jtDineroAhorrado, gbc_jtDineroAhorrado);
		jtDineroAhorrado.setColumns(10);
		
		JLabel lbPorcentajeAhorrado = new JLabel("Porcentaje que se ahorra*:");
		lbPorcentajeAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbPorcentajeAhorrado = new GridBagConstraints();
		gbc_lbPorcentajeAhorrado.anchor = GridBagConstraints.EAST;
		gbc_lbPorcentajeAhorrado.insets = new Insets(0, 0, 5, 5);
		gbc_lbPorcentajeAhorrado.gridx = 1;
		gbc_lbPorcentajeAhorrado.gridy = 10;
		contentPane.add(lbPorcentajeAhorrado, gbc_lbPorcentajeAhorrado);
		
		jtPorcentajeAhorrado = new JTextField();
		jtPorcentajeAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtPorcentajeAhorrado = new GridBagConstraints();
		gbc_jtPorcentajeAhorrado.insets = new Insets(0, 0, 5, 5);
		gbc_jtPorcentajeAhorrado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtPorcentajeAhorrado.gridx = 2;
		gbc_jtPorcentajeAhorrado.gridy = 10;
		contentPane.add(jtPorcentajeAhorrado, gbc_jtPorcentajeAhorrado);
		jtPorcentajeAhorrado.setColumns(10);
		
		JLabel lbTerminos = new JLabel("T\u00E9rminos y Condiciones*:");
		lbTerminos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTerminos = new GridBagConstraints();
		gbc_lbTerminos.anchor = GridBagConstraints.EAST;
		gbc_lbTerminos.insets = new Insets(0, 0, 5, 5);
		gbc_lbTerminos.gridx = 1;
		gbc_lbTerminos.gridy = 11;
		contentPane.add(lbTerminos, gbc_lbTerminos);
		
		jtTerminos = new JTextField();
		GridBagConstraints gbc_jtTerminos = new GridBagConstraints();
		gbc_jtTerminos.insets = new Insets(0, 0, 5, 5);
		gbc_jtTerminos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtTerminos.gridx = 2;
		gbc_jtTerminos.gridy = 11;
		contentPane.add(jtTerminos, gbc_jtTerminos);
		jtTerminos.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 3;
		gbc_btnAgregar.gridy = 17;
		contentPane.add(btnAgregar, gbc_btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 17;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		btnCancelar.addActionListener(this);
		
		buttonRegresar(new promociones(),this,new GridBagConstraints(),contentPane,1,17,1,1,0.0,0.0,GridBagConstraints.WEST);
		buttonHome(this,true,new GridBagConstraints(),contentPane,0,17,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Cancelar":
				promociones pro = new promociones();
				pro.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}
}
