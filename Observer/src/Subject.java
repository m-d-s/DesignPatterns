/**
 * Created by msimpson on 8/17/15.
 */
public interface Subject {
    void addListener(Listener toAdd);
    void removeListener(Listener toRemove);
    void notifyListeners();
}
