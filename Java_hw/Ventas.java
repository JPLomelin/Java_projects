package proyecto;

public class Ventas {
	double ventaTotal;
	double ventaTotalDia;
	
	public Ventas () {
		ventaTotal = 0;
		ventaTotalDia = 0;
	}
	
	public void sumarVenta (double venta) {
		ventaTotal += venta;
		ventaTotalDia += venta;
	}
	
	public double cortarVentaTotal () {
		double total = this.ventaTotal;
		//this.ventaTotal = 0;
		return total;
	}
	
	public double cortarVentaTotalDia () {
		double totalDia = this.ventaTotalDia;
		//double total = ventaTotal;
		ventaTotalDia = 0;
		//ventaTotal = 0;
		return totalDia;
	}
}