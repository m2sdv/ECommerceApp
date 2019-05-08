package com.ecommerce.model;

/**
 * Created by android on 10/17/2016.
 */

public class Product {

    private String productName;
    private String imageUrl;
    private String productPrice;


    public Product(String productName, String imageUrl, String productPrice) {
        this.productName = productName;
        this.imageUrl = imageUrl;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }


}
