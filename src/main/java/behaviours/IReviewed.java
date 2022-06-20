package behaviours;

import people.Visitor;

public interface IReviewed {
    public int getReviewerRating(int rating);
    public String getReviewerName(Visitor visitor);
}
