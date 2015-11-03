/**
 * Created by msimpson on 8/13/15.
 */
public abstract class  Ducks {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFly(FlyBehaviour howToFly) {
        flyBehaviour = howToFly;
    }

    public void setQuack(QuackBehaviour howToQuack) {
        quackBehaviour = howToQuack;
    }

    public void swim() {
        System.out.println("All ducks swim");
    }
}
