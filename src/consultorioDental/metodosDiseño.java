package consultorioDental;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class metodosDiseño extends JFrame{
	
	protected static void adjustButton(JButton btn, GridBagConstraints c, Container con, 
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
	
	protected static void adjustComponents(GridBagConstraints c, 
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
	
	protected static void buttonHome(GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
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
	protected static void buttonRegresar(GridBagConstraints c, Container con, 
			int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		JButton btnRegresar = new JButton(new ImageIcon("src/img/regresar.png"));
		btnRegresar.setPreferredSize(new Dimension(35, 35));
		btnRegresar.setBorder(new LineBorder(Color.white));
		btnRegresar.setBackground(Color.white);
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
}
