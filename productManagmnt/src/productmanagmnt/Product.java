package productmanagmnt;

import java.io.Serializable;

public class Product implements Serializable {

    int productId;
    String ProductName;
    double price;
    int qty;
    String details;

    public Product() {
    }

    public Product(int productId, String ProductName, double price, int qty, String details) {
        this.productId = productId;
        this.ProductName = ProductName;
        this.price = price;
        this.qty = qty;
        this.details = details;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
