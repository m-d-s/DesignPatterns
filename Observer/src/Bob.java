/**
 * Created by msimpson on 8/17/15.
 */
public class Bob implements Listener {
    Subject observable;
    private int x;
    private int y;
    private int z;

    public Bob(Subject observable) {
        this.observable = observable;
        this.x = this.y = this.z = 0;
    }

    public void subscribe(){
        System.out.println("Bob Subscribed");
        this.observable.addListener(this);
    }

    public void unsubscribe(){
        System.out.println("Bob UnSubscribed");
        this.observable.removeListener(this);
    }

    public void update(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void display(){
        System.out.println("Bobs 3d Coordinates: x = "+ x + " y = " + y + " z = " + z );
    }

}
