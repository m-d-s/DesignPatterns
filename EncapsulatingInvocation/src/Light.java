import java.util.List;

/**
 * Created by msimpson on 8/18/15.
 */
public class Light {
    boolean on;
    public Light() {
        this.on = false;
    }

    public void lightOn() {
        this.on = true;
    }

    public void lightOff() {
        this.on = false;
    }

    public void display() {
        if(this.on) {
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }
    public boolean getLight() { return this.on;}
}
