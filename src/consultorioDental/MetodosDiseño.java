package consultorioDental;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class MetodosDise�o extends MetodosConexionBD{
	
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
				if(jrb.getText() == "S�")
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
	class MyTableCellRenderer extends JRadioButton implements TableCellRenderer{
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	       this.setSelected(isSelected);
	       return this;
	    }
	}
	protected void emptyJT(JTextField jt,JTextField jt1, JTextField jt2, JTextField jt3, JTextField jt4
			, JTextField jt5, JTextField jt6, JTextField jt7) {
		jt.setText("");
		jt1.setText("");
		jt2.setText("");
		jt3.setText("");
		jt4.setText("");
		jt5.setText("");
		jt6.setText("");
		jt7.setText("");
	}
	public static class JTableModel extends AbstractTableModel {
        private static final long serialVersionUID = 1L;
        private static final String[] COLUMN_NAMES = new String[] {"Id", "Stuff", "Button1", "Button2"};
        private static final Class<?>[] COLUMN_TYPES = new Class<?>[] {Integer.class, String.class, JButton.class,  JButton.class};

        @Override public int getColumnCount() {
            return COLUMN_NAMES.length;
        }

        @Override public int getRowCount() {
            return 4;
        }

        @Override public String getColumnName(int columnIndex) {
            return COLUMN_NAMES[columnIndex];
        }

        @Override public Class<?> getColumnClass(int columnIndex) {
            return COLUMN_TYPES[columnIndex];
        }

        @Override public Object getValueAt(final int rowIndex, final int columnIndex) {
                /*Adding components*/
            switch (columnIndex) {
                case 0: return rowIndex;
                case 1: return "Text for "+rowIndex;
                case 2: // fall through
               /*Adding button and creating click listener*/
                case 3: final JButton button = new JButton(COLUMN_NAMES[columnIndex]);
                        button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent arg0) {
                                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button), 
                                        "Button clicked for row "+rowIndex);
                            }
                        });
                        return button;
                default: return "Error";
            }
        }   
    }
	static class JTableButtonRenderer implements TableCellRenderer {        
        @Override public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton button = (JButton)value;
            return button;  
        }
    }
}