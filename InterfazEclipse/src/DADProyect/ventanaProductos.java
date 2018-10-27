package DADProyect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class ventanaProductos extends JFrame {
	
	static JToggleButton boton1, boton2, boton3, boton4, boton5, boton6;

	static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaProductos frame = new ventanaProductos();
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
	public ventanaProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 178, 429);
		contentPane.add(panel);
		panel.setLayout(null);
		
		boton1 = new JToggleButton("HAMBURGUESA");
		boton1.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton1.setBounds(0, 0, 178, 61);
		panel.add(boton1);
		boton1.addActionListener(new eventosVentanaProductos());
		
		boton2 = new JToggleButton("PERRITO");
		boton2.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton2.setBounds(0, 64, 178, 61);
		panel.add(boton2);
		
		boton3 = new JToggleButton("PIZZA");
		boton3.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton3.setBounds(0, 128, 178, 61);
		panel.add(boton3);
		
		boton4 = new JToggleButton("COMPLEMENTOS");
		boton4.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton4.setBounds(0, 194, 178, 61);
		panel.add(boton4);
		
		boton5 = new JToggleButton("ENSALADAS");
		boton5.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton5.setBounds(0, 259, 178, 61);
		panel.add(boton5);
		
		JToggleButton boton6 = new JToggleButton("New toggle button");
		boton6.setFont(new Font("Tahoma", Font.BOLD, 16));
		boton6.setBounds(0, 324, 178, 61);
		panel.add(boton6);
	}
}
