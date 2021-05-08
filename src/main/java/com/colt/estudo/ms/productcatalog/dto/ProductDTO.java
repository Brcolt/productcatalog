package com.colt.estudo.ms.productcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String id;

    @NotEmpty
    private String name;

    @NotNull
    private Integer amount;

}
