/**
 * Created by msimpson on 8/18/15.
 */
public class RemoteControl {
    Command slot;
    Command slot2;

    public RemoteControl() {
        this.slot = null;
        this.slot2 = null;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void setSlot2(Command slot) {
        this.slot2 = slot;
    }

    public void button1Pressed() {
        slot.execute();
    }

    public void button2Pressed() {
        slot2.execute();
    }

    public void slotState() {
        slot.display();
        slot2.display();
    }
}
