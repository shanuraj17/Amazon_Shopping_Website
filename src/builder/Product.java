package builder;

import Person.Seller;
import constants.ProductCategory;

import java.util.List;

public class Product {
    int productID;
    String productName;
    String productDescription;
    Double productCost;
    ProductCategory productCategory;
    String seller;
    List<ProductReview> reviews;
    
    public Product(int productID, String productName, String productDescription, Double productCost, ProductCategory productCategory, String seller, List<ProductReview> reviews) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCost = productCost;
        this.productCategory = productCategory;
        this.seller = seller;
        this.reviews = reviews;
    }
    
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductCost(double v) {
        return productCost;
    }

    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public List<ProductReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<ProductReview> reviews) {
        this.reviews = reviews;
    }

   
}
