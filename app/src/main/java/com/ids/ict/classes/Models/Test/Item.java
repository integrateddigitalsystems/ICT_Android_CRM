package com.ids.ict.classes.Models.Test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("CategoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("CategoryName")
    @Expose
    private String categoryName;
    @SerializedName("Type")
    @Expose
    private Object type;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Pictures")
    @Expose
    private List<Picture> pictures = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

}