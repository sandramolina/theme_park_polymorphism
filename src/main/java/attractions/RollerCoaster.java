package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {
    private double price;
    public RollerCoaster(String name, int rating) {

        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 & visitor.getHeight() > 145.0){
            return true;
        } else {
            return false;
        }
    }

    public int getReviewerRating(int rating){
        return rating;
    }
    public String getReviewerName(Visitor visitor){
        return visitor.getVisitorName();
    }

    public double defaultPrice(){
        return this.price;
    }
    public double priceFor(Visitor visitor){
        if(visitor.getHeight()>200.00){
            return this.price * 2;
        } else  {
            return this.price;
        }
    }

}
