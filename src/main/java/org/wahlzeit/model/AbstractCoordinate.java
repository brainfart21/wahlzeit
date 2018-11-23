package org.wahlzeit.model;

public abstract class AbstractCoordinate implements Coordinate {

	@Override
	public abstract CartesianCoordinate asCartesianCoordinate();

	@Override
	public abstract SphericCoordinate asSphericCoordinate();

	@Override
	public double getCartesianDistance(Coordinate coordinate) {
		CartesianCoordinate tmpArg = coordinate.asCartesianCoordinate();
		CartesianCoordinate tmpThis = this.asCartesianCoordinate();
		return Math.sqrt(Math.pow((tmpThis.getX() - tmpArg.getX()), 2)
				+ Math.pow((tmpThis.getY() - tmpArg.getY()), 2)
				+ Math.pow((tmpThis.getZ() - tmpArg.getZ()), 2));
	}

	@Override
	public double getCentralAngle(Coordinate coordinate) {
		SphericCoordinate tmpArg = coordinate.asSphericCoordinate();
		SphericCoordinate tmpThis = this.asSphericCoordinate();
		return Math.acos(Math.sin(tmpThis.getPhi()) * Math.sin(tmpArg.getPhi())
				+ Math.cos(tmpThis.getPhi()) * Math.cos(tmpArg.getPhi())
				* Math.cos(tmpArg.getTheta() - tmpThis.getTheta())	);
	}

	@Override
	public boolean isEqual(Coordinate coordinate) {
		CartesianCoordinate tmpArg = coordinate.asCartesianCoordinate();
		CartesianCoordinate tmpThis = this.asCartesianCoordinate();
		double delta = 0.000001;
		return 	   Math.abs(tmpThis.getX() - tmpArg.getX()) < delta
				&& Math.abs(tmpThis.getY() - tmpArg.getY()) < delta
				&& Math.abs(tmpThis.getZ() - tmpArg.getZ()) < delta;
	}
}
