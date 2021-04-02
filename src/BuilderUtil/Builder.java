package BuilderUtil;

import Person.Seller;
import Person.User;
import builder.Item;
import builder.Product;
import constants.ProductCategory;
import utils.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Builder  {
    public void accessWebsite() throws IOException{
        System.out.println("Enter buyer or seller, 1. Buyer 2. Seller");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch(choice){
            case 1 : {
                System.out.println("buy");
                buyer();
            }
            break;
            case 2 : {
                System.out.println("sell");
                seller();
            }
            break;
        }
    }
    public void buyer() throws IOException {
        Customer customer = new Customer();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter buyer option, 1. list 2. searchbyname 3. searchByCategory 4. additemTocart");
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice){
            case 1 : {
                System.out.println("list");
                customer.listAllItem();
            }
            break;
            case 2 : {
                System.out.println("searchbyname");
                String Item = bufferedReader.readLine();
                Product Product = customer.searchByName(Item);
                System.out.println("Item Descripton is " + Product);
            }
            break;
            case 3 : {
                System.out.println("searchByCategory");
                String Item = bufferedReader.readLine();
                List<Product> Product = customer.searchByCategory(Item);
                System.out.println("Item Descripton is " + Product);
                for(Product p : Product){
                    System.out.println(p);
                }
            }
            break;
            case 4 : {

            }
        }
    }
    public void seller(){
        Customer customer = new Customer();
        Product product = new Product();
        product.setProductID(1);
        product.setProductCost(100.0);
        product.setProductCategory(ProductCategory.ELECTRONICS);
        product.setProductDescription("TV");
        product.setSeller("LG");
        product.setProductName("LG TV");
        customer.addItems(product);

        product.setProductID(1);
        product.setProductCost(100.0);
        product.setProductCategory(ProductCategory.ELECTRONICS);
        product.setProductDescription("Fridge");
        product.setSeller("LG");
        product.setProductName("LG Fridge");
        customer.addItems(product);
    }





}
