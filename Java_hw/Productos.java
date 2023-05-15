package proyecto;

import java.util.HashMap;
import java.util.Map;

public class Productos {
	Producto producto;
	double precio;
	static Map<Producto, Double> listaProductoPrecio;
	
	public Productos() {
	    listaProductoPrecio = new HashMap<>();
	    listaProductoPrecio.put(Producto.MANZANA, 15.0);
	    listaProductoPrecio.put(Producto.PERA, 12.5);
	    listaProductoPrecio.put(Producto.JITOMATE, 18.0);
	    listaProductoPrecio.put(Producto.CEBOLLA, 10.0);
	    listaProductoPrecio.put(Producto.PLATANO, 12.0);
	    listaProductoPrecio.put(Producto.NARANJA, 9.5);
	    listaProductoPrecio.put(Producto.PIÑA, 20.0);
	    listaProductoPrecio.put(Producto.MANGO, 15.0);
	    listaProductoPrecio.put(Producto.MELON, 18.0);
	    listaProductoPrecio.put(Producto.LECHUGA, 8.0);
	    listaProductoPrecio.put(Producto.ESPINACA, 9.0);
	    listaProductoPrecio.put(Producto.BROCOLI, 20.0);
	    listaProductoPrecio.put(Producto.AJO, 6.0);
	    listaProductoPrecio.put(Producto.ZANAHORIA, 8.5);
	    listaProductoPrecio.put(Producto.BERENJENA, 12.0);
	    listaProductoPrecio.put(Producto.SANDIA, 15.0);
	    listaProductoPrecio.put(Producto.KIWI, 18.0);
	    listaProductoPrecio.put(Producto.AGUACATE, 20.0);
	    listaProductoPrecio.put(Producto.UVA, 25.0);
	    listaProductoPrecio.put(Producto.DURAZNO, 16.0);
	    listaProductoPrecio.put(Producto.PAPAYA, 22.0);
	    listaProductoPrecio.put(Producto.LIMON, 7.5);
	    listaProductoPrecio.put(Producto.CILANTRO, 5.0);
	    listaProductoPrecio.put(Producto.PEREJIL, 5.0);
	}
	
	
	public double getPrecio (Producto p) {
		return listaProductoPrecio.get(p);
	}
	
}