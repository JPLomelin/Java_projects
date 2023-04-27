package sesion25;

public class TestLib {

	public static void main(String[] args) {
		
		System.out.println(Lib.average(10, 9, 8, 7, 6, 5));
		System.out.println(Lib.average());
		
		int [] numbers = {10,20,30,40,50};
		System.out.println(Lib.average(numbers));
		
		System.out.println("Manhattan:");
		System.out.println(Lib.manhattan(4.5));
		System.out.println(Lib.manhattan(3, -2));
		System.out.println(Lib.manhattan(1, 1.4, 0.8));
		System.out.println(Lib.manhattan(0, 0, 1, 2, 3, 4));
		System.out.println(Lib.manhattan(1, 0, 1, 2, 3, 4));
		System.out.println(Lib.manhattan(2, 0, 1, 2, 3, 4));

	}

}
