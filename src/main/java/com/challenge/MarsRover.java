package com.challenge;

import com.challenge.commands.ICommand;
import com.challenge.parser.StringCommandParser;
import com.challenge.universe.Coordinates;
import com.challenge.universe.Direction;
import com.challenge.universe.Plateau;

import java.util.List;

/* 
 * A class that represents the core entity Rover. 
 * A rover is deployed on a plateau with initial facing direction and coordinates. 
 * Hence object initialization takes those parameters. 
 * It also exposes a contract to rest of the world to receive commands to move or rotate. 
 * Amidst all of that the state of rover is encapsulated and hidden. 
 * Rover has methods with verbs that represents action it can do. 
 *
 * @author ashik
 */
public class MarsRover {

    private Coordinates currentCoordinates;
    private Direction currentDirection;
    private Plateau plateau;

    public MarsRover(final Plateau plateau, final Direction direction, final Coordinates coordinates) {
        this.plateau = plateau;
        this.currentDirection = direction;
        this.currentCoordinates = coordinates;
    }

    public void run(final String commandString) {
        List<ICommand> roverCommands = new StringCommandParser(commandString).toCommands();
        for (ICommand command : roverCommands) {
            command.execute(this);
        }
    }

    public String currentLocation() {
        return currentCoordinates.toString() + " " + currentDirection.toString();
    }

    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }

    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    public void move() {
        Coordinates positionAfterMove = currentCoordinates.getNewCoordinatesForStepSize(currentDirection.stepSizeForXAxis(), currentDirection.stepSizeForYAxis());

        // ignores the command if rover is being driven off plateau
        if(plateau.hasWithinBounds(positionAfterMove)) {
            currentCoordinates = currentCoordinates.getNewCoordinatesFor(currentDirection.stepSizeForXAxis(), currentDirection.stepSizeForYAxis());
        }
    }

}
