package Person;

import builder.Product;
import constants.OrderStatus;
import helper.Account;
import utils.ShoppingCart;

public class Guest extends Customer{
    public Account createNewAccount(){

    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public OrderStatus placeOrder(ShoppingCart cart) {
        return null;
    }
}
