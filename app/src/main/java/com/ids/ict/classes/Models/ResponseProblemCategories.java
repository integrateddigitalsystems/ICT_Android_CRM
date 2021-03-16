package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseProblemCategories {

    @SerializedName("RetrieveProblemCategoriesResult")
    @Expose
    private RetrieveProblemTypesResult retrieveProblemCategoriesResult;

    public RetrieveProblemTypesResult getRetrieveProblemCategoriesResult() {
        return retrieveProblemCategoriesResult;
    }

    public void setRetrieveProblemCategoriesResult(RetrieveProblemTypesResult retrieveProblemCategoriesResult) {
        this.retrieveProblemCategoriesResult = retrieveProblemCategoriesResult;
    }

}