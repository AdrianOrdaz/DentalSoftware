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

public class AgregarPromocion extends MetodosDiseño implements ActionListener{

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
					AgregarPromocion frame = new AgregarPromocion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected AgregarPromocion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbAgregarPromocion = new JLabel("Agregar una promoci\u00F3n");
		lbAgregarPromocion.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbAgregarPromocion = new GridBagConstraints();
		adjustComponents(gbc_lbAgregarPromocion,0,0,4,1,0.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbAgregarPromocion, gbc_lbAgregarPromocion);
		
		JLabel lbCompleteCampos = new JLabel("Complete obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 16));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		adjustComponents(gbc_lbCompleteCampos,0,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		JLabel lbIdPromocion = new JLabel("Id de la promoci\u00F3n*:");
		lbIdPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbIdPromocion = new GridBagConstraints();
		adjustComponents(gbc_lbIdPromocion,1,2,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbIdPromocion, gbc_lbIdPromocion);
		
		jtIdPromocion = new JTextField();
		GridBagConstraints gbc_jtIdPromocion = new GridBagConstraints();
		adjustTextField(jtIdPromocion,gbc_jtIdPromocion,contentPane,2,2,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbNombrePromocion = new JLabel("Nombre de la promoci\u00F3n*:");
		lbNombrePromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombrePromocion = new GridBagConstraints();
		adjustComponents(gbc_lbNombrePromocion,1,3,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbNombrePromocion, gbc_lbNombrePromocion);
		
		jtNombrePromocion = new JTextField();
		GridBagConstraints gbc_jtNombrePromocion = new GridBagConstraints();
		adjustTextField(jtNombrePromocion,gbc_jtNombrePromocion,contentPane,2,3,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbCostoPromocion = new JLabel("Costo de la promoci\u00F3n*:");
		lbCostoPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoPromocion = new GridBagConstraints();
		adjustComponents(gbc_lbCostoPromocion,1,4,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbCostoPromocion, gbc_lbCostoPromocion);
		
		jtCostoPromocion = new JTextField();
		GridBagConstraints gbc_jtCostoPromocion = new GridBagConstraints();
		adjustTextField(jtCostoPromocion,gbc_jtCostoPromocion,contentPane,2,4,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbCostoSeparado = new JLabel("Costo de los servicios por separado*:");
		lbCostoSeparado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoSeparado = new GridBagConstraints();
		adjustComponents(gbc_lbCostoSeparado,1,5,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbCostoSeparado, gbc_lbCostoSeparado);
		
		jtCostoSeparado = new JTextField();
		GridBagConstraints gbc_jtCostoSeparado = new GridBagConstraints();
		adjustTextField(jtCostoSeparado,gbc_jtCostoSeparado,contentPane,2,5,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbDineroAhorrado = new JLabel("Dinero que se ahorra*:");
		lbDineroAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDineroAhorrado = new GridBagConstraints();
		adjustComponents(gbc_lbDineroAhorrado,1,6,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbDineroAhorrado, gbc_lbDineroAhorrado);
		
		jtDineroAhorrado = new JTextField();
		GridBagConstraints gbc_jtDineroAhorrado = new GridBagConstraints();
		adjustTextField(jtDineroAhorrado,gbc_jtDineroAhorrado,contentPane,2,6,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbPorcentajeAhorrado = new JLabel("Porcentaje que se ahorra*:");
		lbPorcentajeAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbPorcentajeAhorrado = new GridBagConstraints();
		adjustComponents(gbc_lbPorcentajeAhorrado,1,7,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbPorcentajeAhorrado, gbc_lbPorcentajeAhorrado);
		
		jtPorcentajeAhorrado = new JTextField();
		GridBagConstraints gbc_jtPorcentajeAhorrado = new GridBagConstraints();
		adjustTextField(jtPorcentajeAhorrado,gbc_jtPorcentajeAhorrado,contentPane,2,7,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JLabel lbTerminos = new JLabel("T\u00E9rminos y Condiciones*:");
		lbTerminos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTerminos = new GridBagConstraints();
		adjustComponents(gbc_lbTerminos,1,8,1,1,1.0,0.0,GridBagConstraints.WEST);
		contentPane.add(lbTerminos, gbc_lbTerminos);
		
		jtTerminos = new JTextField();
		GridBagConstraints gbc_jtTerminos = new GridBagConstraints();
		adjustTextField(jtTerminos,gbc_jtTerminos,contentPane,2,8,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,0,9,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		buttonRegresar(new Promociones(),this,new GridBagConstraints(),contentPane,3,9,1,1,0.0,1.0,GridBagConstraints.WEST);
		buttonHome(this,true,new GridBagConstraints(),contentPane,3,9,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
