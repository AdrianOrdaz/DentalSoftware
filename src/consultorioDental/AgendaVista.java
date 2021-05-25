package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

public class AgendaVista extends MetodosDiseño implements ActionListener {
	
	JButton btnEliminar;
	public static void main(String[] args) 
	{
		AgendaVista av = new AgendaVista();
		av.crearfA();
	}
	
	protected void crearfA() 
	{
		JFrame fAgenda = new JFrame("Consultorio Dental/Agenda");
		Container con = new Container();
		con = fAgenda.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAgenda = new JLabel("Agenda");
		lbAgenda.setFont (new Font("Open Sans",Font.CENTER_BASELINE, 40));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbAgenda,c);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		adjustComponents(gbc_scrollPane,0,2,4,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		String [] nomColumnas = {"ID", "Paciente", "Hora", "Dentista", "Asistio","Fecha"};
		DefaultTableModel dtm = new DefaultTableModel(null,nomColumnas); 
		JTable tbAgenda = new JTable(dtm);
	    
	    DefaultTableModel model = (DefaultTableModel) tbAgenda.getModel();
	    model.addRow(new Object[]{obtenerString("agenda",1,1), obtenerString("agenda",2,1), 
	    		obtenerString("agenda",3,1), obtenerString("agenda",4,1), obtenerString("agenda",5,1), obtenerString("agenda",6,1)});
	    
	   /* if(NumFil("agenda")>1)
	    {
	    for(int i = 1; i<NumFil("agenda"); i++)
	    {
	    int a=i+1;
	    
	    model.addRow(new Object[]{obtenerString("agenda",1,a), obtenerString("agenda",2,a), 
	    		obtenerString("agenda",3,a), obtenerString("agenda",4,a), obtenerString("agenda",5,a), obtenerString("agenda",6,a)});
	    }
	    }*/
	    
	    tbAgenda.getTableHeader().setReorderingAllowed(false);
	    scrollPane.setViewportView(tbAgenda);
	    JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
	    		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,c,con,0,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		btnEliminar = new JButton("Eliminar");
		adjustButton(btnEliminar, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		btnEliminar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) 
			{
				if (tbAgenda.getSelectedRow() != -1) {
		            int SelectedRow = tbAgenda.getSelectedRow();
		            dtm.removeRow(SelectedRow);
		            SelectedRow ++;
		            String remove = "" + SelectedRow;
		            System.out.println(remove);
		            borrarFila("dentistas", "id_den", remove);
		        }
			}
		});
		
		buttonHome(fAgenda,true,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		fAgenda.pack();
		fAgenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAgenda.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
