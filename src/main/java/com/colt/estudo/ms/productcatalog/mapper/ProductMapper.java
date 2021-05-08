package com.colt.estudo.ms.productcatalog.mapper;


import com.colt.estudo.ms.productcatalog.dto.ProductDTO;
import com.colt.estudo.ms.productcatalog.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product toModel(ProductDTO productDTO);

    ProductDTO toDTO(Product product);
}
