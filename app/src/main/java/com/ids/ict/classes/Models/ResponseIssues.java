package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseIssues {

    @SerializedName("RetrieveIssuesResult")
    @Expose
    private RetrieveIssuesResult retrieveIssuesResult;

    public RetrieveIssuesResult getRetrieveIssuesResult() {
        return retrieveIssuesResult;
    }

    public void setRetrieveIssuesResult(RetrieveIssuesResult retrieveIssuesResult) {
        this.retrieveIssuesResult = retrieveIssuesResult;
    }

}
