/**
 * Created by msimpson on 8/17/15.
 */
public class Mary implements Listener {
    Subject observable;
    private int x;
    private int y;

    public Mary(Subject observable) {
        this.observable = observable;
        this.x = this.y = 0;
    }

    public void subscribe() {
        System.out.println("Mary Subscribed");
        this.observable.addListener(this);
    }

    public void unsubscribe(){
        System.out.println("Mary UnSubscribed");
        this.observable.removeListener(this);
    }

    public void update(int x, int y, int z) {
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("Mary's 2d Coordinates: x = "+ x + " y = " + y);
    }
}
