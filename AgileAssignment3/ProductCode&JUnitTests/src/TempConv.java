import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TempConv extends JFrame {

	private JPanel contentPane;
	private JTextField CelsiusTF;
	private JTextField FahrenheitTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConv frame = new TempConv();
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
	public TempConv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(108, 16, 396, 28);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("TEMPERATURE CONVERSION APPLICATION");
		lblNewLabel.setFont(new Font("Arial Hebrew Scholar", Font.BOLD, 16));
		panel.add(lblNewLabel);

		CelsiusTF = new JTextField();
		CelsiusTF.setBounds(136, 141, 130, 28);
		contentPane.add(CelsiusTF);
		CelsiusTF.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CELSIUS TO FAHRENHEIT");
		lblNewLabel_1.setBounds(74, 99, 161, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("FAHRENHEIT TO CELSIUS");
		lblNewLabel_2.setBounds(398, 99, 156, 16);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Enter in Celsius");
		lblNewLabel_3.setBounds(30, 147, 124, 16);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Convert to Fahrenheit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double celtofahren;
				double value = Double.valueOf(CelsiusTF.getText());
				if (value >= 0 && value <= 100) {
					try {
						celtofahren = Double.parseDouble(CelsiusTF.getText()) * 5 / 9 + 32;
						JFrame f1 = new JFrame();
						JOptionPane.showMessageDialog(f1, "The Temprature in Fahrenheit is " + celtofahren + " Degree");

					} catch (Exception TempConvException) {
						JOptionPane.showMessageDialog(null, TempConvException.toString());
					}

				} else {
					try {
						throw new TempConvException();
					} catch (TempConvException e1) {
						JOptionPane.showMessageDialog(null, "Range must be between 0 to 100");
						System.err.println("Range must be between 0 to 100");
					}
				}

			}
		});
		btnNewButton.setBounds(58, 199, 161, 29);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Enter in Fahrenheit");
		lblNewLabel_4.setBounds(341, 147, 124, 16);
		contentPane.add(lblNewLabel_4);

		FahrenheitTF = new JTextField();
		FahrenheitTF.setBounds(471, 142, 130, 26);
		contentPane.add(FahrenheitTF);
		FahrenheitTF.setColumns(10);

		JButton btnNewButton_1 = new JButton("Convert to Celsius");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				double fahrentocel;
				double value = Double.valueOf(FahrenheitTF.getText());
				if (value >= 0 && value <= 212) {
					try {
						fahrentocel = (Double.parseDouble(FahrenheitTF.getText()) - 32) * 5 / 9;
						JFrame f1 = new JFrame();
						JOptionPane.showMessageDialog(f1, "The Temprature in Celsius is " + fahrentocel + " Degree");

					} catch (Exception TempConvException) {
						JOptionPane.showMessageDialog(null, TempConvException.toString());
					}

				}
				else {
					try {
						throw new TempConvException();
					} catch (TempConvException e1) {
						JOptionPane.showMessageDialog(null, "Range must be between 0 to 212");
						System.err.println("Range must be between 0 to 212");
					}
					
				}

			}
		});
		btnNewButton_1.setBounds(398, 199, 156, 29);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("EXIT APPLICATION");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(210, 248, 198, 29);
		contentPane.add(btnNewButton_2);
	}
}
