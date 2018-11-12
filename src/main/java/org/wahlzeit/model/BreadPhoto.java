package org.wahlzeit.model;

public class BreadPhoto extends Photo {

    private Bread bread;

    public BreadPhoto() {
        super();
    }

    public BreadPhoto(PhotoId myId) {
        super(myId);
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
