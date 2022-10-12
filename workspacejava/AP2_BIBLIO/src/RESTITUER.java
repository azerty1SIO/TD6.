import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RESTITUER {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RESTITUER window = new RESTITUER();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RESTITUER() {
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
		
		JLabel lblIsbn = new JLabel("ISBN :");
		lblIsbn.setBounds(70, 65, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(158, 63, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeroDeCarte = new JLabel("numero de carte:");
		lblNumeroDeCarte.setBounds(26, 131, 186, 15);
		frame.getContentPane().add(lblNumeroDeCarte);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 129, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRestitution = new JLabel("RESTITUTION");
		lblRestitution.setBounds(176, 12, 123, 15);
		frame.getContentPane().add(lblRestitution);
		
		JButton btnValider = new JButton("VALIDER");
		btnValider.setBounds(257, 208, 117, 25);
		frame.getContentPane().add(btnValider);
		
		JButton btnPrecedent = new JButton("PRECEDENT");
		btnPrecedent.setBounds(70, 208, 117, 25);
		frame.getContentPane().add(btnPrecedent);
	}
}
