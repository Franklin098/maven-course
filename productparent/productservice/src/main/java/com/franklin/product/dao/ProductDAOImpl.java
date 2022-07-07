package com.franklin.product.dao;

import com.franklin.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDAOImpl implements ProductDAO {

    //  instead of a data base we are using a map <id,product>
    Map<Integer, Product> products = new HashMap<>();

    public void create(Product product) {
        products.put(product.getId(), product);
    }

    public Product read(int id) {
        return products.get(id);
    }

    public void update(Product product) {
        
    }

    public void delete(int id) {

    }
}
