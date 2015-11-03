/**
 * Created by msimpson on 8/17/15.
 */
public class Jalapenos extends Food {
    Food parent;
    double price;
    public Jalapenos(Food parent) {
        this.parent = parent;
        String size = parent.getSize();
        if(size.equals("small")) {
            price = .25;
        }
        else if(size.equals("medium")) {
            price = .5;
        }
        else if(size.equals("large")) {
            price = .75;
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
        System.out.println("\t\t* jalapenos *");
    }

    public String getSize() {
        return parent.getSize();
    }
}
