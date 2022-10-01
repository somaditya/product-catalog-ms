package com.amdocs.productcatalogservice.resources;

import com.amdocs.productcatalogservice.models.CatalogItem;
import com.amdocs.productcatalogservice.models.Product;
import com.amdocs.productcatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class ProductCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/user/" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {
            Product product = restTemplate.getForObject("http://localhost:8082/products/" + rating.getProductId(), Product.class);

            return new CatalogItem(product.getName(), product.getDesc(), rating.getRating());
        }).toList();
    }
}
