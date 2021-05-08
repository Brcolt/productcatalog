package com.colt.estudo.ms.productcatalog.controller;

import com.colt.estudo.ms.productcatalog.dto.ProductDTO;
import com.colt.estudo.ms.productcatalog.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private final ProductService productService;

    @PostMapping
    ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);

    }

    @GetMapping
    List<ProductDTO> findAll() {
        return productService.findAll();
    }
}
