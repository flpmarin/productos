package com.digitechfp.curso_ad.productos.model.daos;

import com.digitechfp.curso_ad.productos.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IProductDAO extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.precio < :price")
    List<Product> findByPriceLessThan(Integer price);

}
