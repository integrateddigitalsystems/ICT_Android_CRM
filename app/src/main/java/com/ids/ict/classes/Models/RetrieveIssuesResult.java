package com.ids.ict.classes.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetrieveIssuesResult {

    @SerializedName("IsFaulted")
    @Expose
    private Boolean isFaulted;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Result")
    @Expose
    private List<Result> result = null;

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

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

}