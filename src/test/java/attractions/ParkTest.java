package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getReviewerName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getReviewerRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", park.getReviewerName(visitor));
        assertEquals(4,park.getReviewerRating(4));
    }
}
