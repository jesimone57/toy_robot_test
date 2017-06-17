package r3;

public class SquareTableTop implements TableTop {

	private int dimensionX;
	private int dimensionY;

	public SquareTableTop(int dimension) {
		if (dimension < 2 || dimension > 100) {
			throw new IllegalArgumentException("Invalid dimension " + dimension + " must be between 2 and 100");
		}
		this.dimensionX = dimension;
		this.dimensionY = dimension;
	}

	@Override
	public int getDimensionX() {
		return dimensionX;
	}

	@Override
	public int getDimensionY() {
		return dimensionY;
	}

	@Override
	public boolean isPositionAllowed(int x, int y) {
		boolean positionAllowed = true;
		if (x < 0 || y < 0 || x >= dimensionX || y >= dimensionY) {
			positionAllowed = false;
		}
		return positionAllowed;
	}

}
