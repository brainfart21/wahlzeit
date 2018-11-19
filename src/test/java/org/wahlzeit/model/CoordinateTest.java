package org.wahlzeit.model;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CoordinateTest {
	private final double pi = Math.PI, delta = 0.00001;

	private final double x = 1, y = 2, z = 3;
	private final double radius = 1, phi = pi/2.0, theta = pi/2.0;

	private final CartesianCoordinate CC = new CartesianCoordinate(x, y, z);
	private final SphericCoordinate SC = new SphericCoordinate(radius, phi, theta);
	private final CartesianCoordinate CC0 = new CartesianCoordinate();
	private final SphericCoordinate SC0 = new SphericCoordinate();

	@Test
	public void constructorTest() {
		assertTrue(CC.getX() == x && CC.getY() == y && CC.getZ() == z);
		assertTrue(CC0.getX() == 0 && CC0.getY() == 0 && CC0.getZ() == 0);
		assertTrue(SC.getRadius() == radius && SC.getPhi() == phi && SC.getTheta() == theta);
		assertTrue(SC0.getRadius() == 0 && SC0.getPhi() == 0 && SC0.getTheta() == 0);
	}


	@Test
	public void isEqualTest() {
		CartesianCoordinate CC2 = new CartesianCoordinate(CC);
		SphericCoordinate SC2 = new SphericCoordinate(SC);
		assertTrue(!CC.equals(CC2));
		assertTrue(!SC.equals(SC2));
		assertTrue(CC.isEqual(CC2));
		assertTrue(SC.isEqual(SC2));

		assertTrue(!CC.isEqual(CC0));
		assertTrue(!SC.isEqual(SC0));
	}

	@Test
	public void asSomethingTest() {
		assertTrue(CC.isEqual(CC.asCartesianCoordinate()));
		assertTrue(CC.isEqual(CC.asSphericCoordinate()));
		assertTrue(SC.isEqual(SC.asCartesianCoordinate()));
		assertTrue(SC.isEqual(SC.asSphericCoordinate()));

		CartesianCoordinate CC2 = new CartesianCoordinate(2,2,1);
		SphericCoordinate SC2 = new SphericCoordinate(3,pi/4,Math.acos(1.0/3.0));
		assertTrue(SC2.isEqual(CC2));
		assertTrue(CC2.isEqual(SC2));
	}

	@Test
	public void calculationTest() {
		CartesianCoordinate CC2 = new CartesianCoordinate(x,y,2*z);
		SphericCoordinate SC2 = new SphericCoordinate(radius,pi/3,theta);
		assertEquals(CC.getCartesianDistance(CC2), 3.0, delta);
		assertEquals(SC.getCartesianDistance(SC2), 0.517638, delta);
		assertEquals(CC.getCentralAngle(CC2), 0.126573, delta);
		assertEquals(SC.getCentralAngle(SC2), 0.523598, delta);
	}

	@Test
	public void toStringTest() {
		assertEquals(CC.toString(),
				"CartesianCoordinate{" +
				"x=" + CC.getX() +
				", y=" + CC.getY() +
				", z=" + CC.getZ() +
				'}');
		assertEquals(SC.toString(),
				"SphericCoordinate{" +
				"radius=" + radius +
				", phi=" + phi +
				", theta=" + theta +
				'}');
	}
}
