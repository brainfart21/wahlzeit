package org.wahlzeit.model;

public class CartesianCoordinate implements Coordinate {

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


	private double doGetCartesianDistance(CartesianCoordinate coordinate){
		return Math.sqrt(Math.pow((this.getX() - coordinate.getX()), 2)
					   + Math.pow((this.getY() - coordinate.getY()), 2)
					   + Math.pow((this.getZ() - coordinate.getZ()), 2));
	}

	@Override
	public CartesianCoordinate asCartesianCoordinate() {
			return this;
	}

	@Override
	public double getCartesianDistance(Coordinate coordinate) {
		CartesianCoordinate tmpArg = coordinate.asCartesianCoordinate();
		return this.doGetCartesianDistance(tmpArg);
	}

	@Override
	public SphericCoordinate asSphericCoordinate() {
		double radius = this.doGetCartesianDistance(new CartesianCoordinate());
		double theta = Math.acos(this.getZ()/radius);
		double phi = Math.atan2(this.getY(), this.getX());

		return new SphericCoordinate(radius, phi, theta);
	}

	@Override
	public double getCentralAngle(Coordinate coordinate) {
		SphericCoordinate tmpThis = this.asSphericCoordinate();
		return tmpThis.getCentralAngle(coordinate);
	}

	@Override
	public String toString() {
		return "CartesianCoordinate{" +
				"x=" + this.getX() +
				", y=" + this.getY() +
				", z=" + this.getZ() +
				'}';
	}

	@Override
	public boolean isEqual(Coordinate coordinate){
		CartesianCoordinate tmpArg = coordinate.asCartesianCoordinate();
		double delta = 0.000001;
		return 	   Math.abs(this.getX() - tmpArg.getX()) < delta
				&& Math.abs(this.getY() - tmpArg.getY()) < delta
				&& Math.abs(this.getZ() - tmpArg.getZ()) < delta;
	}
}
