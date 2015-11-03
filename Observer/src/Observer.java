/**
 * Created by msimpson on 8/15/15.
 */
public class Observer {

    public static void main(String[] args) {
        VariableData currentCoordinates = new VariableData();
        Bob bob = new Bob(currentCoordinates);
        Mary mary = new Mary(currentCoordinates);

        mary.display();
        bob.display();
        bob.subscribe();

        currentCoordinates.setPointCoordinates(1, 1, 2);

        mary.display();
        mary.subscribe();
        bob.display();

        currentCoordinates.setPointCoordinates(3,5,8);

        mary.display();
        bob.display();
        currentCoordinates.setPointCoordinates(13,21,34);

        mary.display();
        mary.unsubscribe();
        bob.display();
        currentCoordinates.setPointCoordinates(55,89,144);

        mary.display();
        bob.display();
        bob.unsubscribe();

        currentCoordinates.setPointCoordinates(233,377,610);

        mary.display();
        mary.subscribe();
        bob.display();


        currentCoordinates.setPointCoordinates(987,1597,2584);

        mary.display();
        bob.display();
    }
}
