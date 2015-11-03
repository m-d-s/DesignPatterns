/**
 * Created by msimpson on 8/13/15.
 */
public class DuckDecoy extends Ducks{

    public DuckDecoy(){
        flyBehaviour = new NoFly();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Noone here but us decoys");
    }
}
