package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {
    private double price;
    public Dodgems(String name, int rating) {

        super(name, rating);
        this.price = 4.50;
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
        if(visitor.getAge()<12){
            return this.price / 2;
        } else  {
            return this.price;
        }
    }
}
