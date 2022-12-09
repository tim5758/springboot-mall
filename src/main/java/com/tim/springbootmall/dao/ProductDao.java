package com.tim.springbootmall.dao;

import com.tim.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

}
