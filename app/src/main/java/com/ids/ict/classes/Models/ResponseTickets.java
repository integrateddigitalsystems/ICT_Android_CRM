package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseTickets {

    @SerializedName("RetrieveTicketsResult")
    @Expose
    private RetrieveTicketsResult retrieveTicketsResult;

    public RetrieveTicketsResult getRetrieveTicketsResult() {
        return retrieveTicketsResult;
    }

    public void setRetrieveTicketsResult(RetrieveTicketsResult retrieveTicketsResult) {
        this.retrieveTicketsResult = retrieveTicketsResult;
    }

}