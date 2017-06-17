import org.junit.Test;

public class RobotMoveInvalidTest extends RobotTestHelper {

	@Test
	public void moveInvalidWhileFacingNorth() {
		robot.place(0, 4, Facing.NORTH);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 0, 4, Facing.NORTH, false, isMoveAllowed);
	}
	
	@Test
	public void moveInvalidWhileFacingSouth() {
		robot.place(4, 0, Facing.SOUTH);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 4, 0, Facing.SOUTH, false, isMoveAllowed);
	}
	
	@Test
	public void moveInvalidWhileFacingEast() {
		robot.place(4, 0, Facing.EAST);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 4, 0, Facing.EAST, false, isMoveAllowed);
	}
	
	@Test
	public void moveInvalidWhileFacingWest() {
		robot.place(0, 4, Facing.WEST);
		boolean isMoveAllowed = robot.move();
		validateRobotCurrentState(robot, 0, 4, Facing.WEST, false, isMoveAllowed);
	}

}
