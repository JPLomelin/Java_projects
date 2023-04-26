package world;

public class Vehicle {
	private static double SPEED_INC = 10;
	private static double BREAK_SPEED = 5;
	public static double FUEL_SPENT = 2.5;
	protected double fuel = 0;
	protected double speed = 0;
	
	public void speedUp() {
		System.out.println(" speeding up "); 
		speed += SPEED_INC;
		fuel -= FUEL_SPENT;
		fuel = (fuel < 0)? 0 : fuel;
		}
	public void slowDown () {
		System.out.println(" slowing down "); 
		speed -= BREAK_SPEED;
		speed = (speed < 0) ? 0 : speed;
		}
	
	public double getSpeed () {return speed;}
	public double getFuel () { return fuel;}
	public void loadFuel (double f) {fuel += f;}
	
}
