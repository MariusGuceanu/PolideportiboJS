package principal;

import controlador.ControladorPrincipal;
import vista.Principal;

public class App {

	public static void main(String[] args) {
		Principal frmPrincipal = new Principal();
		
		ControladorPrincipal cp = new ControladorPrincipal(frmPrincipal);
		cp.inicializar();
		frmPrincipal.setVisible(true);
		
		
	} 
}
