package com.tim.springbootmall.dao;

import com.tim.springbootmall.dto.ProductRequest;
import com.tim.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);

}
