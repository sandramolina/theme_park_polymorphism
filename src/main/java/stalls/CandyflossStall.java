package stalls;

import behaviours.IReviewed;
import people.Visitor;

public class CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int getReviewerRating(int rating){
        return rating;
    }
    public String getReviewerName(Visitor visitor){
        return visitor.getVisitorName();
    }
}
