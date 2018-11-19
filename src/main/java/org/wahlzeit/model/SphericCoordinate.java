package org.wahlzeit.model;

public class SphericCoordinate implements Coordinate {

	private double radius, phi, theta;


	public SphericCoordinate(double radius, double phi, double theta) {
		this.radius = radius;
		this.phi = phi;
		this.theta = theta;
	}

	public SphericCoordinate(Coordinate coordinate){
		if (coordinate == null)
			this.setSphericCoordinate(0, 0, 0);
		else {
			SphericCoordinate tmpArg = coordinate.asSphericCoordinate();
			this.setSphericCoordinate(tmpArg);
		}
	}

	public SphericCoordinate(){
		this(null);
	}

	public double getRadius() {
		return radius;
	}

	private void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPhi() {
		return phi;
	}

	private void setPhi(double phi) {
		this.phi = phi;
	}

	public double getTheta() {
		return theta;
	}

	private void setTheta(double theta) {
		this.theta = theta;
	}

	private void setSphericCoordinate(double radius, double phi, double theta) {
		this.setRadius(radius);
		this.setPhi(phi);
		this.setTheta(theta);
	}

	private void setSphericCoordinate(SphericCoordinate coordinate){
		this.setSphericCoordinate(coordinate.getRadius(), coordinate.getPhi(), coordinate.getTheta());
	}

	private double doGetCentralAngle(SphericCoordinate coordinate) {
		return Math.acos(Math.sin(this.getPhi()) * Math.sin(coordinate.getPhi())
				+ Math.cos(this.getPhi()) * Math.cos(coordinate.getPhi())
				* Math.cos(coordinate.getTheta() - this.getTheta())	);
	}

	@Override
	public CartesianCoordinate asCartesianCoordinate() {
		double x = this.getRadius() * Math.sin(this.getTheta()) * Math.cos(this.getPhi());
		double y = this.getRadius() * Math.sin(this.getTheta()) * Math.sin(this.getPhi());
		double z = this.getRadius() * Math.cos(this.getTheta());
		return new CartesianCoordinate(x, y, z);
	}

	@Override
	public double getCartesianDistance(Coordinate coordinate) {
		CartesianCoordinate tmpThis = this.asCartesianCoordinate();
		return tmpThis.getCartesianDistance(coordinate);
	}

	@Override
	public SphericCoordinate asSphericCoordinate() {
		return this;
	}

	@Override
	public double getCentralAngle(Coordinate coordinate) {
		SphericCoordinate tmpArg = coordinate.asSphericCoordinate();
		return this.doGetCentralAngle(tmpArg);
	}

	@Override
	public boolean isEqual(Coordinate coordinate) {
		SphericCoordinate tmpArg = coordinate.asSphericCoordinate();
		double delta = 0.000001;
		return 	   Math.abs(this.getRadius() - tmpArg.getRadius()) < delta
				&& Math.abs(this.getPhi() - tmpArg.getPhi()) < delta
				&& Math.abs(this.getTheta() - tmpArg.getTheta()) < delta;
	}

	@Override
	public String toString() {
		return "SphericCoordinate{" +
				"radius=" + radius +
				", phi=" + phi +
				", theta=" + theta +
				'}';
	}
}
