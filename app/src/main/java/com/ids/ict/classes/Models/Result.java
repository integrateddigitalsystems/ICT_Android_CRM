package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ProblemCategory")
    @Expose
    private ProblemCategory problemCategory;
    @SerializedName("ProblemType")
    @Expose
    private ProblemType problemType;


    private Boolean ShowOnMap=false;
    private String duration;
    private String SpecialNeedsDuration;
    private String SpecialNeedsDurationUnit;
    private String SpecialNeedsDurationUnitAr;
    private String Unit;
    private String UnitAr;
    private String CanModifyMobileNo;
    private String CheckOnApplicationDate;


    public Boolean getShowOnMap() {
        return ShowOnMap;
    }

    public void setShowOnMap(Boolean showOnMap) {
        ShowOnMap = showOnMap;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSpecialNeedsDuration() {
        return SpecialNeedsDuration;
    }

    public void setSpecialNeedsDuration(String specialNeedsDuration) {
        SpecialNeedsDuration = specialNeedsDuration;
    }

    public String getSpecialNeedsDurationUnit() {
        return SpecialNeedsDurationUnit;
    }

    public void setSpecialNeedsDurationUnit(String specialNeedsDurationUnit) {
        SpecialNeedsDurationUnit = specialNeedsDurationUnit;
    }

    public String getSpecialNeedsDurationUnitAr() {
        return SpecialNeedsDurationUnitAr;
    }

    public void setSpecialNeedsDurationUnitAr(String specialNeedsDurationUnitAr) {
        SpecialNeedsDurationUnitAr = specialNeedsDurationUnitAr;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getUnitAr() {
        return UnitAr;
    }

    public void setUnitAr(String unitAr) {
        UnitAr = unitAr;
    }

    public String getCanModifyMobileNo() {
        return CanModifyMobileNo;
    }

    public void setCanModifyMobileNo(String canModifyMobileNo) {
        CanModifyMobileNo = canModifyMobileNo;
    }

    public String getCheckOnApplicationDate() {
        return CheckOnApplicationDate;
    }

    public void setCheckOnApplicationDate(String checkOnApplicationDate) {
        CheckOnApplicationDate = checkOnApplicationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProblemCategory getProblemCategory() {
        return problemCategory;
    }

    public void setProblemCategory(ProblemCategory problemCategory) {
        this.problemCategory = problemCategory;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }

}