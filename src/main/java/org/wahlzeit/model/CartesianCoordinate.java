package org.wahlzeit.model;

public class CartesianCoordinate extends AbstractCoordinate {

	private double x , y, z;


	public CartesianCoordinate(double x,double y,double z){
		this.setCartesianCoordinate(x, y, z);
	}


	public CartesianCoordinate(Coordinate coordinate) {
		if (coordinate == null)
			this.setCartesianCoordinate(0, 0, 0);
		else {
			CartesianCoordinate tmpArg = coordinate.asCartesianCoordinate();
			this.setCartesianCoordinate(tmpArg);
		}
	}

	public CartesianCoordinate(){
		this(null);
	}

	public double getX() {
		return x;
	}

	private void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	private void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	private void setZ(double z) {
		this.z = z;
	}

	private void setCartesianCoordinate(double x, double y, double z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	private void setCartesianCoordinate(CartesianCoordinate coordinate){
			this.setCartesianCoordinate(coordinate.getX(), coordinate.getY(), coordinate.getZ());
	}

	@Override
	public CartesianCoordinate asCartesianCoordinate() {
			return this;
	}

	@Override
	public SphericCoordinate asSphericCoordinate() {
		double radius = this.getCartesianDistance(new CartesianCoordinate());
		double theta = Math.acos(this.getZ()/radius);
		double phi = Math.atan2(this.getY(), this.getX());

		return new SphericCoordinate(radius, phi, theta);
	}

	@Override
	public String toString() {
		return "CartesianCoordinate{" +
				"x=" + x +
				", y=" + y +
				", z=" + z +
				'}';
	}
}
