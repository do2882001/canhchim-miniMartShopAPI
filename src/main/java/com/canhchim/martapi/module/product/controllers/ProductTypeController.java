package com.canhchim.martapi.module.product.controllers;

import com.canhchim.martapi.entity.ProductType;
import com.canhchim.martapi.module.product.data.MappingData;
import com.canhchim.martapi.module.product.data.requestDTO.ProductTypeDto;
import com.canhchim.martapi.module.product.service.ProductTypeService;
import com.canhchim.martapi.util.PermissionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("product-type")
public class ProductTypeController {
    @Autowired
    ProductTypeService productTypeService;

    @Autowired
    PermissionUtil permissionUtil ;

    @PostMapping("/test-acceptAction")
    String testAcceptAction (HttpServletRequest httpServletRequest, @RequestBody ProductTypeDto productTypeDto) throws IOException {
        permissionUtil.acceptAction(httpServletRequest,"ProductType","shopId.id","id",1);
        System.err.println("Id: " + permissionUtil.getShopId(httpServletRequest));
        return "chay dc";
    }

    @PostMapping("/create-product-type")
    ResponseEntity<ProductTypeDto> addProductType (HttpServletRequest httpServletRequest, @RequestBody ProductTypeDto productTypeDto) throws IOException {
        permissionUtil.acceptAction(httpServletRequest,"ProductType","shopId.id","id",1);
        ProductType productType = productTypeService.addProductType(productTypeDto,permissionUtil.getShopId(httpServletRequest));
        MappingData map = new MappingData();
        if (productType == null){
            return null;
        }else {
            return ResponseEntity.ok().body(map.mappingProductTypeToDTO(productType));
        }
    }

    @GetMapping ("")
    ResponseEntity<List<ProductTypeDto>> getAllProductType (HttpServletRequest httpServletRequest) throws IOException {
        permissionUtil.acceptAction(httpServletRequest,"ProductType","shopId.id","id",1);
        List<ProductTypeDto> list = productTypeService.getAllProductType(permissionUtil.getShopId(httpServletRequest));
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/update-product-type")
    ResponseEntity<ProductTypeDto> updateProductType (HttpServletRequest httpServletRequest, @RequestBody ProductTypeDto productTypeDto) throws IOException {
        permissionUtil.acceptAction(httpServletRequest,"ProductType","shopId.id","id",1);
        ProductTypeDto productType = productTypeService.update(productTypeDto,permissionUtil.getShopId(httpServletRequest));
        if (productType == null){
            return null;
        }else {
            return ResponseEntity.ok().body(productType);
        }
    }

    @PostMapping("/delete-product-type")
    ResponseEntity<String> deleteProductType (HttpServletRequest httpServletRequest, @RequestBody ProductTypeDto productTypeDto) throws IOException {
        permissionUtil.acceptAction(httpServletRequest,"ProductType","shopId.id","id",1);
        String notification = productTypeService.delete(productTypeDto,permissionUtil.getShopId(httpServletRequest));
        return ResponseEntity.ok().body(notification);
    }
}
