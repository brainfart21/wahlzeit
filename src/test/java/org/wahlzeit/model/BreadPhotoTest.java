package org.wahlzeit.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BreadPhotoTest {
BreadPhotoFactory factory = new BreadPhotoFactory();


	@Test
	public void notNullTest(){
		Photo photo = factory.createPhoto();
		BreadPhoto photo2 = new BreadPhoto();
		assertNotNull(photo);
	}
}
