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
	static JPanel panelAñadido = new JPanel();;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaProductos.boton1) {
			if (ventanaProductos.boton1.isSelected()) {

				panelAñadido.setBounds(188, 0, 288, 383);
				ventanaProductos.contentPane.add(panelAñadido);
				panelAñadido.setLayout(null);

				JLabel lblHamburguesas = new JLabel("Hamburguesas");
				lblHamburguesas.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblHamburguesas.setBounds(10, 11, 134, 35);
				panelAñadido.add(lblHamburguesas);

				JLabel lblTipoDeCarne = new JLabel("Tipo de carne");
				lblTipoDeCarne.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblTipoDeCarne.setBounds(10, 57, 134, 25);
				panelAñadido.add(lblTipoDeCarne);

				JRadioButton rdbtnVacuno = new JRadioButton("Vacuno");
				rdbtnVacuno.setBounds(10, 98, 69, 23);
				panelAñadido.add(rdbtnVacuno);

				JRadioButton rdbtnPollo = new JRadioButton("Pollo");
				rdbtnPollo.setBounds(83, 98, 61, 23);
				panelAñadido.add(rdbtnPollo);

				JRadioButton rdbtnEspinacas = new JRadioButton("Espinacas");
				rdbtnEspinacas.setBounds(151, 98, 109, 23);
				panelAñadido.add(rdbtnEspinacas);

				JLabel lblExtras = new JLabel("Extras");
				lblExtras.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblExtras.setBounds(10, 132, 61, 35);
				panelAñadido.add(lblExtras);

				JCheckBox chckbxLechuga = new JCheckBox("Lechuga");
				chckbxLechuga.setBounds(10, 174, 75, 23);
				panelAñadido.add(chckbxLechuga);

				JCheckBox chckbxNewCheckBox = new JCheckBox("Queso");
				chckbxNewCheckBox.setBounds(83, 174, 69, 23);
				panelAñadido.add(chckbxNewCheckBox);

				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tomate");
				chckbxNewCheckBox_1.setBounds(151, 174, 70, 23);
				panelAñadido.add(chckbxNewCheckBox_1);

				JLabel lblSalsa = new JLabel("Salsa");
				lblSalsa.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblSalsa.setBounds(10, 218, 46, 14);
				panelAñadido.add(lblSalsa);

				JCheckBox chckbxKetchup = new JCheckBox("Ketchup");
				chckbxKetchup.setBounds(10, 239, 75, 23);
				panelAñadido.add(chckbxKetchup);

				JCheckBox chckbxMostaza = new JCheckBox("Mostaza");
				chckbxMostaza.setBounds(83, 239, 73, 23);
				panelAñadido.add(chckbxMostaza);

				JCheckBox chckbxAlioli = new JCheckBox("Alioli");
				chckbxAlioli.setBounds(153, 239, 70, 23);
				panelAñadido.add(chckbxAlioli);

				ventanaProductos.contentPane.updateUI();
			} else {
				ventanaProductos.contentPane.remove(panelAñadido);
				ventanaProductos.contentPane.updateUI();
			}
		}
	}
}
