package com.ids.ict.classes.Models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetrieveProblemTypesResult {

    @SerializedName("IsFaulted")
    @Expose
    private Boolean isFaulted;
    @SerializedName("Message")
    @Expose
    private Object message;
    @SerializedName("Result")
    @Expose
    private ArrayList<ResultResponseTypes> result = null;

    public Boolean getIsFaulted() {
        return isFaulted;
    }

    public void setIsFaulted(Boolean isFaulted) {
        this.isFaulted = isFaulted;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public ArrayList<ResultResponseTypes> getResult() {
        return result;
    }

    public void setResult(ArrayList<ResultResponseTypes> result) {
        this.result = result;
    }

}