package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.4;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }

    public boolean isAllowedTo(Visitor visitor){
        return (visitor.getAge() >= 12 && visitor.getHeight() >= 145);
    }

}
