package org.wahlzeit.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BreadTest {

	Bread brot1 = new Bread("Brot1", "Teig", 1, "Etwas");
	Bread brot2 = new Bread("Brot1", "Teig", 1, "Etwas");
	Bread brot0 = new Bread();

	@Test
	public void testNullBread(){
		assertTrue(brot0 != null);
		assertTrue(brot0.getName() != null);
		assertTrue(brot0.getDoughType() != null);
		assertTrue(brot0.getToppings() != null);
	}

	@Test
	public void testEquals(){
		assertTrue(brot1.equals(brot2));
		assertTrue(!brot0.equals(brot1));
		assertTrue(!brot0.equals(new Object()));
	}

	@Test
	public void testBreadToString(){
		assertTrue(brot1.toString().equals("Bread{" +
				"name='" + brot1.getName() + '\'' +
				", doughType='" + brot1.getDoughType() + '\'' +
				", age=" + brot1.getAge() +
				", toppings=" + brot1.getToppings() +
				'}'));
	}
}
