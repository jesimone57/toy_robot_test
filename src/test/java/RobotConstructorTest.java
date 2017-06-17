import org.junit.Test;

public class RobotConstructorTest {

	@Test(expected = IllegalArgumentException.class)
	public void constructRobot() {
		new Robot(null);
	}

}
