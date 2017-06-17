import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TableTopTest {

	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionZero() {
		new SquareTableTop(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionOne() {
		new SquareTableTop(1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionNegative() {
		new SquareTableTop(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constructorExceptionDimensionExceeds() {
		new SquareTableTop(1000);
	}

	@Test
	public void positionIsAllowed() {
		TableTop tableTop = new SquareTableTop(5);
		assertTrue(tableTop.isPositionAllowed(0, 0));
		assertTrue(tableTop.isPositionAllowed(0, 1));
		assertTrue(tableTop.isPositionAllowed(0, 2));
		assertTrue(tableTop.isPositionAllowed(0, 3));
		assertTrue(tableTop.isPositionAllowed(0, 4));
		
		assertTrue(tableTop.isPositionAllowed(0, 0));
		assertTrue(tableTop.isPositionAllowed(1, 0));
		assertTrue(tableTop.isPositionAllowed(2, 0));
		assertTrue(tableTop.isPositionAllowed(3, 0));
		assertTrue(tableTop.isPositionAllowed(4, 0));
	}
	
	@Test
	public void positionIsNotAllowed() {
		TableTop tableTop = new SquareTableTop(5);
		assertFalse(tableTop.isPositionAllowed(0, -1));
		assertFalse(tableTop.isPositionAllowed(-1, -1));
		assertFalse(tableTop.isPositionAllowed(-1, 0));
		
		assertFalse(tableTop.isPositionAllowed(0, 5));
		assertFalse(tableTop.isPositionAllowed(5, 5));
		assertFalse(tableTop.isPositionAllowed(5, 0));
	}
	

}
