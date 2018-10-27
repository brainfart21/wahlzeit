package org.wahlzeit.model;

import java.util.Arrays;

public class Coordinate {

    private double x;
    private double y;
    private double z;


    public Coordinate(double x,double y,double z){
        setCoordinates(x, y, z);
    }

    public Coordinate(double[] coordinates){
        setCoordinates(coordinates);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setCoordinates(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public void setCoordinates(double[] coordinateArray) {
        setX(coordinateArray[0]);
        setY(coordinateArray[1]);
        setZ(coordinateArray[2]);
    }

    public double[] getCoordinates(){
        double[] coordinateArray = {x, y, z};
        return coordinateArray;
    }

    @Override
    public String toString(){
        return "X: " + x + " Y: " + y + " Z: " + z;
    }

    public double getDistance(Coordinate coordinate){
        return Math.sqrt(Math.pow((getX() - coordinate.getX()), 2)
                       + Math.pow((getY() - coordinate.getY()), 2)
                       + Math.pow((getZ() - coordinate.getZ()), 2));
    }

    public boolean isEqual(Coordinate coordinate){
        return Arrays.equals(new double[]{x, y , z}, coordinate.getCoordinates());
    }

    public boolean equals(Coordinate coordinate) {
        return isEqual(coordinate);
    }
}
