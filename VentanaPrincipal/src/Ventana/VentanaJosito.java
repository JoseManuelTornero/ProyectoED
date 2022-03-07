package Ventana;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextPane;

public class VentanaJosito extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaJosito() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("1.79");
		textPane.setEditable(false);
		textPane.setBounds(133, 112, 122, 22);
		add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("18");
		textPane_1.setEditable(false);
		textPane_1.setBounds(133, 83, 122, 22);
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Nombre:");
		textPane_2.setEditable(false);
		textPane_2.setBounds(12, 13, 122, 22);
		add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Edad:");
		textPane_3.setEditable(false);
		textPane_3.setBounds(12, 83, 122, 22);
		add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setText("Apellidos:");
		textPane_4.setEditable(false);
		textPane_4.setBounds(12, 48, 122, 22);
		add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setText("Altura:");
		textPane_5.setEditable(false);
		textPane_5.setBounds(12, 112, 122, 22);
		add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setText("1\u00BA D.A.M");
		textPane_6.setEditable(false);
		textPane_6.setBounds(133, 147, 122, 22);
		add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setText("Curso:");
		textPane_7.setEditable(false);
		textPane_7.setBounds(12, 147, 122, 22);
		add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setText("Jos\u00E9");
		textPane_8.setEditable(false);
		textPane_8.setBounds(133, 13, 122, 22);
		add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setText("Rodr\u00EDguez L\u00F3pez");
		textPane_9.setEditable(false);
		textPane_9.setBounds(133, 48, 122, 22);
		add(textPane_9);

	}
}
