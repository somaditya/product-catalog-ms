package com.amdocs.productinfoservice.resources;

import com.amdocs.productinfoservice.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @RequestMapping("/{productId}")
    public Product getProductInfo(@PathVariable("productId") String productId) {
        return new Product(productId, "test name");
    }
}
