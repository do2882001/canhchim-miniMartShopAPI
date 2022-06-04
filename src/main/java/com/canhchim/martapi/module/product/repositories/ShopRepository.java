package com.canhchim.martapi.module.product.repositories;

import com.canhchim.martapi.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
}