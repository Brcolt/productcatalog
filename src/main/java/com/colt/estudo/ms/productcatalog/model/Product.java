package com.colt.estudo.ms.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "product", indexStoreType = "catalog")
public class Product {

    @Id
    private String id;
    private String name;
    private Integer amount;
}
