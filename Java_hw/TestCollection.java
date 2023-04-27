package collections;

import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		
		//1.- Crear una lista diinámica sincronizada que almacene cadenas de texto
		Vector<String> vs1 = new Vector<>();
		
		//2.- Añadir los elementos uno, dos,..., seis
		vs1.add("uno");
		vs1.add("dos");
		vs1.add("tres");
		vs1.add("cuatro");
		vs1.add("cinco");
		vs1.add("seis");
		
		//3.- Imprimir todos los elementos añadidos con un ciclo for e índice
		for(int i = 0; i<vs1.size(); i++) {
			System.out.println(vs1.get(i));
		}
		
		//4.- Reemplazar el elemento "cuatro" por "dos"
		vs1.set(vs1.indexOf("cuatro"), "dos");
		

		//5.-Imprimir la posicion de los elementos "dos" y "cuatro"
		System.out.println("El elemento dos esta en la posicion " + vs1.indexOf("dos"));
		System.out.println("El elemento cuatro esta en la posicion " + vs1.indexOf("cuatro"));
		
		//6.- Reemplazar todos los elementos por su mayuscula
		for (int i = 0; i < vs1.size(); i++) {
			vs1.set(i, vs1.get(i).toUpperCase());
		}
		for(String s : vs1)
			System.out.println(s);
		
		//7.- Vaciar la lista con llamadas sucesivas a remove
		while(vs1.size() > 0)
			vs1.remove(0);
		
		for(String s : vs1)
			System.out.println(s);
	}

}
