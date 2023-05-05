package tareas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Memorama <G> {
	
	protected List<G> cartas;
	protected List<Integer> positions;
	protected G firstCard;
	protected int posCarta1;
	protected int valor = 0;
	
	public Memorama() {
		cartas = new ArrayList<G>();
		positions = new ArrayList<Integer>();
		firstCard = null;
		posCarta1 = valor;
	}
	
	public void agregaPar(G valor) {
		cartas.add(valor);
		cartas.add(valor);
		cartas.add(valor);
	}
	
	public void revolver() {
		positions.clear();
		for(int i = 1; i <= cartas.size(); i++)
			positions.add(i);
		Collections.shuffle(positions);
		firstCard = null;
		posCarta1 = valor;
	}
	
	public G Carta1 (int posicion) {
		if (posicion == posCarta1) return firstCard;
		firstCard = cartas.get(positions.get(posicion - 1) - 1);
		posCarta1 = posicion;
		return firstCard;
	}
	
	public G Carta2 (int posicion) {
		if (posicion == posCarta1) return firstCard;
		G carta2 = cartas.get(positions.get(posicion - 1) - 1);
		if (firstCard != null && firstCard.equals(carta2)) {
			cartas.remove(firstCard);
			cartas.remove(carta2);
			positions.remove(positions.indexOf(posCarta1));
			positions.remove(positions.indexOf(posicion));
			firstCard = null;
			posCarta1 = valor;
		}
		if (cartas.isEmpty()) System.out.println("No quedan mas cartas");
		return carta2;
	}
	
}
