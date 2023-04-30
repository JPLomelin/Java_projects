package Libgen;

import java.util.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;
//import sun.util.calendar.BaseCalendar.Date;

public class TestLibGen {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Vector <String> strVector = new Vector <> ();
		strVector.add("One");
		strVector.add("Two");
		strVector.add("Three");
		strVector.add("Four");
		strVector.add("One");
		strVector.add("Five");
		strVector.add("Six");
		strVector.add("Seven");
		strVector.add("Eight");
		strVector.add("One");
		strVector.add("Nine");
		strVector.add("Ten");
		
		LibGen.print(strVector);
		
		System.out.println();
		ArrayList<Double> dblArrLst = new ArrayList<>();

        System.out.println();
        dblArrLst.add(3.2);
        dblArrLst.add(6.5);
        dblArrLst.add(1.45);
        dblArrLst.add(2.5);
        dblArrLst.add(9.83);
        LibGen.print(dblArrLst);
        
        Stack<Date> datStack = new Stack<>();
        datStack.add(new Date());
        datStack.add(new Date(24,4,2023));
        datStack.add(new Date());
        datStack.add(new Date(1,1,2023));
        datStack.add(new Date(1,5,2023));

        LibGen.print(datStack);
        
//        System.out.println();
//        HashSet<String> strHashSet = new HashSet<>();
//        strHashSet.add("Uno");
//        strHashSet.add("Dos");
//        strHashSet.add("Tres");
//        strHashSet.add("Cuatro");
//        strHashSet.add("Cinco");
//        
//        LibGen.print(strHashSet);
        
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1500);
        intSet.add(2000);
        intSet.add(3000);
        
        System.out.println(LibGen.frequency(strVector, "One"));
        System.out.println(LibGen.frequency(intSet, 1500));
        
        System.out.println("El entero mayor de la colección es: " + LibGen.greatestInteger(intSet));
        
        HashSet<Number> nmbSet = new HashSet<>();
        nmbSet.add(3.5);
        nmbSet.add(20);
        nmbSet.add(1_000_000L);
        nmbSet.add(20000.345);
        
        System.out.println("El entero mayor es: " + LibGen.greatestInteger(intSet));
//      System.out.println("El numero mayor es: " + LibGen.greatestInteger(nmbSet));
        
//      System.out.println("El entero mayor es: " + LibGen.greatestNumber(intSet));
        System.out.println("El numero mayor es: " + LibGen.greatestNumber(nmbSet));
        
        ArrayDeque<Number> numberQueue = new ArrayDeque<Number>();
        numberQueue.offer(100);
        numberQueue.offer(35.5);
        
        ArrayDeque<Object> objectQueue = new ArrayDeque<Object>();
        objectQueue.offer("Hola");
        
        LibGen.changeQueue(objectQueue, numberQueue);
        System.out.println();
        LibGen.print(objectQueue);
        System.out.println();
        LibGen.print(numberQueue);
        
	}

}
