/**
 * Created by msimpson on 8/18/15.
 */
public class GarageDoorAction implements Command {

    GarageDoor door;

    public GarageDoorAction(GarageDoor door) {
        this.door = door;
    }

    public void execute() {
        door.setUp();
    }

    public void display() {
        door.display();
    }
}
