package Visual1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class LetraEnPosicion {

	private JFrame frame;
	private JTextField cadena;
	private JTextField posicion;

	
	/**
	 * Launch the application.
	 * @return un valor vacio
	 * @param args recibe un conjunto de cadenas
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LetraEnPosicion window = new LetraEnPosicion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Esta funcion inicializa el JtextField
	 * 
	 * @return nada
	 * 
	 * 
	 */
	public LetraEnPosicion() {
		initialize();
	}

	/**
	 * Cadena es un JtextField que recibe un texto.
	 */
	public int leerCadena() {
		return 0;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		cadena = new JTextField();
		cadena.setBounds(57, 24, 114, 19);
		frame.getContentPane().add(cadena);
		cadena.setColumns(10);
		
		JLabel lblSalida = new JLabel("Salida");
		lblSalida.setBounds(57, 86, 377, 40);
		lblSalida.setVisible(false);
		frame.getContentPane().add(lblSalida);
		
		posicion = new JTextField();
		posicion.setBounds(141, 55, 30, 19);
		frame.getContentPane().add(posicion);
		posicion.setColumns(10);
		
		JButton btnMostrarCaracter = new JButton("Mostrar Caracter");
		btnMostrarCaracter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String salida ="El caracter es: ";
				int pos = Integer.parseInt(posicion.getText());
			
				System.out.println(pos);
				
				
				lblSalida.setText(salida + cadena.getText().substring(pos-1,pos));
				lblSalida.setVisible(true);
				
			}
		});
		btnMostrarCaracter.setBounds(246, 74, 188, 25);
		frame.getContentPane().add(btnMostrarCaracter);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(271, 111, 6, 21);
		frame.getContentPane().add(textPane);
		
		JList list = new JList();
		list.setBounds(57, 138, 114, 84);
		frame.getContentPane().add(list);
		
		JToggleButton tglbtnActivame = new JToggleButton("Activame");
		tglbtnActivame.setBounds(219, 160, 167, 25);
		frame.getContentPane().add(tglbtnActivame);
	}
}
