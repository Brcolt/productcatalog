package com.colt.estudo.ms.productcatalog.service;

import com.colt.estudo.ms.productcatalog.dto.ProductDTO;
import com.colt.estudo.ms.productcatalog.mapper.ProductMapper;
import com.colt.estudo.ms.productcatalog.model.Product;
import com.colt.estudo.ms.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper = ProductMapper.INSTANCE;

    public ProductDTO create(ProductDTO productDTO) {
        Product expectedSavedProduct = productMapper.toModel(productDTO);
        productRepository.save(expectedSavedProduct);
        return productMapper.toDTO(expectedSavedProduct);

    }

    public List<ProductDTO> findAll() {
        List<ProductDTO> productDTOS = StreamSupport
                .stream(productRepository.findAll().spliterator(), false)
                .map(productMapper::toDTO)
                .collect(Collectors.toList());
        return productDTOS;
    }
}
