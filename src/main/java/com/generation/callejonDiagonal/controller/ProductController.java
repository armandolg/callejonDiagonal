package com.generation.callejonDiagonal.controller;
import com.generation.callejonDiagonal.model.Product;
import com.generation.callejonDiagonal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(@Autowired ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @GetMapping("product/all")
    public List<Product> getAll(){
        return productService.getProducts();
    }

//    @GetMapping("product/destacado")
//    public List<Product> getDestacado(){
//        return productService.getDestacado();
//    }
}
