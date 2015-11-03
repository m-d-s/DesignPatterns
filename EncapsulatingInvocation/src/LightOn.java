/**
 * Created by msimpson on 8/18/15.
 */
public class LightOn implements Command {
    private Light light;
    public LightOn(Light light) {
        this.light = light;
    }
    public void execute() {
        light.lightOn();
    }
    public void display() {
        light.display();
    }
}
