package enums;

public enum Figura {
	CORAZON("Corazón"), TREBOL("Trébol"), DIAMANTE("Diamante"), ESPADA("Espada");
	
	private final String nombreFigura;
	public static final int NUM_FIGURAS = 4;
	
	private Figura(String nombre) {
		nombreFigura = nombre;
	}
	
	public String toString() {
		return nombreFigura;
	}

}
