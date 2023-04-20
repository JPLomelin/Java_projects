package Clase;

public enum Dia {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
	
	private String [] arrEsp = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
	private String [] arrIng = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private String [] arrFra = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
	
	public static Idioma actual = Idioma.ESPAÑOL;
	
	public String toString() {
		switch (actual){
		case INGLES: 
			return arrIng[ordinal()];
			
		case FRANCES:
			return arrFra[ordinal()];
		default:
			return arrEsp[ordinal()];
		}
	}
	
	public static void cambiarIdioma(Idioma idioma) {
		actual=idioma;
	}
}