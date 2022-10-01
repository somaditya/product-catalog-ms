package com.amdocs.productcatalogservice.models;

public class Rating {

    private String productId;
    private int rating;

    public Rating() {
    }

    public Rating(String productId, int rating) {
        this.productId = productId;
        this.rating = rating;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "movieId='" + productId + '\'' +
                ", rating=" + rating +
                '}';
    }
}
