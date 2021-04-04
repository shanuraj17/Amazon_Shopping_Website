package Person;

import builder.Item;
import builder.Product;
import constants.OrderStatus;
import constants.ProductCategory;
import utils.Search;
import utils.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    ShoppingCart cart;
    Search searchObj;
    int customerId;

   public ShoppingCart getShoppingCart(){

        return cart;
    }
    public void addItemsToShoppingCart(Item item){
        cart.addItem(item);
    }
    public void updateItemFromShoppingCart(Item item){
        cart.updateItem(item);
    }
    public void removeItemFromShoppingCart(Item item){
        cart.deleteItem(item);
    }
    public abstract void addProduct(Product product);
    public abstract OrderStatus placeOrder(ShoppingCart cart);
}
