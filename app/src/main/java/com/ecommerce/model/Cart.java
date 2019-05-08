package com.ecommerce.model;

public class Cart {

    private String cartPrice;
    private String cartName;
    private String imgUrl;

    public Cart(String cartPrice, String cartName, String imgUrl) {
        this.cartPrice = cartPrice;
        this.cartName = cartName;
        this.imgUrl = imgUrl;
    }

    public String getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(String cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
