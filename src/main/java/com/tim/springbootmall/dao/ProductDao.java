package com.tim.springbootmall.dao;

import com.tim.springbootmall.dto.ProductQueryParams;
import com.tim.springbootmall.dto.ProductRequest;
import com.tim.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void updateStock(Integer productId, Integer stock);
    void deleteProductById(Integer productId);

}
