package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseTicketComments {

    @SerializedName("RetrieveTicketCommentsResult")
    @Expose
    private RetrieveTicketCommentsResult retrieveTicketCommentsResult;

    public RetrieveTicketCommentsResult getRetrieveTicketCommentsResult() {
        return retrieveTicketCommentsResult;
    }

    public void setRetrieveTicketCommentsResult(RetrieveTicketCommentsResult retrieveTicketCommentsResult) {
        this.retrieveTicketCommentsResult = retrieveTicketCommentsResult;
    }

}