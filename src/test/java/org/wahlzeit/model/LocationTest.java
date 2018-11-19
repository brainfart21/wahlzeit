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

import static org.junit.Assert.assertTrue;

public class LocationTest {

    @Test
    public void locationTest(){
        String LocationName = "Dummy";
        Location location = new Location(LocationName);
        //toString output string without coordinate correct?
        assertTrue(location.toString().equals("Location name: " + LocationName));
        CartesianCoordinate coordinate = new CartesianCoordinate(1, 2, 3) {
		};
        location.setCoordinate(coordinate);
        //toString output string with coordinate correct and coordinate correctly added?
        assertTrue(location.toString().equals("Location name: " + LocationName+ "; Coordinate: " + coordinate.toString()));
        //same when adding coordinates on instancing?
        location = new Location(LocationName, coordinate);
        assertTrue(location.toString().equals("Location name: " + LocationName+ "; Coordinate: " + coordinate.toString()));


    }







}
