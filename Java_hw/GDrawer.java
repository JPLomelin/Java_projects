package generic;

public class GDrawer <Type> {
	private Type objectInside = null;
	
	public void put( Type o ) {
		if(this.objectInside == null)
			this .objectInside = o;
	}
	
	public Type peek() {
		return objectInside;
	}
	
	public Type remove() {
		Type tmp = objectInside;
		objectInside = null;
		return tmp;
	}
	
	public String toString(Type o) {
		if(o == null) return "Cajón vacío";
		else {
			return "Cajón de " + objectInside.toString();
		}
	}
	
	
}
