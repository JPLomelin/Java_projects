package tareas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Memorama <G> {
	
	protected List<G> cartas;
	protected List<Integer> positions;
	protected G firstCard;
	protected int posFirstCard = 0;
	
	public Memorama() {
		cartas   = new ArrayList<G>();
		positions = new ArrayList<Integer>();
		firstCard = null;
		posFirstCard = -1;
	}
	
	public void agregaPar(G valor) {
		cartas.add(valor);
		cartas.add(valor);
	}
	
	public void revolver() {
		positions.clear();
		for(int i = 1; i <= cartas.size(); i++)
			positions.add(i);
		Collections.shuffle(positions);
		firstCard = null;
		posFirstCard = -1;
	}
	
	public G Carta1 (int posicion) {
		System.out.println("Aquí están tus cartas: \n-----------------------");
		if (posicion == posFirstCard) return firstCard;
		firstCard = cartas.get(positions.get(posicion - 1) -1);
		posFirstCard = posicion;
		return firstCard;
	}
	
	public G Carta2 (int posicion) {
		if (posicion == posFirstCard) return firstCard;
		G carta2 = cartas.get(positions.get(posicion - 1) -1);
		if (firstCard != null && firstCard.equals(carta2)) {
			cartas.remove(firstCard);
			cartas.remove(carta2);
			positions.remove(positions.indexOf(posFirstCard));
			positions.remove(positions.indexOf(posicion));
			firstCard = null;
			System.out.println("SE ELIMINA EL PAR");
			posFirstCard = -1;
		}
		if (cartas.isEmpty()) System.out.println("No quedan mas cartas");
		return carta2;
	}
	
}
