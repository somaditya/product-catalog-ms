package com.amdocs.productcatalogservice.models;

public class Product {

    private String productId;
    private String name;
    private String desc;

    public Product() {
    }

    public Product(String productId, String name, String desc) {
        this.productId = productId;
        this.name = name;
        this.desc = desc;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
