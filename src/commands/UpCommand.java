package commands;

import console_gui.CurrentInformation;
import model.RoomNode;

public class UpCommand extends RunnableCommand {

    @Override
    public String[] getAliases() {
        return new String[] {"UP", "U"} ;
    }

    @Override
    public void runCommand(CurrentInformation info, String[] args) {
        RoomNode potentialRoom = info.getCurrentRoom().getUp();
        
        if (potentialRoom == null) {
            System.out.println("You can't go that way.");
        } else {
            info.setCurrentRoom(potentialRoom);
            System.out.println(info.getCurrentRoom().getDescription());
        }
    }

}
