/**
 * Created by msimpson on 8/18/15.
 */
public class EncapsulatingInvocation {
    public static void main(String args[]) {
        RemoteControl clicker = new RemoteControl();
        Command clapper = new LightOn(new Light());
        Command slider = new GarageDoorAction(new GarageDoor());

        clicker.setSlot(clapper);
        clicker.setSlot2(slider);
        clicker.slotState();
        clicker.button1Pressed();
        clicker.slotState();
        clicker.button2Pressed();
        clicker.slotState();
    }
}
