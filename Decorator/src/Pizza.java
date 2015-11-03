/**
 * Created by msimpson on 8/17/15.
 */
public class Pizza extends Food {
    protected double price;
    protected String size;
    public Pizza(String size) {
        this.size = size;
        if(size.equals("small")) {
            price = 5.00;
        }
        else if(size.equals("medium")) {
            price = 8.00;
        }
        else if(size.equals("large")) {
            price = 13.00;
        }
        else{
            price = -5555.5555;
        }

    }

    public double cost() {
        return this.price;
    }

    public String getSize(){
        return this.size;
    }

    public void display() {
        System.out.println(size +" pizza with: ");
    }
}
