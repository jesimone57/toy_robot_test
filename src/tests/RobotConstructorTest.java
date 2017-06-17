package tests;

import org.junit.Test;

import r3.Robot;

public class RobotConstructorTest {

	@Test(expected = IllegalArgumentException.class)
	public void constructRobot() {
		new Robot(null);
	}
	



}
