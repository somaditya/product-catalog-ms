package com.amdocs.ratingsdataservice.resources;

import com.amdocs.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{productId}")
    public Rating getRating(@PathVariable("productId") String productId) {
        return new Rating(productId, 4);
    }
}
