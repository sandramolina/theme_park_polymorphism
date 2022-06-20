package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getReviewerName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getReviewerRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isVisitorAllowedTrueExtreme(){
        Visitor visitor = new Visitor(15,100.0, 23.0, "Pedro");
        assertEquals(true, playground.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedTrue(){
        Visitor visitor = new Visitor(7,100.0, 23.0, "Pedro");
        assertEquals(true, playground.isAllowedTo(visitor));}

    @Test
    public void isVisitorAllowedFalse(){
        Visitor visitor = new Visitor(16,100.0, 23.0, "Pedro");
        assertEquals(false, playground.isAllowedTo(visitor));}

    @Test
    public void canGetReviewerNameAndRating(){
        Visitor visitor = new Visitor(14,150.0, 23.0, "Pedro");
        assertEquals("Pedro", playground.getReviewerName(visitor));
        assertEquals(4,playground.getReviewerRating(4));
    }
}
