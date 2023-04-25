package world;

public class Jet extends Vehicle implements Flyable {

	private static final double HEIGHT_UP = 10;
	private static final double HEIGHT_DOWN = 5;
	
	private double height = 0;
	
	@Override
	public void rise() {
		height += HEIGHT_UP;
		height = (height <= MAX_HEIGHT) ? height : MAX_HEIGHT;
		System.out.println(" Jet rises at " + height);
	}

	@Override
	public void descend() {
		height -= HEIGHT_DOWN;
		height = (height < 0) ? 0: height;
		System.out.println(" Jet rises at " + height);
	}

	@Override
	public double getHeight() {
		return height;
	}

}
