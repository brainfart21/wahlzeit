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

	public Photo createPhoto(Bread bread) {
		return new BreadPhoto(bread);
	}

	/**
	 * @methodtype factory
	 */
	@Override
	public Photo createPhoto(PhotoId id) {
		return new BreadPhoto(id);
	}

	public Photo createPhoto(Bread bread, PhotoId id) {
		return new BreadPhoto(bread, id);
	}
}