package enums;

public enum Numero {
	AS("As"), DOS("2"), TRES("3"), CUATRO("4"),
	CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"),
	NUEVE("9"), DIEZ("10"), JOTO("Joto"), REINA("Reina"),
	REY("Rey");
	
	private final String numeroCarta;
	public static final int NUM_VALORES = 13;
	
	private Numero(String num) {
		numeroCarta = num;
	}
	public String toString() {
		return numeroCarta;
	}
	
}
