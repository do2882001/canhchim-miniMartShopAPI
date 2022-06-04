package com.canhchim.martapi.module.product.repositories;

import com.canhchim.martapi.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

    @Query("select p from ProductType p where p.shopId.id = ?1")
    List<ProductType> findByShop_Id(Integer id);

    @Query("select p from ProductType p where p.productTypeCode = ?1 and p.productTypeName = ?2")
    Optional<ProductType> findByProductTypeCodeAndProductTypeName(Integer productTypeCode, String productTypeName);


}