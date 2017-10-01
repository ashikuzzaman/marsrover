package com.challenge.commands;

import com.challenge.MarsRover;

/*
 * Defines what move, left and right command does
 * 
 * @author ashik
 */
public interface ICommand {

    public void execute(final MarsRover rover);

}
