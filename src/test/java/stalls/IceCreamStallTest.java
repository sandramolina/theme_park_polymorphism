package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
    }

    @Test
    public void hasName() {
        assertEquals("Dream Cones", iceCreamStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Vanilla Ice", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.A4, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", iceCreamStall.getReviewerName(visitor));
        assertEquals(4,iceCreamStall.getReviewerRating(4));
    }
}
