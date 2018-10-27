package org.wahlzeit.model;

public class Location {
    private String name;
    private Coordinate coordinate;


    public Location(String name) {
        this.name = name;
    }


    public Location(String name, Coordinate coordinate) {
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

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
       if (coordinate == null){
           return "Location name: " + this.getName();
       }

       return "Location name" + this.getName() + " Coordinates: " + coordinate.toString();
    }
}
