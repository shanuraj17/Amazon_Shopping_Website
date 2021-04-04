package main;

import BuilderUtil.Builder;
import Factory.AbstractFactory;
import Factory.FactoryCreator;
import Factory.PersonFactory;
import Person.User;
import builder.Item;
import builder.Product;
import builder.ProductReview;
import constants.ProductCategory;
import utils.Search;
import utils.ShoppingCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product(1, "TV", "LG TV 55 inch", 55000.0, ProductCategory.ELECTRONICS, "LG", new ArrayList<>());
        Product product2 = new Product(2, "T-shirt", "White t-shirt", 550.0, ProductCategory.CLOTHING, "PUMA", new ArrayList<>());
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you are seller or buyer");
        String choice = bufferedReader.readLine();
        AbstractFactory personFactory = FactoryCreator.getFactory(choice);
        User user = personFactory.getPerson("Seller");
        user.addProduct(product1);
        user.addProduct(product2);
        System.out.println("Enter the choice again");
       choice = bufferedReader.readLine();
        personFactory = FactoryCreator.getFactory(choice);
        user = personFactory.getPerson("Buyer");
        Search search = new Search();
        Product searchProduct = search.searchByName("TV");
        Item item1 = new Item();
        item1.setQuantity(5);
        user.addItemsToShoppingCart(item1);

        ShoppingCart shoppingCart = user.getShoppingCart();

        item1.setProduct(searchProduct);
        user.addItemsToShoppingCart(item1);
        user.placeOrder(shoppingCart);
    }
}
