package com.canhchim.martapi.module.product.service;


import com.canhchim.martapi.module.product.repositories.ProductinputdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductInputDetailService {
    @Autowired
    ProductinputdetailRepository productinputdetailRepository;


}
