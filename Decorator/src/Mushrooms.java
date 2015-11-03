/**
 * Created by msimpson on 8/17/15.
 */
public class Mushrooms extends Food {
    Food parent;
    double price;
    public Mushrooms(Food parent) {
        this.parent = parent;
        String size = parent.getSize();
        if(size.equals("small")) {
            price = .3;
        }
        else if(size.equals("medium")) {
            price = .8;
        }
        else if(size.equals("large")) {
            price = .9;
        }
        else{
            price = -5555.5555;
        }
    }

    public double cost() {
        return parent.cost() + price;
    }

    public void display() {
        parent.display();
        System.out.println("\t\t* mushrooms *");
    }

    public String getSize() {
        return parent.getSize();
    }
}