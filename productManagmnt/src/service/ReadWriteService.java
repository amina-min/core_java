package service;

import productmanagmnt.Product;

public interface ReadWriteService {

    public void write(Product p);

    public Product read();
}
