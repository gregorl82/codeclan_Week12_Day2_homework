package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.5;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        return 0.0;
    }
}
