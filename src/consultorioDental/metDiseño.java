package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.TableModel;

public class metDiseño extends JFrame
{
	
	protected static void adjustButton(JButton btn , GridBagConstraints c, Container con, int gx, int gy, int gw, int gh, double wy, double wx, int gdb, int fll)
	{
		btn.setPreferredSize(new Dimension(120,35));
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
		c.fill = fll;
		con.add(btn,c);
		c.weighty = 0.0;
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.CENTER;
	}
	
	protected static void adjustLabel (JLabel lb , GridBagConstraints c, Container con, int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
	{
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
		con.add(lb,c);
		c.weighty = 0.0;
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.CENTER;
	}
	
	protected static void adjustTextField (JTextField jt , GridBagConstraints c, Container con, int gx, int gy, int gw, int gh, double wy, double wx, int gdb, int fll)
	{
		jt.setPreferredSize(new Dimension(120,35));
		c.gridx = gx;
		c.gridy = gy;
		c.gridwidth = gw;
		c.gridheight = gh;
		c.weighty = wy;
		c.weightx = wx;
		c.anchor = gdb;
		c.fill = fll;
		con.add(jt,c);
		c.weighty = 0.0;
		c.weightx = 0.0;
		c.anchor = GridBagConstraints.CENTER;
		
	}
	
	protected static void adjustPasswordField (JPasswordField jpf , GridBagConstraints c, Container con, int gx, int gy, int gw, int gh, double wy, double wx, int gdb)
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
	
	
}
