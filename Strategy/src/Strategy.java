/**
 * Created by msimpson on 8/13/15.
 */
public class Strategy {
    public static void main(String[] args) {
        Mallard daffy = new Mallard();
        DuckDecoy fred = new DuckDecoy();
        daffy.display();
        daffy.performFly();
        daffy.performQuack();

        fred.display();
        fred.performFly();
        fred.performQuack();
        fred.setFly(new RocketFlight());
        fred.performFly();
    }
}
