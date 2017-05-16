package console;

import model.RoomManager;
import model.RoomNode;
import model.SerializationHelper;
import model.Universe;

/**
 * Initializes a simple save file of the room manager.
 * 
 * @author Zachary Chandler
 */
public class Initialize {

    public static void main(String[] args) {
        RoomNode startingRoom = new RoomNode(0, "Forest", "The trees grow tall and thick here. "
                + "There is very little undergrowth, only a few rays of light pierce through the thick cannopy above."
                + "To the east there is a small but dark cave that leads inwards. To the north is a faint path that "
                + "leads through the forest.");
        RoomManager roomManager = new RoomManager(startingRoom);
        
        Universe u = new Universe(roomManager);
        
        boolean saved = SerializationHelper.saveUniverse(u);
        
        if (saved) {
            System.out.println("Sucessfully Initialized a Save File!");
        } else {
            System.err.println("Failed to Initialize a Save File!");
        }
    }
}
