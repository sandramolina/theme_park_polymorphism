package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void isVisitorAllowedTrueExtreme(){
        Visitor visitor = new Visitor(18,100.0, 23.0, "Pedro");
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedTrue(){
        Visitor visitor = new Visitor(25,100.0, 23.0, "Pedro");
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedFalse(){
        Visitor visitor = new Visitor(16,100.0, 23.0, "Pedro");
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));}

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", tobaccoStall.getReviewerName(visitor));
        assertEquals(4,tobaccoStall.getReviewerRating(4));
    }
}
