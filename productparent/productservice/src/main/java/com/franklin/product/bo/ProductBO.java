package com.franklin.product.bo;

import com.franklin.product.dto.Product;

// BO = Business Object -> used in the business logic layer
public interface ProductBO {

    void create(Product product);

    Product findProduct(int id);
}
