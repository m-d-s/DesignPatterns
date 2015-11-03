/**
 * Created by msimpson on 8/13/15.
 */
public class Mallard extends Ducks {
    public Mallard() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void display() {
        System.out.println("I'm a Mallard!");
    }
}
