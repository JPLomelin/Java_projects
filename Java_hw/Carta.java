package enums;

public class Carta {
	
	private Numero numero;
	private Figura figura;
	
	public Carta(Numero numero, Figura figura) {
		this.figura = figura;
		this.numero = numero;
	}
	
	public String toString() {
		return numero + " de " + figura;
	}
	
	
}
