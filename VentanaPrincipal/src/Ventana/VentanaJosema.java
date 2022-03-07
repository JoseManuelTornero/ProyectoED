package Ventana;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextPane;

public class VentanaJosema extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaJosema() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Nombre:");
		textPane.setEditable(false);
		textPane.setBounds(12, 13, 122, 22);
		add(textPane);
		
		JTextPane txtpnJosManuel = new JTextPane();
		txtpnJosManuel.setText("Jos\u00E9 Manuel");
		txtpnJosManuel.setEditable(false);
		txtpnJosManuel.setBounds(133, 13, 122, 22);
		add(txtpnJosManuel);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Apellidos:");
		textPane_2.setEditable(false);
		textPane_2.setBounds(12, 48, 122, 22);
		add(textPane_2);
		
		JTextPane txtpnCheetos = new JTextPane();
		txtpnCheetos.setText("Cheetos");
		txtpnCheetos.setEditable(false);
		txtpnCheetos.setBounds(133, 48, 122, 22);
		add(txtpnCheetos);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Edad:");
		textPane_4.setEditable(false);
		textPane_4.setBounds(12, 83, 122, 22);
		add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("18");
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
