import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EMPRUNT {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMPRUNT window = new EMPRUNT();
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
	public EMPRUNT() {
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
		
		JLabel lblEmprunt = new JLabel("EMPRUNT");
		lblEmprunt.setBounds(179, 12, 89, 15);
		frame.getContentPane().add(lblEmprunt);
		
		JLabel lblIsbn = new JLabel("ISBN :");
		lblIsbn.setBounds(73, 82, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		JLabel lblNumeroDeCarte = new JLabel("NUMERO DE CARTE :");
		lblNumeroDeCarte.setBounds(25, 121, 152, 15);
		frame.getContentPane().add(lblNumeroDeCarte);
		
		textField = new JTextField();
		textField.setBounds(185, 80, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 119, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAuteur = new JLabel("AUTEUR :");
		lblAuteur.setBounds(57, 148, 70, 15);
		frame.getContentPane().add(lblAuteur);
		
		JLabel lblTitreDuLivre = new JLabel("TITRE DU LIVRE :");
		lblTitreDuLivre.setBounds(57, 185, 120, 15);
		frame.getContentPane().add(lblTitreDuLivre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 183, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(185, 146, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnPrecedent = new JButton("PRECEDENT");
		btnPrecedent.setBounds(60, 232, 117, 25);
		frame.getContentPane().add(btnPrecedent);
		
		JButton btnValider = new JButton("VALIDER");
		btnValider.setBounds(243, 232, 117, 25);
		frame.getContentPane().add(btnValider);
	}

}
