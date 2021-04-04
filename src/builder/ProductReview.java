package builder;

import Person.Buyer;

public class ProductReview {
    String comment;
    Buyer buyer;
    int rating;

    public ProductReview(String comment, Buyer buyer, int rating) {
        this.comment = comment;
        this.buyer = buyer;
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
