package sesion25;

public class Lib {
	
	public static double average(int ...numbers) {
		if(numbers.length == 0) return 0;
		//calcular el promedio
		double sum = 0;
		
		for(int i : numbers)
			sum += i;
		return sum / numbers.length;
	}
	
	public static double manhattan(double pivote, double ...demas){
		if (demas.length == 0) return 0;
		
		double sum = 0;
		for(double d : demas)
			sum += Math.abs(pivote - d);
					
		return sum / demas.length;
		
	}
}
