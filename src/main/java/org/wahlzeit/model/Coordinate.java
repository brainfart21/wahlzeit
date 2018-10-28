/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.wahlzeit.model;



public class Coordinate {

    private double x, y, z;


    public Coordinate(double x,double y,double z){
        setCoordinate(x, y, z);
    }

    public Coordinate(double[] coordinate){
        setCoordinate(coordinate);
    }

    public Coordinate(Coordinate coordinate) { this.setCoordinate(coordinate); }

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

    public void setCoordinate(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public void setCoordinate(double[] coordinateArray) {
        setCoordinate(coordinateArray[0], coordinateArray[1], coordinateArray[2]);
    }

    public void setCoordinate(Coordinate coordinate){
        this.setCoordinate(coordinate.getCoordinate());
    }

    public double[] getCoordinate(){
        double[] coordinateArray = {getX(), getY(), getZ()};
        return coordinateArray;
    }

    @Override
    public String toString(){
        return "X: " + x + "; Y: " + y + "; Z: " + z;
    }

    public double getDistance(Coordinate coordinate){
        return Math.sqrt(Math.pow((getX() - coordinate.getX()), 2)
                       + Math.pow((getY() - coordinate.getY()), 2)
                       + Math.pow((getZ() - coordinate.getZ()), 2));
    }

    public boolean isEqual(Coordinate coordinate){
        return java.util.Arrays.equals(this.getCoordinate(), coordinate.getCoordinate());
    }

    public boolean equals(Coordinate coordinate) {
        return isEqual(coordinate);
    }
}
