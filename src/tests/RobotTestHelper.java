package tests;

import static org.junit.Assert.*;

import org.junit.Before;

import r3.Facing;
import r3.Robot;
import r3.SquareTableTop;

public class RobotTestHelper {

	protected Robot robot;
	
	@Before
	public void before() {
		robot = new Robot(new SquareTableTop(5));
	}

	public void validateRobotCurrentState(Robot robot, Integer expectedX, Integer expectedY, Facing expectedFacing) {
		assertEquals(expectedX,robot.getPositionX());
		assertEquals(expectedY,robot.getPositionY());
		assertEquals(expectedFacing, robot.getFacing());
	}
	
	public void validateRobotCurrentState(Robot robot, Integer expectedX, Integer expectedY, Facing expectedFacing, boolean expectedAllowed, boolean actualAllowed) {
		assertEquals(expectedX,robot.getPositionX());
		assertEquals(expectedY,robot.getPositionY());
		assertEquals(expectedFacing, robot.getFacing());
		assertEquals(expectedAllowed, actualAllowed);
	}

}
