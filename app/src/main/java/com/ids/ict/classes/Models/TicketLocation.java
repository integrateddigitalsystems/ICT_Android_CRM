package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TicketLocation {

    @SerializedName("LocalityArabicName")
    @Expose
    private String localityArabicName;
    @SerializedName("LocalityEnglishName")
    @Expose
    private String localityEnglishName;
    @SerializedName("LocationX")
    @Expose
    private String locationX;
    @SerializedName("LocationY")
    @Expose
    private String locationY;
    @SerializedName("ProblemTypeArabicName")
    @Expose
    private String problemTypeArabicName;
    @SerializedName("ProblemTypeEnglishName")
    @Expose
    private String problemTypeEnglishName;
    @SerializedName("SubLocalityArabicName")
    @Expose
    private String subLocalityArabicName;
    @SerializedName("SubLocalityEnglishName")
    @Expose
    private String subLocalityEnglishName;

    public String getLocalityArabicName() {
        return localityArabicName;
    }

    public void setLocalityArabicName(String localityArabicName) {
        this.localityArabicName = localityArabicName;
    }

    public String getLocalityEnglishName() {
        return localityEnglishName;
    }

    public void setLocalityEnglishName(String localityEnglishName) {
        this.localityEnglishName = localityEnglishName;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }

    public String getProblemTypeArabicName() {
        return problemTypeArabicName;
    }

    public void setProblemTypeArabicName(String problemTypeArabicName) {
        this.problemTypeArabicName = problemTypeArabicName;
    }

    public String getProblemTypeEnglishName() {
        return problemTypeEnglishName;
    }

    public void setProblemTypeEnglishName(String problemTypeEnglishName) {
        this.problemTypeEnglishName = problemTypeEnglishName;
    }

    public String getSubLocalityArabicName() {
        return subLocalityArabicName;
    }

    public void setSubLocalityArabicName(String subLocalityArabicName) {
        this.subLocalityArabicName = subLocalityArabicName;
    }

    public String getSubLocalityEnglishName() {
        return subLocalityEnglishName;
    }

    public void setSubLocalityEnglishName(String subLocalityEnglishName) {
        this.subLocalityEnglishName = subLocalityEnglishName;
    }

}