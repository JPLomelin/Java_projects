package world;

public class Bird extends Animal implements Flyable {

	private static final double HEIGHT_UP = 5;
	private static final double HEIGHT_DOWN = 2.5;
	
	private double height = 0;
	
	@Override
	public void rise() {
		height += HEIGHT_UP;
		height = (height <= MAX_HEIGHT) ? height : MAX_HEIGHT;
		System.out.println(" Bird rises at " + height);
	}

	@Override
	public void descend() {
		height -= HEIGHT_DOWN;
		height = (height < 0) ? 0: height;
		System.out.println(" Bird rises at " + height);
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public void move() {
		System.out.println(" Bird flies ");
	}

}
