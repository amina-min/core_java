package com.productmanager.Service;

import com.productmanager.Product;

public interface ReadWriteService {
     void write(Product p);
     Product read();
}
