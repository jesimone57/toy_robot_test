import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RobotPlaceTest extends RobotTestHelper {

	@Test
	public void validPlace() {
		for (int i = 0; i < robot.getTableTop().getDimensionX(); i++) {
			for (int j = 0; j < robot.getTableTop().getDimensionY(); j++) {
				for (Facing facing : Facing.values()) {
					boolean isPlaceAllowed = robot.place(i, j, facing);
					validateRobotCurrentState(robot, i, j, facing, true, isPlaceAllowed);
					assertTrue(robot.isPlaceAllowed());
				}
			}
		}
	}

	@Test
	public void invalidPlaceNegativeX() {
		boolean isPlaceAllowed = robot.place(-1, 0, Facing.NORTH);
		validateRobotCurrentState(robot, null, null, null, false, isPlaceAllowed);
		assertFalse(robot.isPlaceAllowed());
	}

	@Test
	public void invalidPlaceNegativeY() {
		boolean isPlaceAllowed = robot.place(0, -1, Facing.NORTH);
		validateRobotCurrentState(robot, null, null, null, false, isPlaceAllowed);
		assertFalse(robot.isPlaceAllowed());
	}

	@Test
	public void invalidPlaceExceedX() {
		boolean isPlaceAllowed = robot.place(5, 0, Facing.NORTH);
		validateRobotCurrentState(robot, null, null, null, false, isPlaceAllowed);
		assertFalse(robot.isPlaceAllowed());
	}

	@Test
	public void invalidPlaceExceedY() {
		boolean isPlaceAllowed = robot.place(0, 5, Facing.NORTH);
		validateRobotCurrentState(robot, null, null, null, false, isPlaceAllowed);
		assertFalse(robot.isPlaceAllowed());
	}

	@Test
	public void invalidPlaceFacingNull() {
		boolean isPlaceAllowed = robot.place(0, 0, null);
		validateRobotCurrentState(robot, null, null, null, false, isPlaceAllowed);
		assertFalse(robot.isPlaceAllowed());
	}
	
	@Test
	public void notPlaced() {
		validateRobotCurrentState(robot, null, null, null, false, robot.isPlaceAllowed());
	}
	
	@Test
	public void invalidPlaceAndMove() {
		robot.move();
		validateRobotCurrentState(robot, null, null, null, false, robot.isPlaceAllowed());
	}
	
	@Test
	public void invalidPlaceAndLeft() {
		robot.left();
		validateRobotCurrentState(robot, null, null, null, false, robot.isPlaceAllowed());
	}
	
	@Test
	public void invalidPlaceAndRight() {
		robot.right();
		validateRobotCurrentState(robot, null, null, null, false, robot.isPlaceAllowed());
	}
	
	@Test
	public void invalidPlaceAndReportt() {
		robot.report();
		validateRobotCurrentState(robot, null, null, null, false, robot.isPlaceAllowed());
	}

}
