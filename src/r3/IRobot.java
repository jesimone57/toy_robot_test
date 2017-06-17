package r3;

public interface IRobot {
	boolean place(int x, int y, Facing facing);
	boolean move();
	void left();
	void right();
	String report();
	
	boolean isPlaceAllowed();
}
