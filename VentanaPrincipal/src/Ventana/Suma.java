package Ventana;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Suma extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Suma() {
		
		JTextPane textPane = new JTextPane();
		textPane.setText("=");
		add(textPane);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		add(textField_1);
		
		JButton button = new JButton("Suma");
		add(button);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		add(textField_2);
		
		JButton button_1 = new JButton("Limpiar");
		add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		add(textField);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Numero 1");
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText("Numero 2");
		add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setText("Resultado");
		add(textPane_3);

	}

}
