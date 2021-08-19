package com.example.ewawe.model;

import java.util.List;

public class Categories {

    String title;
    List<CategoryItem> categoryItemList;

    public Categories(String title, List<CategoryItem> categoryItemList) {
        this.title = title;
        this.categoryItemList = categoryItemList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }
}
