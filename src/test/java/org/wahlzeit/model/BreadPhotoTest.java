package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BreadPhotoTest {


	@Test
	public void notNullTest(){
		Photo photo = new Photo();
		assertNotNull(photo);
	}
}
