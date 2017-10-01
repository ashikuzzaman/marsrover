package com.challenge.commands;

import com.challenge.MarsRover;

public class RotateRightCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnRight();
    }

}
