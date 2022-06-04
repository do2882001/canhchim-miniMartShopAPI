package com.canhchim.martapi.module.product.controllers;

import com.canhchim.martapi.module.product.service.ProductInputDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product-input-detail")
public class ProductInputDetailController {
    @Autowired
    ProductInputDetailService productInputDetailService;

    //@GetMapping("get-all")

}
