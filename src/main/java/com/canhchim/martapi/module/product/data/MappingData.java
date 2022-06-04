package com.canhchim.martapi.module.product.data;

import com.canhchim.martapi.entity.ProductType;
import com.canhchim.martapi.module.product.data.requestDTO.ProductTypeDto;
import com.canhchim.martapi.module.product.repositories.ProductTypeRepository;
import com.canhchim.martapi.module.product.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MappingData {
    @Autowired
    ProductTypeRepository productTypeRepository;
    @Autowired
    ShopRepository shopRepository;
    public ProductType mappingProductTypeDTOToEntity(ProductTypeDto productTypeDto){
        ProductType p = new ProductType();
        p.setId(productTypeDto.getId());
        p.setProductTypeName(productTypeDto.getProductTypeName());
        p.setProductTypeCode(productTypeDto.getProductTypeCode());
        p.setShopId(shopRepository.findById(productTypeDto.getShopId()).get());
        return p;
    }

    public ProductTypeDto mappingProductTypeToDTO(ProductType productType){
        ProductTypeDto p = new ProductTypeDto();
        p.setId(productType.getId());
        p.setProductTypeName(productType.getProductTypeName());
        p.setProductTypeCode(productType.getProductTypeCode());
        p.setShopId(productType.getShopId().getId());
        return p;
    }
}
