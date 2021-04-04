package Person;

import builder.Product;
import builder.ProductReview;
import constants.OrderStatus;
import utils.Order;
import utils.ShoppingCart;

public class Buyer extends User{
    Order orderObj;

    public void addReview(ProductReview review){

    }
    public OrderStatus placeOrder(ShoppingCart cart){

        return OrderStatus.DELIVERED;
    }

    @Override
    public void addProduct(Product product) {

    }
}
