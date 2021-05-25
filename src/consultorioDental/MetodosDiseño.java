package consultorioDental;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;

public class MetodosDiseño extends MetodosConexionBD{
	
	JButton btnHome;
	JButton btnRegresar;
	JRadioButton jrbt;
	
	protected void adjustButton(JButton btn, GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		btn.setPreferredSize(new Dimension(120, 35)); 
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
	    con.add(btn,c);
	    c.weighty = 0.0;
	    c.weightx = 0.0;
	    c.anchor = GridBagConstraints.CENTER;
	}
	
	protected void adjustComponents(GridBagConstraints c, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
	}
	
	protected void buttonHome(JFrame frame,boolean U, GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(U)
				{
					MenuUsuario mu = new MenuUsuario();
					mu.crearMenuUsuario();
					frame.setVisible(false);
				}else {
					MenuAdmin ma = new MenuAdmin();
					ma.crearMenuAdmin();;
					frame.setVisible(false);
				}
			}
		});
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
	    con.add(btnHome,c);
	    c.weighty = 0.0;
	    c.weightx = 0.0;
	    c.anchor = GridBagConstraints.CENTER;
	}
	protected void buttonRegresar(JFrame frame1,JFrame frame2,GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		btnRegresar = new JButton(new ImageIcon("src/img/regresar.png"));
		btnRegresar.setPreferredSize(new Dimension(35, 35));
		btnRegresar.setBorder(new LineBorder(Color.white));
		btnRegresar.setBackground(Color.white);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(true);
				frame2.setVisible(false);
			}
		});
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
	    con.add(btnRegresar,c);
	    c.weighty = 0.0;
	    c.weightx = 0.0;
	    c.anchor = GridBagConstraints.CENTER;
	}
	protected void activeTF1(JCheckBox cbx,JTextField jt) 
	{
		cbx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbx.isSelected()) {
					jt.setEnabled(true);
				}else {
					jt.setEnabled(false);
				}
				}
		});
	}
	protected void activeBttn(JCheckBox cbx,JButton jB) 
	{
		cbx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbx.isSelected()) {
					jB.setEnabled(true);
				}else {
					jB.setEnabled(false);
				}
				}
		});
	}
	protected void adjustTextField (JTextField jt , GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		jt.setPreferredSize(new Dimension(200,25));
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
		con.add(jt,c);
		c.weighty = 0.0;
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.CENTER;
	}
	
	protected void adjustPasswordField (JPasswordField jpf , GridBagConstraints c, Container con, int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		jpf.setPreferredSize(new Dimension(120,35));
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
		con.add(jpf,c);
		c.weighty = 0.0;
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.CENTER;
	}
	protected static JRadioButton getSelection(ButtonGroup group)
	{
	        for (Enumeration e=group.getElements(); e.hasMoreElements(); )
	        {
	            JRadioButton b = (JRadioButton)e.nextElement();
	            if (b.getModel() == group.getSelection())
	            {
	                return b;
	            }
	        }

	        return null;
	}
	protected void activeTF(JRadioButton rb, JRadioButton rb2, JTextField jt) 
	{
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb);
		bg.add(rb2);
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton jrb = getSelection(bg);
				if(jrb.getText() == "Sí")
				{
					jt.setEnabled(true);
				}
			}
		});
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton jrb = getSelection(bg);
				if(jrb.getText() == "No") {
					jt.setEnabled(false);
				}
			}
		});
	}
	class MyTableCellRenderer extends JRadioButton implements TableCellRenderer, ActionListener{
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	       this.setSelected(isSelected);
	       //this.addActionListener(actionPerformed());
	       return this;
	    }
		public void actionPerformed(ActionEvent e) {
			if(this.isSelected()) {
				Pacientes pte = new Pacientes();
				pte.btnCrearReceta.setVisible(true);
				System.out.print(e.getSource());
			}
		}

	}
}