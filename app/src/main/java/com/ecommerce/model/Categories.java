package com.ecommerce.model;

public class Categories {
    public Categories(String categoryname) {
        this.categoryname = categoryname;
    }

    private String categoryname;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
