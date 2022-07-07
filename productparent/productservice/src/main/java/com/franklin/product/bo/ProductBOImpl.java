package com.franklin.product.bo;

import com.franklin.product.dao.ProductDAO;
import com.franklin.product.dao.ProductDAOImpl;
import com.franklin.product.dto.Product;

public class ProductBOImpl implements ProductBO {

    // static to use always the same instance, mimic spring boot
    private static ProductDAO dao = new ProductDAOImpl();

    public void create(Product product) {
        dao.create(product);
    }

    public Product findProduct(int id) {
        return dao.read(id);
    }
}
