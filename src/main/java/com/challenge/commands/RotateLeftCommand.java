package com.challenge.commands;

import com.challenge.MarsRover;

public class RotateLeftCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.turnLeft();
    }

}
