package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateTicketLocationResult {

    @SerializedName("IsFaulted")
    @Expose
    private Boolean isFaulted;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Result")
    @Expose
    private Object result;

    public Boolean getIsFaulted() {
        return isFaulted;
    }

    public void setIsFaulted(Boolean isFaulted) {
        this.isFaulted = isFaulted;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}