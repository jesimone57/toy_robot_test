import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTurnRightTest extends RobotTestHelper {

	@Test
	public void turnRightWhileFacingNorth() {
		robot.place(0, 0, Facing.NORTH);
		robot.right();
		assertEquals("0,0,EAST", robot.report());
	}

	@Test
	public void turnRightWhileFacingSouth() {
		robot.place(0, 0, Facing.SOUTH);
		robot.right();
		assertEquals("0,0,WEST", robot.report());
	}

	@Test
	public void turnRightWhileFacingEast() {
		robot.place(0, 0, Facing.EAST);
		robot.right();
		assertEquals("0,0,SOUTH", robot.report());
	}

	@Test
	public void turnRightWhileFacingWest() {
		robot.place(0, 0, Facing.WEST);
		robot.right();
		assertEquals("0,0,NORTH", robot.report());
	}

}
