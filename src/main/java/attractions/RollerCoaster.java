package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.4;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        return 0.0;
    }

}
