package com.tim.springbootmall.service;

import com.tim.springbootmall.dto.ProductRequest;
import com.tim.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

}
