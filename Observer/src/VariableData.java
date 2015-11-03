import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by msimpson on 8/17/15.
 */
public class VariableData implements  Subject{
    private ArrayList<Listener> subscribers;
    private int x, y, z;
    public VariableData() {
        subscribers = new ArrayList<Listener>();
        x = 0;
        y = 0;
        z = 0;
    }
    public void setPointCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.notifyListeners();
        System.out.println("Coordinates Set, listeners updated");
    }

    public void addListener(Listener toAdd){
        subscribers.add(toAdd);
    }

    public void removeListener(Listener toRemove) {
        subscribers.remove(toRemove);
    }

    public void notifyListeners() {
        Iterator<Listener> iter = subscribers.iterator();
        while(iter.hasNext()) {
            iter.next().update(this.x, this.y, this.z);
        }
    }
}
