package generic;

public class BiDrawer <T, U>{

	private T object1 = null;
	private U object2 = null;
	
	public void put1( T o ) {
		if(this.object1 == null)
			this .object1 = o;
	}
	
	public T peek1() {
		return object1;
	}
	
	public T remove1() {
		T tmp = object1;
		object1 = null;
		return tmp;
	}
	
	public void put2( U o ) {
		if(this.object2 == null)
			this .object2 = o;
	}
	
	public U peek2() {
		return object2;
	}
	
	public U remove2() {
		U tmp = object2;
		object2 = null;
		return tmp;
	}
	
	

}
