package commands;

import console.User;
import model.Direction;

/**
 * A command to move the user in a given direction.
 * 
 * @author Zachary Chandler
 */
public class SouthCommand extends MoveCommand {

    @Override
    public String[] getAliases() {
        return new String[] {"SOUTH", "S"} ;
    }

    @Override
    public String getPreferredName() {
        return "south";
    }
    
    @Override
    public void runCommand(User info, String[] args) {
        move(info, Direction.SOUTH);
    }

    @Override
    public String getShortHelpDescription() {
        return "Moves south by one room.";
    }
}
