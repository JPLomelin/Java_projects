package world;

public class world {
	
	public static void land(Flyable obj) {
		while(obj.getHeight() > 0)
			obj.descend();
	}
	public static void flyToTop(Flyable obj) {
		while(obj.getHeight() < 100)
			obj.rise();
	}
	public static void stop(Vehicle obj) {
		while(obj.getSpeed() > 0)
			obj.slowDown();
	}
	public static void reachSpeed(Vehicle obj, float topSpeed) {
		while(obj.getSpeed() < topSpeed)
			obj.speedUp();
	}

	public static void main(String[] args) {
/*		Bird b1 = new Bird();
		b1.rise();
		b1.descend();
		b1.descend();
		b1.descend();
		System.out.println("B1 current height: " + b1.getHeight());
		b1.sleep();
		b1.move();
//		b1.die();
		land(b1);
		
		System.out.println();
		
		Bird b2 = new Bird();
		for (int i=1; i<=25; i++) {
			b2.rise();
		}
		System.out.println("B2 current height: " + b2.getHeight());
		land(b2);*/
		
		Flyable kite = new Flyable() {
			private static final double HEIGHT_UP = 5;
			private static final double HEIGHT_DOWN = 2.5;
			
			private double height = 0;
			

			@Override
			public void rise() {
				height += HEIGHT_UP;
				height = (height <= MAX_HEIGHT) ? height : MAX_HEIGHT;
				System.out.println(" Kite rises at " + height);
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
		};
		
		flyToTop(kite);
		land(kite);
		
	}

}
