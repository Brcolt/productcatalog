package com.colt.estudo.ms.productcatalog.repository;

import com.colt.estudo.ms.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
