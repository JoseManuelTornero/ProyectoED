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
	private JTextField textField;
	private JTextField textField_1;

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
		
		JTextPane textPane = new JTextPane();
		textPane.setText("+");
		textPane.setBounds(153, 103, 15, 20);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("=");
		textPane_1.setBounds(311, 103, 15, 20);
		contentPane.add(textPane_1);
		
		textField = new JTextField();
		textField.setBounds(40, 103, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 103, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 205, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
