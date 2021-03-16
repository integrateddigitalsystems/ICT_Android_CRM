package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseRetrieveTicketLocations {

    @SerializedName("RetrieveTicketLocationsResult")
    @Expose
    private RetrieveTicketLocationsResult retrieveTicketLocationsResult;

    public RetrieveTicketLocationsResult getRetrieveTicketLocationsResult() {
        return retrieveTicketLocationsResult;
    }

    public void setRetrieveTicketLocationsResult(RetrieveTicketLocationsResult retrieveTicketLocationsResult) {
        this.retrieveTicketLocationsResult = retrieveTicketLocationsResult;
    }

}