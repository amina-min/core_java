package productmanagmnt;

import service.ReadWriteServiceImp;

public class Application {

    public static void main(String[] args) {
        Product p = new Product(101, "Laptop ", 40000, 3, "fddgdg");

        ReadWriteServiceImp r = new ReadWriteServiceImp();
        r.write(p);
        Product product = r.read();

        System.out.println(" product name " + product.ProductName);
        System.out.println("Product id " + product.price);

    }

}
