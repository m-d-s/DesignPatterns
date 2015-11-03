/**
 * Created by msimpson on 8/17/15.
 */
public class Decorator {
    public static void main(String[] args){
        Food order = new Mushrooms(new Jalapenos(new Pepperoni(new Pizza("medium"))));
        order.display();
        System.out.print("Total: $" + order.cost());
    }
}
