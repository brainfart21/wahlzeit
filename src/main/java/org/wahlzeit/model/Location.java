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

public class Location {
    private String name;
    private CartesianCoordinate coordinate;


    public Location(String name) {
        this.name = name;
    }


    public Location(String name, CartesianCoordinate coordinate) {
        this.name = name;
        this.coordinate = coordinate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(CartesianCoordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
       if (coordinate == null){
           return "Location name: " + this.getName();
       }

       return "Location name: " + this.getName() + "; Coordinate: " + this.getCoordinate().toString();
    }
}
