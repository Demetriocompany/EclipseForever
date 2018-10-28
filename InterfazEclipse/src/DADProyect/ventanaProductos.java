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

	static JToggleButton botonHamburguesa, botonPerrito, botonPizza, botonComplementos, botonEnsaladas, boton6;

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
		setBounds(100, 100, 502, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 178, 386);
		contentPane.add(panel);
		panel.setLayout(null);

		botonHamburguesa = new JToggleButton("HAMBURGUESA");
		botonHamburguesa.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonHamburguesa.setBounds(0, 0, 178, 61);
		panel.add(botonHamburguesa);
		botonHamburguesa.addActionListener(new eventosVentanaProductos());

		botonPerrito = new JToggleButton("PERRITO");
		botonPerrito.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonPerrito.setBounds(0, 64, 178, 61);
		panel.add(botonPerrito);

		botonPizza = new JToggleButton("PIZZA");
		botonPizza.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonPizza.setBounds(0, 128, 178, 61);
		panel.add(botonPizza);

		botonComplementos = new JToggleButton("COMPLEMENTOS");
		botonComplementos.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonComplementos.setBounds(0, 194, 178, 61);
		panel.add(botonComplementos);

		botonEnsaladas = new JToggleButton("ENSALADAS");
		botonEnsaladas.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonEnsaladas.setBounds(0, 259, 178, 61);
		panel.add(botonEnsaladas);
		
		JButton botonVolver = new JButton("VOLVER ATRAS");
		botonVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		botonVolver.setBounds(0, 323, 178, 61);
		panel.add(botonVolver);
	}
}
