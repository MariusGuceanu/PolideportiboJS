package controlador;

import modelo.UsuariosModelo;
import vista.GestorUsuarios;

public class ControladorUsuarios {

	private UsuariosModelo us;
	private vista.GestorUsuarios gu;

	public ControladorUsuarios(UsuariosModelo us, GestorUsuarios gu) {
		
		this.us = us;
		this.gu = gu;
		
		
	}

	public void inicializar() {
		
		this.gu.setTitle("Usuarios");
		gu.setLocationRelativeTo(null);
		gu.setVisible(false);
		
		
	}

	

}
