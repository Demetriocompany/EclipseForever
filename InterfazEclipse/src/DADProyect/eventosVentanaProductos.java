package DADProyect;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class eventosVentanaProductos implements ActionListener {
	static JPanel panelAņadido = new JPanel();;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaProductos.botonHamburguesa) {
			if (ventanaProductos.botonHamburguesa.isSelected()) {

				panelAņadido.setBounds(188, 0, 288, 383);
				ventanaProductos.contentPane.add(panelAņadido);
				panelAņadido.setLayout(null);

				JLabel lblHamburguesas = new JLabel("Hamburguesas");
				lblHamburguesas.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblHamburguesas.setBounds(10, 11, 134, 35);
				panelAņadido.add(lblHamburguesas);

				JLabel lblTipoDeCarne = new JLabel("Tipo de carne");
				lblTipoDeCarne.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblTipoDeCarne.setBounds(10, 57, 134, 25);
				panelAņadido.add(lblTipoDeCarne);

				JRadioButton rdbtnVacuno = new JRadioButton("Vacuno");
				rdbtnVacuno.setBounds(10, 98, 69, 23);
				panelAņadido.add(rdbtnVacuno);

				JRadioButton rdbtnPollo = new JRadioButton("Pollo");
				rdbtnPollo.setBounds(83, 98, 61, 23);
				panelAņadido.add(rdbtnPollo);

				JRadioButton rdbtnEspinacas = new JRadioButton("Espinacas");
				rdbtnEspinacas.setBounds(151, 98, 109, 23);
				panelAņadido.add(rdbtnEspinacas);

				JLabel lblExtras = new JLabel("Extras");
				lblExtras.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblExtras.setBounds(10, 132, 61, 35);
				panelAņadido.add(lblExtras);

				JCheckBox chckbxLechuga = new JCheckBox("Lechuga");
				chckbxLechuga.setBounds(10, 174, 75, 23);
				panelAņadido.add(chckbxLechuga);

				JCheckBox chckbxNewCheckBox = new JCheckBox("Queso");
				chckbxNewCheckBox.setBounds(83, 174, 69, 23);
				panelAņadido.add(chckbxNewCheckBox);

				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tomate");
				chckbxNewCheckBox_1.setBounds(151, 174, 70, 23);
				panelAņadido.add(chckbxNewCheckBox_1);

				JLabel lblSalsa = new JLabel("Salsa");
				lblSalsa.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblSalsa.setBounds(10, 218, 46, 14);
				panelAņadido.add(lblSalsa);

				JCheckBox chckbxKetchup = new JCheckBox("Ketchup");
				chckbxKetchup.setBounds(10, 239, 75, 23);
				panelAņadido.add(chckbxKetchup);

				JCheckBox chckbxMostaza = new JCheckBox("Mostaza");
				chckbxMostaza.setBounds(83, 239, 73, 23);
				panelAņadido.add(chckbxMostaza);

				JCheckBox chckbxAlioli = new JCheckBox("Alioli");
				chckbxAlioli.setBounds(153, 239, 70, 23);
				panelAņadido.add(chckbxAlioli);

				ventanaProductos.contentPane.updateUI();
			} else {
				ventanaProductos.contentPane.remove(panelAņadido);
				ventanaProductos.contentPane.updateUI();
			}
		}
	}
}
