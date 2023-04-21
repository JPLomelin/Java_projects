package enums;

public class TestEnum {

	public static void main(String[] args) {
	
		Mazo m1 = new Mazo();
/*		Carta [] mano = m1.repartir(5);
		for(Carta carta : mano)
			System.out.println(carta);
		
		Carta[] mano2 = m1.repartir(5);
		for(Carta carta : mano2)
			System.out.println(carta);
*/
		m1.barajar();
		Carta[] mano = m1.repartir(5);
		for(Carta carta : mano)
			System.out.println(carta);
	}

}
