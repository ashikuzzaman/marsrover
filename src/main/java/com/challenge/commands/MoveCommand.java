package com.challenge.commands;

import com.challenge.MarsRover;

public class MoveCommand implements ICommand {

    @Override
    public void execute(final MarsRover rover) {
        rover.move();
    }

}
