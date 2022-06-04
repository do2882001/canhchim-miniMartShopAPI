package com.canhchim.martapi.module.product.data.requestDTO;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductinputdetailDto implements Serializable {
    private final Integer id;
    private final Integer productid;
    private final Integer productofnumber;
    private final BigDecimal productcost;
}
