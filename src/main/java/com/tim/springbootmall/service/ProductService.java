package com.tim.springbootmall.service;

import com.tim.springbootmall.dto.ProductQueryParams;
import com.tim.springbootmall.dto.ProductRequest;
import com.tim.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);

}
