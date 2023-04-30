package Libgen;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

public class LibGen {

	public static void print (List <?> list) {
		for (int i=0; i<list.size();i++) 
			System.out.printf("%2d) %s\n", i+1, list.get(i));
		}
	
	public static <T> int frequency(Collection<T> collection, T object) {
		int n = 0;
		for(Object o : collection) 
			if(object.equals(o)) n ++;
		return n;
	}
	
	public static int greatestInteger(Collection<Integer> collection) {
		Integer G = null;
		for(Integer I : collection) 
			if(G == null || I > G) G = I;
		return G;
	}
	
	public static double greatestNumber(Collection<Number> collection) {
		Number G = null;
		for(Number N : collection) 
			if(G == null || N.doubleValue() > G.doubleValue()) G = N;
		return G.doubleValue();
	}
	
	public static void changeQueue(Queue<? super Number> dest, Queue<Number> src) {
		dest.offer(src.poll());
	}
	
	public static void print(Collection<?> collection) {
		for(Object o : collection)
			System.out.println(o);
	}
	
}