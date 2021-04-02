package Person;

import builder.Product;

import java.util.List;

public class Seller extends User{
    List<Product> product;

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void addProduct(Product product){

    }
}
