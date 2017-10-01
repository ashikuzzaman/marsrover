package com.challenge.commands;

import com.challenge.MarsRover;
import com.challenge.commands.MoveCommand;
import com.challenge.universe.Coordinates;
import com.challenge.universe.Direction;
import com.challenge.universe.Plateau;
import org.junit.Assert;
import org.junit.Test;

public class MoveCommandTest {

    @Test
    public void testThatMoveCommandMovesTheNavigableObject() {
        //Given
        MoveCommand command = new MoveCommand();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);

        //When
        command.execute(rover);

        //Then
        Assert.assertEquals("1 3 N", rover.currentLocation());
    }

}
