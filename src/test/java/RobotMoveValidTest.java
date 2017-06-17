import org.junit.Test;

public class RobotMoveValidTest extends RobotTestHelper {

	@Test
	public void moveWhileFacingNorth() {
		robot.place(0, 0, Facing.NORTH);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 0, 1, Facing.NORTH, true, isMoveAllowed);
	}
	
	@Test
	public void moveWhileFacingSouth() {
		robot.place(1, 1, Facing.SOUTH);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 1, 0, Facing.SOUTH, true, isMoveAllowed);
	}
	
	@Test
	public void moveWhileFacingEast() {
		robot.place(1, 1, Facing.EAST);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 2, 1, Facing.EAST, true, isMoveAllowed);
	}
	
	@Test
	public void moveWhileFacingWest() {
		robot.place(1, 1, Facing.WEST);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 0, 1, Facing.WEST, true, isMoveAllowed);
	}

}
