package utils;

import builder.Product;
import constants.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Product> listOfProduct = new ArrayList<Product>();

    public void addItems(Product product){
        listOfProduct.add(product);
    }
    public void listAllItem(){
        for(Product product: listOfProduct)
            System.out.println(product);
    }

    public Product searchByName(String name){
        for(Product product: listOfProduct) {
            if (product.getProductName().equals(name))
                return product;
        }
        return null;
    }

    public ArrayList<Product> searchByCategory(String productCategory){
        ArrayList<Product> listOfProduct1 = new ArrayList<Product>();
        for(Product product: listOfProduct) {
            if (product.getProductCategory().equals(productCategory))
                listOfProduct1.add(product);
        }
        return listOfProduct1;
    }

}
