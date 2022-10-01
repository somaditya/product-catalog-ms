package com.amdocs.ratingsdataservice.resources;

import com.amdocs.ratingsdataservice.models.Rating;
import com.amdocs.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/products/{productId}")
    public Rating getRating(@PathVariable("productId") String productId) {
        return new Rating(productId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1", 3),
                new Rating("2", 4),
                new Rating("3", 5)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
