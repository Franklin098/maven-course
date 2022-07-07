package com.franklin.product.dao;

import com.franklin.product.dto.Product;

// DAO = Data Access Object
public interface ProductDAO {

    void create(Product product);

    Product read(int id);

    void update(Product product);

    void delete(int id);
}
