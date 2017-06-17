import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTurnLeftTest extends RobotTestHelper {

	@Test
	public void turnLeftWhileFacingNorth() {
		robot.place(0, 0, Facing.NORTH);
		robot.left();
		assertEquals("0,0,WEST", robot.report());
	}

	@Test
	public void turnLeftWhileFacingSouth() {
		robot.place(0, 0, Facing.SOUTH);
		robot.left();
		assertEquals("0,0,EAST", robot.report());
	}

	@Test
	public void turnLeftWhileFacingEast() {
		robot.place(0, 0, Facing.EAST);
		robot.left();
		assertEquals("0,0,NORTH", robot.report());
	}

	@Test
	public void turnLeftWhileFacingWest() {
		robot.place(0, 0, Facing.WEST);
		robot.left();
		assertEquals("0,0,SOUTH", robot.report());
	}

}
