package consultorioDental;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgregarPromocion extends MetodosDiseño implements ActionListener{

	private JPanel contentPane;
	private JTextField jtServicioPromocion;
	private JTextField jtCostoPromocion;
	private JTextField jtCostoSeparado;
	private JTextField jtDineroAhorrado;
	private JTextField jtPorcentajeAhorrado;
	private JTextField jtTerminos;
	private JTextField jtDiasPromocion;
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
		setTitle("Consultorio Dental/Promociones/Agregar Promocion");
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
	
		JLabel lbServicioPromocion = new JLabel("Servicio de la promoci\u00F3n*:");
		lbServicioPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbServicioPromocion = new GridBagConstraints();
		adjustComponents(gbc_lbServicioPromocion,1,2,1,1,1.0,1.0,GridBagConstraints.EAST);
		contentPane.add(lbServicioPromocion, gbc_lbServicioPromocion);
		
		jtServicioPromocion = new JTextField();
		GridBagConstraints gbc_jtServicioPromocion = new GridBagConstraints();
		adjustTextField(jtServicioPromocion,gbc_jtServicioPromocion,contentPane,2,2,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbDiasPromocion= new JLabel("Dia/s en que aplica la promoci\u00F3n*:");
		lbDiasPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDiasPromocion= new GridBagConstraints();
		adjustComponents(gbc_lbDiasPromocion,1,3,1,1,1.0,1.0,GridBagConstraints.EAST);
		contentPane.add(lbDiasPromocion, gbc_lbDiasPromocion);
		
		jtDiasPromocion = new JTextField();
		GridBagConstraints gbc_jtDiasPromocion = new GridBagConstraints();
		adjustTextField(jtDiasPromocion,gbc_jtDiasPromocion,contentPane,2,3,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbCostoPromocion = new JLabel("Costo de la promoci\u00F3n*:");
		lbCostoPromocion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoPromocion = new GridBagConstraints();
		adjustComponents(gbc_lbCostoPromocion,1,4,1,1,1.0,0.0,GridBagConstraints.EAST);
		contentPane.add(lbCostoPromocion, gbc_lbCostoPromocion);
		
		jtCostoPromocion = new JTextField();
		GridBagConstraints gbc_jtCostoPromocion = new GridBagConstraints();
		adjustTextField(jtCostoPromocion,gbc_jtCostoPromocion,contentPane,2,4,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbCostoSeparado = new JLabel("Costo del servicio por separado*:");
		lbCostoSeparado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoSeparado = new GridBagConstraints();
		adjustComponents(gbc_lbCostoSeparado,1,5,1,1,1.0,0.0,GridBagConstraints.EAST);
		contentPane.add(lbCostoSeparado, gbc_lbCostoSeparado);
		
		jtCostoSeparado = new JTextField();
		GridBagConstraints gbc_jtCostoSeparado = new GridBagConstraints();
		adjustTextField(jtCostoSeparado,gbc_jtCostoSeparado,contentPane,2,5,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbDineroAhorrado = new JLabel("Dinero que se ahorra*:");
		lbDineroAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDineroAhorrado = new GridBagConstraints();
		adjustComponents(gbc_lbDineroAhorrado,1,6,1,1,1.0,0.0,GridBagConstraints.EAST);
		contentPane.add(lbDineroAhorrado, gbc_lbDineroAhorrado);
		
		jtDineroAhorrado = new JTextField();
		GridBagConstraints gbc_jtDineroAhorrado = new GridBagConstraints();
		adjustTextField(jtDineroAhorrado,gbc_jtDineroAhorrado,contentPane,2,6,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbPorcentajeAhorrado = new JLabel("Porcentaje que se ahorra*:");
		lbPorcentajeAhorrado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbPorcentajeAhorrado = new GridBagConstraints();
		adjustComponents(gbc_lbPorcentajeAhorrado,1,7,1,1,1.0,0.0,GridBagConstraints.EAST);
		contentPane.add(lbPorcentajeAhorrado, gbc_lbPorcentajeAhorrado);
		
		jtPorcentajeAhorrado = new JTextField();
		GridBagConstraints gbc_jtPorcentajeAhorrado = new GridBagConstraints();
		adjustTextField(jtPorcentajeAhorrado,gbc_jtPorcentajeAhorrado,contentPane,2,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbTerminos = new JLabel("T\u00E9rminos y Condiciones*:");
		lbTerminos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTerminos = new GridBagConstraints();
		adjustComponents(gbc_lbTerminos,1,8,1,1,1.0,0.0,GridBagConstraints.EAST);
		contentPane.add(lbTerminos, gbc_lbTerminos);
		
		jtTerminos = new JTextField();
		GridBagConstraints gbc_jtTerminos = new GridBagConstraints();
		adjustTextField(jtTerminos,gbc_jtTerminos,contentPane,2,8,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,2,9,1,1,1.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		buttonRegresar(new Promociones(),this,new GridBagConstraints(),contentPane,3,9,1,1,0.0,1.0,GridBagConstraints.WEST);
		buttonHome(this,true,new GridBagConstraints(),contentPane,3,9,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		pack();
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		subirFilaCol7("promociones","serv_prom","das_prom","term_prom","indiv_prom","junt_prom","porc_prom","ahorr_prom",
			jtServicioPromocion.getText(),jtDiasPromocion.getText(),jtTerminos.getText(),jtCostoSeparado.getText(),jtCostoPromocion.getText(),jtPorcentajeAhorrado.getText(),jtDineroAhorrado.getText());
		emptyJT(jtServicioPromocion,jtDiasPromocion,jtTerminos,jtCostoSeparado,jtCostoPromocion,jtPorcentajeAhorrado,jtDineroAhorrado,new JTextField());
	}
}
