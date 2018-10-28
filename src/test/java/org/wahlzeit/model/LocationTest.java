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

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class LocationTest {

    @Test
    public void coordinateTest(){
        double x = 1, y = 2, z = 3;
        double[] coordinatesAsArray = {x, y, z};
        Coordinate coordinateFromOrdinate = new Coordinate(x + 1, y , z);
        Coordinate coordinateFromArray = new Coordinate(coordinatesAsArray);
        Coordinate coordinateFromCoordinate = new Coordinate(coordinateFromArray);

        //Get and set working correctly?
        assertTrue(coordinateFromOrdinate.getX() == x + 1);
        coordinateFromOrdinate.setX(x);
        assertTrue(coordinateFromOrdinate.getX() == x);

        //Coordinates from 3 sources correct? Also checks all 3 setCoordinate methods used in the constructor and every primitive get and set method.
        assertTrue(Arrays.equals(coordinateFromOrdinate.getCoordinate(), coordinatesAsArray));
        assertTrue(Arrays.equals(coordinateFromArray.getCoordinate(), coordinatesAsArray));
        assertTrue(Arrays.equals(coordinateFromCoordinate.getCoordinate(), coordinatesAsArray));
        //equals working correctly?
        assertTrue(coordinateFromOrdinate.equals(coordinateFromArray) == true);
        Coordinate zeroCoordinate = new Coordinate(0,0,0);
        assertTrue(coordinateFromOrdinate.equals(zeroCoordinate) == false);
        //toString output string correct?
        assertTrue(coordinateFromOrdinate.toString().equals("X: " + x + "; Y: " + y + "; Z: " +z));
        //Distance calculated correctly?
        assertTrue(coordinateFromOrdinate.getDistance(zeroCoordinate) == Math.sqrt(14));


    }

    @Test
    public void locationTest(){
        String LocationName = "Dummy";
        Location location = new Location(LocationName);
        //toString output string without coordinate correct?
        assertTrue(location.toString().equals("Location name: " + LocationName));
        Coordinate coordinate = new Coordinate(1, 2, 3);
        location.setCoordinate(coordinate);
        //toString output string with coordinate correct and coordinate correctly added?
        assertTrue(location.toString().equals("Location name: " + LocationName+ "; Coordinate: " + coordinate.toString()));
        //same when adding coordinates on instancing?
        location = new Location(LocationName, coordinate);
        assertTrue(location.toString().equals("Location name: " + LocationName+ "; Coordinate: " + coordinate.toString()));


    }







}
