package consultorioDental;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AgregarServicio extends MetodosDiseño implements ActionListener {

	private JPanel contentPane;
	private JTextField jtNombreServicio;
	private JTextField jtCostoServicio;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarServicio frame = new AgregarServicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected AgregarServicio() {
		setTitle("Consultorio Dental/Servicios/Agregar Servicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbAgregarServicio = new JLabel("Agregar un servicio");
		lbAgregarServicio.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbAgregarServicio = new GridBagConstraints();
		adjustComponents(gbc_lbAgregarServicio,0,0,4,1,0.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbAgregarServicio, gbc_lbAgregarServicio);
		
		JLabel lbCompleteCampos = new JLabel("Complete obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 14));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		adjustComponents(gbc_lbCompleteCampos,0,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		JLabel lbNombreServicio = new JLabel("Nombre del servicio*:");
		lbNombreServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombreServicio = new GridBagConstraints();
		adjustComponents(gbc_lbNombreServicio,0,3,4,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbNombreServicio, gbc_lbNombreServicio);
		
		jtNombreServicio = new JTextField();
		adjustTextField(jtNombreServicio,new GridBagConstraints(),contentPane,0,3,4,1,0.0,.0,GridBagConstraints.CENTER);		
		
		JLabel lbCostoServicio = new JLabel("Costo del servicio*:");
		lbCostoServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoServicio = new GridBagConstraints();
		adjustComponents(gbc_lbCostoServicio,0,4,4,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbCostoServicio, gbc_lbCostoServicio);
		
		jtCostoServicio = new JTextField();
		adjustTextField(jtCostoServicio,new GridBagConstraints(),contentPane,0,4,4,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,0,5,4,1,1.0,1.0,GridBagConstraints.CENTER);
		buttonRegresar(new Servicios(),this,new GridBagConstraints(),contentPane,1,6,1,1,1.0,1.0,GridBagConstraints.CENTER);
		buttonHome(this,true,new GridBagConstraints(),contentPane,2,6,1,1,0.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		subirFilaCol2("servicios","nom_serv","cos_serv",jtNombreServicio.getText(),jtCostoServicio.getText());
		jtNombreServicio.setText("");
		jtCostoServicio.setText("");
	}
}
