package com.generation.callejonDiagonal.controller;
import com.generation.callejonDiagonal.model.Product;

import com.generation.callejonDiagonal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private ProductService productService;


    public ProductController(@Autowired ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getProducts();
    }

    @GetMapping("/destacado")
    public List<Product> getDestacado(){
        return productService.getDestacado();
    }

    @PostMapping("/actualiza/{id}")
    public void actualizarStock(@PathVariable int id){
        productService.getProduct(id).setStock(productService.getProduct(id).getStock()-1);
        productService.save(id);
    }
}
