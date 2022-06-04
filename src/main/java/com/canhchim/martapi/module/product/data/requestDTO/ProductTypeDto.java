package com.canhchim.martapi.module.product.data.requestDTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductTypeDto implements Serializable {
    private  Integer id;
    private  Integer shopId;
    private  Integer productTypeCode;
    private  String productTypeName;
}
