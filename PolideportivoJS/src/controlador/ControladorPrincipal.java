package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.UsuariosModelo;
import vista.GestorUsuarios;
import vista.Principal;

public class ControladorPrincipal implements ActionListener {
	
	private Principal frmPrincipal;

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==frmPrincipal.getBtnUsr()) {
			UsuariosModelo us = new UsuariosModelo();
			vista.GestorUsuarios gu = new GestorUsuarios();
			
			ControladorUsuarios cu = new ControladorUsuarios(us, gu);
			cu.inicializar();
			gu.setVisible(true);
		}

		if(e.getSource()==frmPrincipal.getBtnAct()) {
			JOptionPane.showMessageDialog(null, "Gestor Actividades");
		}
		
		if(e.getSource()==frmPrincipal.getBtnIns()) {
			JOptionPane.showMessageDialog(null, "Gestor Inscripciones");
		}
		
	}

	public ControladorPrincipal(Principal principal) {
		
		this.frmPrincipal = principal;
		
		frmPrincipal.getBtnUsr().addActionListener(this);
		frmPrincipal.getBtnAct().addActionListener(this);
		frmPrincipal.getBtnIns().addActionListener(this);		
		
	}
	
	public void inicializar() {
		frmPrincipal.setTitle("desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);
	}
}
