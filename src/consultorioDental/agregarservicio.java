package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class agregarservicio extends metodosDiseño implements ActionListener {

	private JPanel contentPane;
	private JTextField jtIdServicio;
	private JTextField jtNombreServicio;
	private JTextField jtCostoServicio;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarservicio frame = new agregarservicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public agregarservicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screen.width,screen.height - 30);
		this.setExtendedState(MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{358, 179, 138, 133, 111, 178, 0, 0};
		gbl_contentPane.rowHeights = new int[]{150, 0, 87, 46, 77, 54, 73, 160, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbAgregarServicio = new JLabel("Agregar un servicio");
		lbAgregarServicio.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lbAgregarServicio = new GridBagConstraints();
		gbc_lbAgregarServicio.insets = new Insets(0, 0, 5, 5);
		gbc_lbAgregarServicio.gridx = 1;
		gbc_lbAgregarServicio.gridy = 0;
		contentPane.add(lbAgregarServicio, gbc_lbAgregarServicio);
		
		JLabel lbCompleteCampos = new JLabel("Complete obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 14));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		gbc_lbCompleteCampos.insets = new Insets(0, 0, 5, 5);
		gbc_lbCompleteCampos.gridx = 1;
		gbc_lbCompleteCampos.gridy = 1;
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		JLabel lbIdServicio = new JLabel("Id del servicio*:");
		lbIdServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbIdServicio = new GridBagConstraints();
		gbc_lbIdServicio.anchor = GridBagConstraints.EAST;
		gbc_lbIdServicio.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdServicio.gridx = 0;
		gbc_lbIdServicio.gridy = 2;
		contentPane.add(lbIdServicio, gbc_lbIdServicio);
		
		jtIdServicio = new JTextField();
		GridBagConstraints gbc_jtIdServicio = new GridBagConstraints();
		gbc_jtIdServicio.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdServicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtIdServicio.gridx = 1;
		gbc_jtIdServicio.gridy = 2;
		contentPane.add(jtIdServicio, gbc_jtIdServicio);
		jtIdServicio.setColumns(10);
		
		JLabel lbNombreServicio = new JLabel("Nombre del servicio*:");
		lbNombreServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombreServicio = new GridBagConstraints();
		gbc_lbNombreServicio.anchor = GridBagConstraints.EAST;
		gbc_lbNombreServicio.insets = new Insets(0, 0, 5, 5);
		gbc_lbNombreServicio.gridx = 0;
		gbc_lbNombreServicio.gridy = 4;
		contentPane.add(lbNombreServicio, gbc_lbNombreServicio);
		
		jtNombreServicio = new JTextField();
		GridBagConstraints gbc_jtNombreServicio = new GridBagConstraints();
		gbc_jtNombreServicio.insets = new Insets(0, 0, 5, 5);
		gbc_jtNombreServicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtNombreServicio.gridx = 1;
		gbc_jtNombreServicio.gridy = 4;
		contentPane.add(jtNombreServicio, gbc_jtNombreServicio);
		jtNombreServicio.setColumns(10);
		
		JLabel lbCostoServicio = new JLabel("Costo del servicio*:");
		lbCostoServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCostoServicio = new GridBagConstraints();
		gbc_lbCostoServicio.anchor = GridBagConstraints.EAST;
		gbc_lbCostoServicio.insets = new Insets(0, 0, 5, 5);
		gbc_lbCostoServicio.gridx = 0;
		gbc_lbCostoServicio.gridy = 6;
		contentPane.add(lbCostoServicio, gbc_lbCostoServicio);
		
		jtCostoServicio = new JTextField();
		GridBagConstraints gbc_jtCostoServicio = new GridBagConstraints();
		gbc_jtCostoServicio.insets = new Insets(0, 0, 5, 5);
		gbc_jtCostoServicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtCostoServicio.gridx = 1;
		gbc_jtCostoServicio.gridy = 6;
		contentPane.add(jtCostoServicio, gbc_jtCostoServicio);
		jtCostoServicio.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 7;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		btnCancelar.addActionListener(this);
		
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAgregar.gridx = 3;
		gbc_btnAgregar.gridy = 7;
		contentPane.add(btnAgregar, gbc_btnAgregar);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,0,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
		buttonRegresar(new servicios(),this,new GridBagConstraints(),contentPane,1,7,1,1,0.0,0.0,GridBagConstraints.WEST);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Cancelar":
				servicios ser = new servicios();
				ser.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}
}
