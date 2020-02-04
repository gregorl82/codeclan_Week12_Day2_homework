package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(19, 188, 22.0);
        visitor2 = new Visitor(25, 202, 25.0);
        visitor3 = new Visitor(13, 140, 15.0);
        visitor4 = new Visitor(11, 152, 12.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesDefaultPriceForVisitorUnder200cm(){
        assertEquals(8.4, rollerCoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void chargesDoublePriceForVisitorOver200cm(){
        assertEquals(16.8, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void visitorAllowedIfOver145cmTallandOver12(){
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void visitorNotAllowedIfUnder145cmTallandOver12(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void visitorNotAllowedIfOver145cmTallandUnder12(){
        assertFalse(rollerCoaster.isAllowedTo(visitor4));
    }
}
