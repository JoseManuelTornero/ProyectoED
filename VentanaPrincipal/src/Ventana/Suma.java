package Ventana;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Suma extends JPanel {
	private JTextField resultado;
	private JTextField numero1;
	private JTextField numero2;

	/**
	 * Create the panel.
	 */
	public Suma() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(282, 56, 14, 20);
		textPane.setText("=");
		add(textPane);
		
		numero1 = new JTextField();
		numero1.setBounds(10, 56, 86, 20);
		numero1.setColumns(10);
		add(numero1);
		
		numero2 = new JTextField();
		numero2.setBounds(164, 56, 86, 20);
		numero2.setColumns(10);
		add(numero2);
		
		JButton button_1 = new JButton("Limpiar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1.setText(" ");
				numero2.setText(" ");
				resultado.setText(" ");
			}
		});
		button_1.setBounds(345, 175, 65, 23);
		add(button_1);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(331, 56, 86, 20);
		resultado.setColumns(10);
		add(resultado);
		
		JButton button = new JButton("Suma");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1 + num2));
			}
		});
		button.setBounds(10, 127, 59, 23);
		add(button);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(26, 25, 52, 20);
		textPane_1.setText("Numero 1");
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(179, 25, 52, 20);
		textPane_2.setText("Numero 2");
		add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(345, 25, 54, 20);
		textPane_3.setText("Resultado");
		add(textPane_3);
		
		JButton btnNewButton = new JButton("Resta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1 - num2));
			}
		});
		btnNewButton.setBounds(127, 127, 65, 23);
		add(btnNewButton);
		
		JButton btnMultiplicacion = new JButton("Multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1 * num2));
			}
		});
		btnMultiplicacion.setBounds(10, 175, 107, 23);
		add(btnMultiplicacion);
		
		JButton btnNewButton_1 = new JButton("Division");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1 / num2));
			}
		});
		btnNewButton_1.setBounds(127, 175, 69, 23);
		add(btnNewButton_1);

	}
}
