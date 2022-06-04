package com.canhchim.martapi.module.product.service;

import com.canhchim.martapi.entity.ProductType;
import com.canhchim.martapi.entity.Shop;

import com.canhchim.martapi.module.product.data.MappingData;
import com.canhchim.martapi.module.product.data.requestDTO.ProductTypeDto;
import com.canhchim.martapi.module.product.repositories.ProductTypeRepository;
import com.canhchim.martapi.module.product.repositories.ShopRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    ShopRepository shopRepository;


    @Autowired
    MappingData mappingData;

    public ProductType addProductType(ProductTypeDto productTypeDto, int shopId){
        List<ProductType> pT = productTypeRepository.findAll();
        ProductType newProductType = null;
        boolean flag = true;
        for (ProductType p:pT ) {
            if (p.getProductTypeName().equals(productTypeDto.getProductTypeName())&& p.getProductTypeCode().equals(productTypeDto.getProductTypeCode())){
                flag = false;
            }
        }
        if(flag){
            newProductType = mappingData.mappingProductTypeDTOToEntity(productTypeDto);
            newProductType.setShopId(shopRepository.findById(shopId).get());

            System.err.println(
                    "******************************************"
                            + newProductType.getShopId()
                            + newProductType.getProductTypeName()
                            + newProductType.getProductTypeCode());


            System.err.println(
                    "******************************************"
                            + productTypeDto.getShopId()
                            + productTypeDto.getProductTypeName()
                            + productTypeDto.getProductTypeCode());
            return productTypeRepository.save(newProductType);
        }else return null;
    }

    public List<ProductTypeDto> getAllProductType(int shopId){
        List<ProductType> productTypeList = productTypeRepository.findByShop_Id(shopId);
        //System.out.println("Number Of ProductType: "+productTypeList.size());

        List<ProductTypeDto> list = new ArrayList<ProductTypeDto>();

        for (ProductType p : productTypeList) {
            list.add(mappingData.mappingProductTypeToDTO(p));
        }
        return list;
    }

    public ProductTypeDto update(ProductTypeDto productTypeDto , int shopId){
        // Sua lai logic
        ProductType productType = productTypeRepository.findById(productTypeDto.getId()).get();
        if (productType != null && productType.getShopId().getId() == shopId){
            productType.setProductTypeCode(productTypeDto.getProductTypeCode());
            productType.setProductTypeName(productTypeDto.getProductTypeName());
            return mappingData.mappingProductTypeToDTO(productTypeRepository.save(productType));
        } else return null;
    }

    public String delete(ProductTypeDto productTypeDto , int shopId){
        ProductType productType = productTypeRepository.findById(productTypeDto.getId()).get();
        if (productType != null){
            productTypeRepository.delete(productType);
            return "DELETED";
        } else return "This ProductType is exist";
    }
}
