package stalls;

import people.Visitor;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int getReviewerRating(int rating){
        return rating;
    }
    public String getReviewerName(Visitor visitor){
        return visitor.getVisitorName();
    }
}
