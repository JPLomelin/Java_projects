package proyecto;

import java.awt.Color;

public class TestProyecto {
	
	public static void main(String[] args) {
		PantallaInicial pantallaPrincipal = new PantallaInicial();
		//establece en que parte de la pantalla aparece la gui
		pantallaPrincipal.setBounds(0,0,900,700);
		pantallaPrincipal.setBackground(Color.BLUE);
		//Hace que la interfaz grafica aparezca
		pantallaPrincipal.setVisible(true);
		//Hace que no se pueda cambiar el tamaño
		pantallaPrincipal.setResizable(false);
		//HAce que la interfaz salga en el centro de la pantalla
		pantallaPrincipal.setLocationRelativeTo(null);
		pantallaPrincipal.setTitle("Verduleria el wero");
	}
}