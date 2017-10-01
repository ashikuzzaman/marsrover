package com.challenge.universe;

/**
 * An object that represents "x" and "y" coordinate. 
 * It is immutable, to reflect that a position cannot be modified, only a new one can be obtained using one as reference. 
 * Additionally it exposes behavior to check if another coordinate is outside or within bounds from 0,0 to current coordinate.
 * 
 * @author ashik
 */

public class Coordinates {

    private int xCoordinate;
    private int yCoordinate;

    public Coordinates(final int xCoordinate, final int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinates getNewCoordinatesFor(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(this.xCoordinate + xCoordinateStepValue, this.yCoordinate + yCoordinateStepValue);
    }

    @Override
    public String toString() {
        StringBuilder coordinateOutput = new StringBuilder();
        coordinateOutput.append(xCoordinate);
        coordinateOutput.append(" ");
        coordinateOutput.append(yCoordinate);
        return coordinateOutput.toString();
    }

    public boolean hasWithinBounds(final Coordinates coordinates) {
        return isXCoordinateWithinBounds(coordinates.xCoordinate) && isYCoordinateWithinBounds(coordinates.yCoordinate);
    }

    public boolean hasOutsideBounds(final Coordinates coordinates) {
        return isXCoordinateInOutsideBounds(coordinates.xCoordinate) && isYCoordinateInOutsideBounds(coordinates.yCoordinate);
    }

    private boolean isXCoordinateInOutsideBounds(final int xCoordinate) {
        return xCoordinate >= this.xCoordinate;
    }

    private boolean isYCoordinateInOutsideBounds(final int yCoordinate) {
        return yCoordinate >= this.yCoordinate;
    }

    private boolean isYCoordinateWithinBounds(final int yCoordinate) {
        return yCoordinate <= this.yCoordinate;
    }

    private boolean isXCoordinateWithinBounds(final int xCoordinate) {
        return xCoordinate <= this.xCoordinate;
    }

    public Coordinates getNewCoordinatesForStepSize(final int xCoordinateStepValue, final int yCoordinateStepValue) {
        return new Coordinates(xCoordinate+xCoordinateStepValue, yCoordinate+yCoordinateStepValue);
    }

}
