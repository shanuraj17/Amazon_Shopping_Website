package utils;

import builder.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;
    double cartValue;

    public void addItem(Item item){
        items.add(item);
    }
    public void updateItem(Item newItem){
        for(Item item : items){
            if((newItem.getProduct().getProductID())==(item.getProduct().getProductID())){
                item.setQuantity(newItem.getQuantity());

            }
        }
    }
    public void deleteItem(Item newItem){
        for(Item item : items){
            if((newItem.getProduct().getProductID())==(item.getProduct().getProductID())) {
                items.remove(item);
            }
        }
    }
    public void checkoutItems(){

    }
    public List<Item> getItems(){
        return items;
    }
    public double getCartValue(){
        return cartValue;
    }
}
