package stalls;

import attractions.Park;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    CandyflossStall candyflossStall;

    @Before
    public void setUp() throws Exception {
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
    }

    @Test
    public void hasName() {
        assertEquals("Candy Land", candyflossStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Harry Belafonte", candyflossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(ParkingSpot.A1, candyflossStall.getParkingSpot());
    }

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", candyflossStall.getReviewerName(visitor));
        assertEquals(4,candyflossStall.getReviewerRating(4));
    }
}
