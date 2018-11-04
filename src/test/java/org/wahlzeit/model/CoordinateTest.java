package org.wahlzeit.model;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class CoordinateTest {
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
}
