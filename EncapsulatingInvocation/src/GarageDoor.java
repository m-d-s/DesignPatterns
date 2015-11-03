/**
 * Created by msimpson on 8/18/15.
 */
public class GarageDoor {
    boolean up, light;

    public GarageDoor() {
        this.up = false;
        this.light = false;
    }

    public void setLight() {
        this.light = !this.light;
    }

    public void setUp() {
        this.up = !this.up;
    }

    public void display() {
        System.out.print("Garage door is ");
        if(this.up) {
            System.out.println("up");
        } else {
            System.out.println("down");
        }

        System.out.print("Garage light is ");
        if(this.light) {
            System.out.println("on");
        } else {
            System.out.println("off");
        }
    }
}
