package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		Scanner teclado = new Scanner(System.in);
		int resp1;
		int resp2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menú");
		menuBar.add(mnNewMenu);
		
		JMenuItem david = new JMenuItem("David");
		mnNewMenu.add(david);
		
		JMenuItem jose= new JMenuItem("José");
		mnNewMenu.add(jose);
		
		JMenuItem andres = new JMenuItem("Andrés");
		mnNewMenu.add(andres);
		
		JMenuItem cheetos = new JMenuItem("Cheetos");
		mnNewMenu.add(cheetos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("=");
		textPane_1.setBounds(311, 103, 15, 20);
		contentPane.add(textPane_1);
		
		numero1 = new JTextField();
		numero1.setBounds(40, 103, 86, 20);
		contentPane.add(numero1);
		numero1.setColumns(10);
		
		
		numero2 = new JTextField();
		numero2.setBounds(197, 103, 86, 20);
		contentPane.add(numero2);
		numero2.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1+num2));
			}
		});
		btnNewButton.setBounds(10, 206, 89, 23);
		contentPane.add(btnNewButton);
		
		resultado = new JTextField();
		resultado.setBounds(338, 103, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Resta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(numero1.getText());
				double num2 = Double.parseDouble(numero2.getText());
				resultado.setText(String.valueOf(num1*num2));
			}
		});
		btnNewButton_1.setBounds(109, 206, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1.setText(" ");
				numero2.setText(" ");
				resultado.setText(" ");
			}
		});
		btnNewButton_2.setBounds(335, 206, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JTextPane txtpnNumero = new JTextPane();
		txtpnNumero.setText("Numero 1");
		txtpnNumero.setBounds(40, 72, 86, 20);
		contentPane.add(txtpnNumero);
		
		JTextPane txtpnNumero_1 = new JTextPane();
		txtpnNumero_1.setText("Numero 2");
		txtpnNumero_1.setBounds(197, 72, 86, 23);
		contentPane.add(txtpnNumero_1);
		
		JTextPane txtpnResultado = new JTextPane();
		txtpnResultado.setText("Resultado");
		txtpnResultado.setBounds(338, 72, 86, 20);
		contentPane.add(txtpnResultado);
		
	}
}
