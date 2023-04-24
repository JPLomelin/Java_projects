package world;

public abstract class Animal {
	protected int status;
	
	public void sleep() {
		System.out.println(" Sleeps ");
	}
	
	public void die () {
		System.out.println(" Dies ");
	}
	
	public abstract void move();
}
