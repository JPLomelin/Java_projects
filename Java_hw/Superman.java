package world;

public class Superman extends Man implements Flyable {
	private static final double HEIGHT_UP = 20;
	private static final double HEIGHT_DOWN = 15;
	
	private double height = 0;
	private int power = 20;
	
	@Override
	public void rise() {
		height += HEIGHT_UP;
		height = (height <= MAX_HEIGHT) ? height : MAX_HEIGHT;
		System.out.println(" Superman rises at " + height);
	}

	@Override
	public void descend() {
		height -= HEIGHT_DOWN;
		height = (height < 0) ? 0: height;
		System.out.println(" Superman rises at " + height);
	}

	@Override
	public double getHeight() {
		return height;
	}
	
	public void runfast () {
		System.out.println(" Superman runs fast");
	}
	
	public void losePower (int krypto) {
		power -= krypto;
		power = (power < 0) ? 0: power;
		System.out.println("Superman looses power, current power: " + power);
		if (power == 0) die();
	}

}
