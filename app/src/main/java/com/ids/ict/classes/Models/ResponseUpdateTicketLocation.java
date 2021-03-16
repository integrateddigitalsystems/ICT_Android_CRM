package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseUpdateTicketLocation {

    @SerializedName("UpdateTicketLocationResult")
    @Expose
    private UpdateTicketLocationResult updateTicketLocationResult;

    public UpdateTicketLocationResult getUpdateTicketLocationResult() {
        return updateTicketLocationResult;
    }

    public void setUpdateTicketLocationResult(UpdateTicketLocationResult updateTicketLocationResult) {
        this.updateTicketLocationResult = updateTicketLocationResult;
    }

}