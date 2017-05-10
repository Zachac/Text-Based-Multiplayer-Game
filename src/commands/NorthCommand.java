package commands;

import console_gui.UserInformation;
import model.Direction;

public class NorthCommand extends MoveCommand {

    @Override
    public String[] getAliases() {
        return new String[] {"NORTH", "N"} ;
    }

    @Override
    public String getPreferredName() {
        return "north";
    }

    @Override
    public void runCommand(UserInformation info, String[] args) {
        move(info, Direction.NORTH);
    }

    @Override
    public String getShortHelpDescription() {
        return "Moves north by one room.";
    }
}
