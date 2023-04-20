package enums;

public class Mazo {

	private Carta[]mazo = new Carta[Numero.NUM_VALORES * Figura.NUM_FIGURAS];
	private int posicion = 0;
	
	public Mazo() {
		for(int i=0; i<Figura.NUM_FIGURAS; i++)
			for(int j=0; j<Numero.NUM_VALORES; j++)
				mazo[i * Numero.NUM_VALORES + j] = new Carta(Numero.values()[j], Figura.values()[i]);
	}
	
	private void swap(int i, int j) {
		Carta tmp = mazo[i];
		mazo[i] = mazo[j];
		mazo[j] = tmp;
	}
	
	public void barajar() {
		int pos;
		for(int i = 0; i < Figura.NUM_FIGURAS * Numero.NUM_VALORES; i++) {
			pos = (int) (Math.random() * Figura.NUM_FIGURAS * Numero.NUM_VALORES);
			swap(i, pos);
		}
	}
	public Carta [] repartir(int numCartas) {
		Carta [] mano = new Carta[numCartas];
		for(int i = 0; i<numCartas; i++) {
			mano[i] = mazo[posicion++];
		}
		return mano;
	}
}
