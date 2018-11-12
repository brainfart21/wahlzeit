package org.wahlzeit.model;

public class BreadPhotoFactory extends PhotoFactory{


	/**
	 * @methodtype constructor
	 */
	public BreadPhotoFactory() {
		super();
	}

	/**
	 * @methodtype factory
	 */
	@Override
	public Photo createPhoto() {
		return new BreadPhoto();
	}

	/**
	 * @methodtype factory
	 */
	@Override
	public Photo createPhoto(PhotoId id) {
		return new BreadPhoto(id);
	}
}