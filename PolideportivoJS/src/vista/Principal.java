package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	private JButton btnUsr;
	private JButton btnAct;
	private JButton btnIns;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Principal frame = new Principal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


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
		
		btnUsr = new JButton("Gestionar Usuarios");
		btnUsr.setBounds(145, 52, 180, 23);
		contentPane.add(btnUsr);
		
		btnAct = new JButton("Gestionar Actividades");
		btnAct.setBounds(145, 86, 180, 23);
		contentPane.add(btnAct);
		
		btnIns = new JButton("Gestionar Inscripciones");
		btnIns.setBounds(145, 120, 180, 23);
		contentPane.add(btnIns);
	}


	public JButton getBtnAct() {
		return btnAct;
	}

	public JButton getBtnUsr() {
		return btnUsr;
	}

	public JButton getBtnIns() {
		return btnIns;
	}


}
