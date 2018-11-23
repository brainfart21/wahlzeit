package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class BreadPhoto extends Photo {

    private Bread bread;

	public BreadPhoto() {
		this(new Bread());
	}

	public BreadPhoto(Bread bread) {
		super();
		setBread(bread);
	}

	public BreadPhoto(PhotoId myId) {
		this(new Bread(), myId);
	}

	public BreadPhoto(Bread bread, PhotoId myId) {
		super(myId);
		setBread(bread);
	}

    public void setBread(Bread bread) {
        if (bread == null) {
            throw new IllegalArgumentException("Can't set null as bread!");
            //this.bread = new Bread();?
        }
        this.bread = bread;
    }

    public Bread getBread() {
        return bread;
    }








}
