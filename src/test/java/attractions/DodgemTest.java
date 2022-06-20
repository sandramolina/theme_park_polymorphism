package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getReviewerName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getReviewerRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", dodgems.getReviewerName(visitor));
        assertEquals(5,dodgems.getReviewerRating(5));
    }

    @Test
    public void canChargeHalfFeeToChildrenPeople(){
        Visitor visitor = new Visitor(10,250.0, 23.0, "Pedro");
        assertEquals(2.25, dodgems.priceFor(visitor),0.0);
    }
}
