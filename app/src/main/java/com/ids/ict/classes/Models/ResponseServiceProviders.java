package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseServiceProviders {

    @SerializedName("RetrieveServiceProvidersResult")
    @Expose
    private RetrieveProblemTypesResult retrieveServiceProviders;

    public RetrieveProblemTypesResult getRetrieveProblemCategoriesResult() {
        return retrieveServiceProviders;
    }

    public void setRetrieveProblemCategoriesResult(RetrieveProblemTypesResult retrieveServiceProviders) {
        this.retrieveServiceProviders = retrieveServiceProviders;
    }

}