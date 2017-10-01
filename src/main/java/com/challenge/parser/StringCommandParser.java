package com.challenge.parser;

import com.challenge.commands.ICommand;
import com.challenge.commands.MoveCommand;
import com.challenge.commands.RotateLeftCommand;
import com.challenge.commands.RotateRightCommand;

import java.util.*;

/**
 * A string command parser to help rover decode a command string. It converts a string of commands 
 * to a list of command objects. And that is all it exposes.
 * 
 * @author ashik
 */
public class StringCommandParser {

    public static final String BY_EACH_CHARACTER = "";
    public static final int START_INDEX = 0;

    private static Map<String, ICommand> stringToCommandMap = new HashMap<String, ICommand>() {{
        put("L", new RotateLeftCommand());
        put("R", new RotateRightCommand());
        put("M", new MoveCommand());
    }};

    private String commandString;

    public StringCommandParser(final String commandString) {
        this.commandString = commandString;
    }

    public List<ICommand> toCommands() {
        if(isNullOrEmpty(commandString)) {
            return new ArrayList<ICommand>();
        }
        return buildCommandsList(commandString);
    }

    private List<ICommand> buildCommandsList(final String commandString) {
        List<ICommand> commands = new ArrayList<ICommand>();

        for(String commandCharacter : commandCharactersFrom(commandString)) {
            if (commandCharacter == null) break;
            ICommand mappedCommand = lookupEquivalentCommand(commandCharacter.toUpperCase());
            commands.add(mappedCommand);
        }

        return commands;
    }

    private boolean isNullOrEmpty(final String commandString) {
        return (null == commandString || commandString.trim().length() == 0);
    }

    private String[] commandCharactersFrom(final String commandString) {
        return Arrays.copyOfRange(commandString.split(BY_EACH_CHARACTER), START_INDEX, commandString.length() + 1);
    }

    private ICommand lookupEquivalentCommand(final String commandString) {
        return stringToCommandMap.get(commandString);
    }

}
