package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(int id);

    List<Product> getProducts();

    List<Product> getDestacado();

    Product save(Product product);
}
