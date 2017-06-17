import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotReportTest extends RobotTestHelper {

	@Test
	public void report() {
		robot.place(0, 0, Facing.NORTH);
		assertEquals("0,0,NORTH", robot.report() );
	}
	
	@Test
	public void reportInvalidPlace() {
		robot.place(-1, 0, Facing.NORTH);
		assertEquals(null, robot.report() );
	}

}
