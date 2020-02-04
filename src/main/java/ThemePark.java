import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(String name, ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public String getName() {
        return name;
    }

    public int countAttractions(){
        return this.attractions.size();
    }

    public int countStalls(){
        return this.stalls.size();
    }
}
