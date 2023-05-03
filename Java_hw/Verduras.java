package frutería;

public enum Verduras {
	
	JITOMATE(12.5), CEBOLLA(14.6), LECHUGA(25.8), ESPINACA(21.0), BROCOLI(33.4), AJO(5.0), ZANAHORIA(12.0), BERENJENA(36.5), CILANTRO(23.0),
	PEREJIL(28.0);
	
	private double precioPorKiloV;
	
	private Verduras(double precio_kilof) {
		this.precioPorKiloV = precio_kilof;
	}
	
	public double precioPorKiloV() {
		return precioPorKiloV();
	}
	

}
