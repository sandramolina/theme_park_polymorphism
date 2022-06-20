package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getReviewerName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getReviewerRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isVisitorAllowedTrueExtremeAge(){
        Visitor visitor = new Visitor(13,150.0, 23.0, "Pedro");
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedTrueExtremeHeight(){
        Visitor visitor = new Visitor(15,145.09, 23.0, "Pedro");
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedTrue(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedFalse(){
        Visitor visitor = new Visitor(10,160.0, 23.0, "Pedro");
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedFalseExtremeAge(){
        Visitor visitor = new Visitor(12,160.0, 23.0, "Pedro");
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedFalseExtremeHeight(){
        Visitor visitor = new Visitor(17,145.00, 23.0, "Pedro");
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));}

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", rollerCoaster.getReviewerName(visitor));
        assertEquals(1,rollerCoaster.getReviewerRating(1));
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.0);
    }

    @Test
    public void canChargeDoubleFeeToTallPeople(){
        Visitor visitor = new Visitor(14,250.0, 23.0, "Pedro");
        assertEquals(16.8, rollerCoaster.priceFor(visitor),00);
    }
}
