package org.wahlzeit.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class LocationTest {

    @Test
    public void coordinateTest(){
        double x = 1, y = 2, z = 3;
        double[] coordinatesAsArray = {x, y, z};
        Coordinate coordinateFromDiscrete = new Coordinate(x, y , z);
        Coordinate coordinateFromArray = new Coordinate(coordinatesAsArray);

        //Coordinates from discrete correct?
        assertTrue(Arrays.equals(coordinateFromDiscrete.getCoordinates(), coordinatesAsArray));
        //Coordinates from array correct?
        assertTrue(Arrays.equals(coordinateFromArray.getCoordinates(), coordinatesAsArray));
        //equals working correctly?
        assertTrue(coordinateFromDiscrete.equals(coordinateFromArray));
        //toString output string correct?
        assertTrue(coordinateFromArray.toString().equals("X: " + x + " Y: " + y + " Z: " +z));
        //Distance calculated correctly?
        assertTrue(coordinateFromDiscrete.getDistance(new Coordinate(0, 0, 0)) == Math.sqrt(14));


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
        assertTrue(location.toString().equals("Location name" + LocationName+ " Coordinates: " + coordinate.toString()));
        //same when adding coordinates on instancing?
        location = new Location(LocationName, coordinate);
        assertTrue(location.toString().equals("Location name" + LocationName+ " Coordinates: " + coordinate.toString()));


    }







}
