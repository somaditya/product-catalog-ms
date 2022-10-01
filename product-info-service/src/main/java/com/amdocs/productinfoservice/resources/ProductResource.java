package com.amdocs.productinfoservice.resources;

import com.amdocs.productinfoservice.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResource {

    List<Product> products = Arrays.asList(
            new Product("1", "iPhone", "mobile"),
            new Product("2", "iMac", "desktop"),
            new Product("3", "MacBook", "laptop")
    );

    @RequestMapping("/{productId}")
    public Optional<Product> getProductInfo(@PathVariable("productId") String productId) {
        return products.stream().filter(p -> p.getProductId().equals(productId)).findFirst();
    }
}
