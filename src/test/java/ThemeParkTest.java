import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        attractions = new ArrayList<>();
        attractions.add(dodgems);
        attractions.add(park);
        attractions.add(rollerCoaster);
        attractions.add(playground);

        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 3);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        stalls = new ArrayList<>();
        stalls.add(candyflossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);

        themePark = new ThemePark("Fawlty Towers", attractions, stalls);
    }

    @Test
    public void hasName(){
        assertEquals("Fawlty Towers", themePark.getName());
    }

    @Test
    public void hasAttractions(){
        assertEquals(4, themePark.countAttractions());
    }

    @Test
    public void hasStalls(){
        assertEquals(3, themePark.countStalls());
    }

}
