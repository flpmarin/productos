package com.digitechfp.curso_ad.productos.controller;

import com.digitechfp.curso_ad.productos.model.daos.IProductDAO;
import com.digitechfp.curso_ad.productos.model.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final IProductDAO productDAO;

    public ProductController(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping
    public List<Product> findAll(){
        return productDAO.findAll();
    }

    @GetMapping("/{price}")
    public List<Product> findByPriceLessThan(@PathVariable Integer price){
        return productDAO.findByPriceLessThan(price);
    }

}
