package sesion21;

public class TestLib {

	public static void main(String[] args) {
		
//		double x, y = 0;
		
		/*
		 * x = -9; try { y = 4*MiLib.squareRoot(x); } catch
		 * (NegativeNumberFoundException e) { //e.printStackTrace();
		 * System.out.println(e); }
		 * 
		 * System.out.println(y);
		 */
		
//		double a = 1, b = 8, c = 3;
//		double result;
//		
//		try {
//			result = MiLib.solve(a, b, c);
//			System.out.println("El resultado de la ecuación cuadrática es: " + result);
//		} catch (NegativeNumberFoundException e) {
//			System.out.println("Esa combinacion de valores en las variables no tiene solucion");
//		}
		
		double x = 3.5, y = -2.3;
		System.out.println("La magnitud del vector es: " + MiLib.magnitude(x, y));
		
	}

}
