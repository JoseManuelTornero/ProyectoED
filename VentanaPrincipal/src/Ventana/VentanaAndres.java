package Ventana;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;

public class VentanaAndres extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaAndres() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Nombre:");
		textPane.setEditable(false);
		textPane.setBounds(12, 13, 122, 22);
		add(textPane);
		
		JTextPane txtpnAndrs = new JTextPane();
		txtpnAndrs.setText("Andr\u00E9s");
		txtpnAndrs.setEditable(false);
		txtpnAndrs.setBounds(133, 13, 122, 22);
		add(txtpnAndrs);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Apellidos:");
		textPane_2.setEditable(false);
		textPane_2.setBounds(12, 48, 122, 22);
		add(textPane_2);
		
		JTextPane txtpnMartos = new JTextPane();
		txtpnMartos.setText("Martos");
		txtpnMartos.setEditable(false);
		txtpnMartos.setBounds(133, 48, 122, 22);
		add(txtpnMartos);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Edad:");
		textPane_4.setEditable(false);
		textPane_4.setBounds(12, 83, 122, 22);
		add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("20");
		textPane_5.setEditable(false);
		textPane_5.setBounds(133, 83, 122, 22);
		add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("Altura:");
		textPane_6.setEditable(false);
		textPane_6.setBounds(12, 112, 122, 22);
		add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("1.79");
		textPane_7.setEditable(false);
		textPane_7.setBounds(133, 112, 122, 22);
		add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("Curso:");
		textPane_8.setEditable(false);
		textPane_8.setBounds(12, 147, 122, 22);
		add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("1\u00BA D.A.M");
		textPane_9.setEditable(false);
		textPane_9.setBounds(133, 147, 122, 22);
		add(textPane_9);

	}

}
