package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseProblemTypes {

    @SerializedName("RetrieveProblemTypesResult")
    @Expose
    private RetrieveProblemTypesResult retrieveProblemTypesResult;

    public RetrieveProblemTypesResult getRetrieveProblemTypesResult() {
        return retrieveProblemTypesResult;
    }

    public void setRetrieveProblemTypesResult(RetrieveProblemTypesResult retrieveProblemTypesResult) {
        this.retrieveProblemTypesResult = retrieveProblemTypesResult;
    }

}