import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class maquette2 {

	private JFrame frame;
	private JTextField txtIdentifiant;
	private JTextField txtMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maquette2 window = new maquette2();
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
	public maquette2() {
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
		
		txtIdentifiant = new JTextField();
		txtIdentifiant.setBounds(170, 91, 114, 19);
		txtIdentifiant.setText("identifiant");
		frame.getContentPane().add(txtIdentifiant);
		txtIdentifiant.setColumns(10);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setText("mot de passe");
		txtMotDePasse.setBounds(170, 122, 114, 19);
		frame.getContentPane().add(txtMotDePasse);
		txtMotDePasse.setColumns(10);
		
		JButton btnSeConnecter = new JButton("se connecter");
		btnSeConnecter.setBounds(162, 166, 136, 25);
		frame.getContentPane().add(btnSeConnecter);
	}
}
