package dlince;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(29, 73, 446, 384);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrCodigoAEvaluar = new JTextArea();
		txtrCodigoAEvaluar.setText("Codigo a evaluar");
		txtrCodigoAEvaluar.setBounds(36, 22, 137, 29);
		contentPane.add(txtrCodigoAEvaluar);
		
		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.setBounds(637, 23, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(499, 23, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
