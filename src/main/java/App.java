import java.util.List;
import com.challenge.MarsRover;
import com.challenge.universe.Coordinates;
import com.challenge.universe.Direction;
import com.challenge.universe.Plateau;
import com.challenge.parser.StringCommandParser;
import com.challenge.commands.ICommand;

/*
 * Main App running the mars rover program
 * 
 * @author ashik
 */
public class App {

    public static void main(String[] args) {
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover firstMarsRover = new MarsRover(plateau, Direction.N, startingPosition);
        System.out.println("Landing Position -> " + firstMarsRover.currentLocation());
        StringCommandParser parser = new StringCommandParser("LMLMLMLMM");
        List<ICommand> commands = parser.toCommands();
        for(ICommand cmd : commands) {
        	cmd.execute(firstMarsRover);
        }
        System.out.println("First Mars Rover Position after turn -> " + firstMarsRover.currentLocation());
        
        startingPosition = new Coordinates(3,3);
        MarsRover secondMarsRover = new MarsRover(plateau, Direction.E, startingPosition);
		parser = new StringCommandParser("MMRMMRMRRM");
		commands = parser.toCommands();
		for(ICommand cmd : commands) {
        	cmd.execute(secondMarsRover);
        }
        System.out.println("Second Mars Rover Position after turn -> " + secondMarsRover.currentLocation());
    }

}
