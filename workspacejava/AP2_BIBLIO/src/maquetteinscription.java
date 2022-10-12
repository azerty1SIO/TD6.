import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class maquetteinscription {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtDateDeNaissance;
	private JTextField txtAdresse;
	private JTextField txtCodePosta;
	private JTextField txtCourriel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maquetteinscription window = new maquetteinscription();
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
	public maquetteinscription() {
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
		
		JLabel lblInscription = new JLabel("INSCRIPTION");
		lblInscription.setBounds(182, 12, 87, 15);
		frame.getContentPane().add(lblInscription);
		
		txtNom = new JTextField();
		txtNom.setText("NOM");
		txtNom.setBounds(12, 55, 114, 19);
		frame.getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("PRENOM");
		txtPrenom.setBounds(12, 75, 114, 19);
		frame.getContentPane().add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtDateDeNaissance = new JTextField();
		txtDateDeNaissance.setText("DATE DE NAISSANCE");
		txtDateDeNaissance.setBounds(12, 97, 134, 19);
		frame.getContentPane().add(txtDateDeNaissance);
		txtDateDeNaissance.setColumns(10);
		
		txtAdresse = new JTextField();
		txtAdresse.setText("ADRESSE");
		txtAdresse.setBounds(12, 116, 114, 19);
		frame.getContentPane().add(txtAdresse);
		txtAdresse.setColumns(10);
		
		txtCodePosta = new JTextField();
		txtCodePosta.setText("CODE POSTA");
		txtCodePosta.setBounds(12, 135, 114, 19);
		frame.getContentPane().add(txtCodePosta);
		txtCodePosta.setColumns(10);
		
		txtCourriel = new JTextField();
		txtCourriel.setText("COURRIEL");
		txtCourriel.setBounds(12, 157, 114, 19);
		frame.getContentPane().add(txtCourriel);
		txtCourriel.setColumns(10);
		
		JRadioButton rdbtnFemme = new JRadioButton("FEMME");
		rdbtnFemme.setBounds(102, 190, 149, 23);
		frame.getContentPane().add(rdbtnFemme);
		
		JRadioButton rdbtnHomme = new JRadioButton("HOMME");
		rdbtnHomme.setBounds(271, 190, 149, 23);
		frame.getContentPane().add(rdbtnHomme);
		
		JButton btnInscription = new JButton("INSCRIPTION");
		btnInscription.setBounds(170, 221, 134, 25);
		frame.getContentPane().add(btnInscription);
	}
}
