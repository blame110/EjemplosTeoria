import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	int cantidad;
	double tamanox;
	double tamanoy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				FileReader fichero = new FileR+reader();
				
				
				try {
					Ventana window = new Ventanas();
					window.frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace()
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(53, 70, 223, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JButton btnBoton = new JButton("Boton");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setText("Has pulsado el boton");

			}
		});
		btnBoton.setBounds(299, 70, 117, 25);
		frame.getContentPane().add(btnBoton);

		passwordField = new JPasswordField();
		passwordField.setBounds(106, 118, 4, 19);
		frame.getContentPane().add(passwordField);

		for (int i; i >= 5; i++) {
			JRadioButton radioButton = new JRadioButton("18-25");
			radioButton.setBounds(29, 170, 149, 23);
			frame.getContentPane().add(radioButton);
		}
	}
}
