package world;

public interface Flyable {
	double MAX_HEIGHT = 100;
	
	void rise();
	void descend();
	double getHeight();
}
