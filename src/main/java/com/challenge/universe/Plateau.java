package com.challenge.universe;

/**
 * Plateau is an object that has bounding coordinates for bottom left and top right with which it is initialized. 
 * Additionally it can help check whether a given pair of coordinates is within Pleatue or not.
 *
 * @author ashik
 */
public class Plateau {

    private Coordinates topRightCoordinates = new Coordinates(0, 0);
    private Coordinates bottomLeftCoordinates = new Coordinates(0, 0);

    public Plateau(final int topRightXCoordinate, final int topRightYCoordinate) {
        this.topRightCoordinates = this.topRightCoordinates.getNewCoordinatesFor(topRightXCoordinate, topRightYCoordinate);
    }

    public boolean hasWithinBounds(final Coordinates coordinates) {
        return this.bottomLeftCoordinates.hasOutsideBounds(coordinates) && this.topRightCoordinates.hasWithinBounds(coordinates);
    }

}
