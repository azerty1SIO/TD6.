import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Checkbox;

public class test {

	private JFrame frame;
	private JTextField txtRechercheDeLivre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
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
		
		JButton btnEmprunterUnLivre = new JButton("EMPRUNTER UN LIVRE");
		btnEmprunterUnLivre.setBounds(12, 71, 199, 25);
		frame.getContentPane().add(btnEmprunterUnLivre);
		
		JButton btnRestituerUnLivre = new JButton("RESTITUER UN LIVRE");
		btnRestituerUnLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRestituerUnLivre.setBounds(12, 108, 199, 25);
		frame.getContentPane().add(btnRestituerUnLivre);
		
		JButton btnSeConnecter = new JButton("SE CONNECTER");
		btnSeConnecter.setBounds(61, 189, 137, 25);
		frame.getContentPane().add(btnSeConnecter);
		
		JButton btnSinscrire = new JButton("S'INSCRIRE");
		btnSinscrire.setBounds(286, 189, 117, 25);
		frame.getContentPane().add(btnSinscrire);
		
		JLabel lblBibliothequeDeCourbevoie = new JLabel("BIBLIOTHEQUE DE COURBEVOIE");
		lblBibliothequeDeCourbevoie.setBounds(110, 0, 237, 15);
		frame.getContentPane().add(lblBibliothequeDeCourbevoie);
		
		txtRechercheDeLivre = new JTextField();
		txtRechercheDeLivre.setText("recherche de livre");
		txtRechercheDeLivre.setBounds(286, 24, 131, 19);
		frame.getContentPane().add(txtRechercheDeLivre);
		txtRechercheDeLivre.setColumns(10);
		
		Checkbox checkbox = new Checkbox("New check box");
		checkbox.setBounds(423, 24, 115, 23);
		frame.getContentPane().add(checkbox);
	}
}
