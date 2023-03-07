package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsr = new JButton("Gestionar Usuarios");
		btnUsr.setBounds(145, 52, 123, 23);
		contentPane.add(btnUsr);
		
		JButton btnAct = new JButton("Gestionar Actividades");
		btnAct.setBounds(145, 86, 137, 23);
		contentPane.add(btnAct);
		
		JButton btnIns = new JButton("Gestionar Inscripciones");
		btnIns.setBounds(145, 120, 143, 23);
		contentPane.add(btnIns);
	}

}
