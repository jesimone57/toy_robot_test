package r3;

public class Robot {
	
	private Integer positionX;
	private Integer positionY;
	private Facing facing;
	private TableTop tableTop;
	private enum Turning {LEFT, RIGHT;}
	private boolean isPlaceAllowed;
	
	public Integer getPositionX() {
		return positionX;
	} 
	
	public Integer getPositionY() {
		return positionY;
	}
	
	public Facing getFacing() {
		return facing;
	}
	
	public TableTop getTableTop() {
		return tableTop;
	}
	
	public boolean isPlaceAllowed() {
		return isPlaceAllowed;
	}
	
	public Robot(TableTop tableTop) {
		if (tableTop == null) {
			throw new IllegalArgumentException("Robot constructor arg tableTop must not be null");
		}
		this.tableTop = tableTop;
	}
	
	public boolean place(int initialPositionX, int initialPositionY, Facing initialFacing) {
		isPlaceAllowed = tableTop.isPositionAllowed(initialPositionX, initialPositionY);
		if (isPlaceAllowed && initialFacing != null) {
			positionX = initialPositionX;
			positionY = initialPositionY;
			facing = initialFacing;
		} else {
			isPlaceAllowed = false;
			System.out.println("Initial robot placement is invalid for X="+initialPositionX+" Y="+initialPositionY+" Facing="+initialFacing);
		}
		return isPlaceAllowed;
	}
	
	public boolean move() {
		boolean isMoveAllowed = false;
		
		if (isPlaceAllowed) {
			
			int newX = positionX;
			int newY = positionY;
			
			switch (facing) {
			case NORTH:
				newY++;
				break;
			case SOUTH:
				newY--;
				break;
			case EAST:
				newX++;
				break;
			case WEST:
				newX--;
				break;
			}
			
			isMoveAllowed = tableTop.isPositionAllowed(newX, newY);
			if (isMoveAllowed) {
				positionX = newX;
				positionY = newY;
			} else {
				System.out.println("Invalid move to position X="+newX+" Y="+newY+" while facing "+facing+"  Ignored.");
			}
			
		} else {
			System.out.println("No valid PLACE command issued.  MOVE ignored.");
		}
		
		return isMoveAllowed;
	}
	
	public void left() {
		if (isPlaceAllowed) {
			turn(Turning.LEFT);
		} else {
			System.out.println("No valid PLACE command issued.  LEFT ignored.");
		}
	}
	
	public void right() {
		if (isPlaceAllowed) {
			turn(Turning.RIGHT);
		} else {
			System.out.println("No valid PLACE command issued.  RIGHT ignored.");
		}
	}
	
	public String report() {
		String report = null;
		if (isPlaceAllowed) {
			report = positionX+","+positionY+","+facing.toString();
			System.out.println(report);
		} else {
			System.out.println("No valid PLACE command issued.  REPORT ignored.");
		}
		return report;
	}
	
	private void turn(Turning turning) {
		switch (facing) {
		case NORTH:
			facing = (turning == Turning.LEFT ? Facing.WEST : Facing.EAST) ;
			break;
		case SOUTH:
			facing = (turning == Turning.LEFT ? Facing.EAST : Facing.WEST) ;
			break;
		case EAST:
			facing = (turning == Turning.LEFT ? Facing.NORTH : Facing.SOUTH) ;
			break;
		case WEST:
			facing = (turning == Turning.LEFT ? Facing.SOUTH : Facing.NORTH) ;
			break;
		}
	}

}
