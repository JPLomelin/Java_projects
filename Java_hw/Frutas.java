package frutería;

public enum Frutas {
	
	MANZANA(32.5), PERA(24.9), PLATANO(15.8), NARANJA(29.9), PIÑA(19.9), MANGO(18.9), MELÓN(26.9), SANDIA(25.0), KIWI(20.5), AGUACATE(39.9), 
	UVA(38.5), DURAZNO(35.9), PAPAYA(18.9), LIMÓN(28.5);
	
	private double precioPorKiloF;
	
	private Frutas(double precio_kilof) {
		this.precioPorKiloF = precio_kilof;
	}
	
	public double precioPorKiloF() {
		return precioPorKiloF;
	}

}
