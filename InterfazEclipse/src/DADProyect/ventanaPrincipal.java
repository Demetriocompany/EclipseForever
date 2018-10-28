package DADProyect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelizquierdo = new JPanel();
		panelizquierdo.setBounds(10, 11, 336, 331);
		contentPane.add(panelizquierdo);
		panelizquierdo.setLayout(null);

		JButton botonOfertaDelDia = new JButton("OFERTA DEL D\u00CDA");
		botonOfertaDelDia.setFont(new Font("Tahoma", Font.BOLD, 20));
		botonOfertaDelDia.setBounds(0, 0, 336, 62);
		panelizquierdo.add(botonOfertaDelDia);

		JPanel panelDerecho = new JPanel();
		panelDerecho.setBounds(356, 11, 183, 331);
		contentPane.add(panelDerecho);
		panelDerecho.setLayout(null);

		JButton botonRecomendaciones = new JButton("RECOMENDACIONES");
		botonRecomendaciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonRecomendaciones.setBounds(0, 0, 183, 64);
		panelDerecho.add(botonRecomendaciones);

		JButton botonProducto = new JButton("PRODUCTOS");
		botonProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == botonProducto) {
					ventanaProductos ventanaProductos = new ventanaProductos();
					ventanaProductos.setVisible(true);
					botonProducto.setEnabled(false);
				}
			}
		});
		botonProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonProducto.setBounds(0, 63, 183, 64);
		panelDerecho.add(botonProducto);
	}

}
