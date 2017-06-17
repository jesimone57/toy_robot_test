package tests;

import org.junit.Test;

import r3.Facing;

public class RobotTurnRightTest extends RobotTestHelper {

	@Test
	public void turnRightWhileFacingNorth() {
		robot.place(0,0, Facing.NORTH);
		robot.right();
		validateRobotCurrentState(robot, 0, 0, Facing.EAST);
	}
	
	@Test
	public void turnRightWhileFacingSouth() {
		robot.place(0,0, Facing.SOUTH);
		robot.right();
		validateRobotCurrentState(robot, 0, 0, Facing.WEST);
	}
	
	@Test
	public void turnRightWhileFacingEast() {
		robot.place(0,0, Facing.EAST);
		robot.right();
		validateRobotCurrentState(robot, 0, 0, Facing.SOUTH);
	}
	
	@Test
	public void turnRightWhileFacingWest() {
		robot.place(0,0, Facing.WEST);
		robot.right();
		validateRobotCurrentState(robot, 0, 0, Facing.NORTH);
	}

}
