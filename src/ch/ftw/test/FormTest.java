package ch.ftw.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.ftw.model.Line;

public class FormTest {

	@Test
	public void testMovement() {
		Line l = new Line(500, 300, 100, 100);
		assertXY(500, 300, l.getX(), l.getY());
		l.move(150, 100);
		assertXY(500 + 150, 300 + 100, l.getX(), l.getY());
	}
	
	private void assertXY(int expectedX, int expectedY, int actualX, int actualY){
		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
	}

}
