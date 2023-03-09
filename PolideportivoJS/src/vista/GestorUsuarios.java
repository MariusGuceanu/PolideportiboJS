package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private DefaultTableModel tableModel;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			GestorUsuarios dialog = new GestorUsuarios();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public GestorUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnInsertarUsr = new JButton("Insertar");
		btnInsertarUsr.setBounds(37, 36, 89, 23);
		contentPanel.add(btnInsertarUsr);
		
		JButton btnEliminarUsr = new JButton("Eliminar");
		btnEliminarUsr.setBounds(37, 96, 89, 23);
		contentPanel.add(btnEliminarUsr);
		
		JButton btnModificarUsr = new JButton("Modificar");
		btnModificarUsr.setBounds(37, 156, 89, 23);
		contentPanel.add(btnModificarUsr);
		
		this.tableModel = new DefaultTableModel();
		
		tableModel.addColumn("No_Ap");
		tableModel.addColumn("DNI");
		tableModel.addColumn("Codigo");
		
		textField = new JTextField();
		textField.setBounds(149, 54, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 121, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 186, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNombre_Ap = new JLabel("Nombre_Apellido");
		lblNombre_Ap.setBounds(149, 29, 108, 14);
		contentPanel.add(lblNombre_Ap);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(181, 100, 28, 14);
		contentPanel.add(lblDni);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(176, 160, 59, 14);
		contentPanel.add(lblCodigo);
		
		JButton btnBuscarUsr = new JButton("Buscar por Id");
		btnBuscarUsr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarUsr.setBounds(267, 36, 146, 23);
		contentPanel.add(btnBuscarUsr);
		
		textField_3 = new JTextField();
		textField_3.setBounds(267, 70, 146, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
}
