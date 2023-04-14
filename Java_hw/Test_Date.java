package tareas;

public class Test_Date {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		Date d2 = new Date(31,12,2016);
		Date d3 = d1.clone(); 
		Date d4 = new Date(d1.day,d2.month,d3.year,1);
		Date d5 = d2.clone();
		d5.next();
		d3.setMonth(4);
//		System.out.println(d1.equals(d3));
//		System.out.println(d1.equals(d5));
		
		
		Date []arrFechas = {d1, d2, d3, d4, d5}; 
		for(Date x : arrFechas) {
			for (int i = 0; i < 3; i++) {
			x.setFormat(i);
			System.out.println(x);}System.out.println();}

	}

}
