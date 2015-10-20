package ch.ftw.test;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import ch.ftw.model.Line;
import ch.ftw.model.Rectangular;

public class FormTest {

	@Test
	public void testMovement() {
		Line l = new Line(new Point(500, 300), new Point(100, 100));
		assertXY(500, 300, l.getX(), l.getY());
		l.move(150, 100);
		assertXY(500 + 150, 300 + 100, l.getX(), l.getY());
		l.moveTo(1000, 2000);
		assertXY(1000, 2000, l.getX(), l.getY());
	}
	
	@Test
	public void testDrawFromMouse() {
		Rectangular r = new Rectangular();
		
	}
	
	private void assertXY(int expectedX, int expectedY, int actualX, int actualY){
		assertEquals(expectedX, actualX);
		assertEquals(expectedY, actualY);
	}

}
