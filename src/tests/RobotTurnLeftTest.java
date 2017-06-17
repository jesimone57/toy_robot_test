package tests;

import org.junit.Test;

import r3.Facing;

public class RobotTurnLeftTest extends RobotTestHelper {

	@Test
	public void turnLeftWhileFacingNorth() {
		robot.place(0,0, Facing.NORTH);
		robot.left();
		validateRobotCurrentState(robot, 0, 0, Facing.WEST);
	}
	
	@Test
	public void turnLeftWhileFacingSouth() {
		robot.place(0,0, Facing.SOUTH);
		robot.left();
		validateRobotCurrentState(robot, 0, 0, Facing.EAST);
	}
	
	@Test
	public void turnLeftWhileFacingEast() {
		robot.place(0,0, Facing.EAST);
		robot.left();
		validateRobotCurrentState(robot, 0, 0, Facing.NORTH);
	}
	
	@Test
	public void turnLeftWhileFacingWest() {
		robot.place(0,0, Facing.WEST);
		robot.left();
		validateRobotCurrentState(robot, 0, 0, Facing.SOUTH);
	}

}
