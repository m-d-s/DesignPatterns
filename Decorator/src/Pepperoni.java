/**
 * Created by msimpson on 8/17/15.
 */
public class Pepperoni extends Food {
    Food parent;
    double price;

    public Pepperoni(Food parent) {
        this.parent = parent;
        String size = parent.getSize();
        if(size.equals("small")) {
            price = .5;
        }
        else if(size.equals("medium")) {
            price = .75;
        }
        else if(size.equals("large")) {
            price = 1.00;
        }
        else{
            price = -5555.5555;
        }
    }

    public String getSize() {
        return parent.getSize();
    }

    public double cost() {

        return parent.cost() + price;
    }

    public void display() {
        parent.display();
        System.out.println("\t\t* pepperoni *");
    }
}
