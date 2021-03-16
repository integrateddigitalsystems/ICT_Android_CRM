package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessagesTable {

    @SerializedName("message_en")
    @Expose
    private String messageEn;
    @SerializedName("message_ar")
    @Expose
    private String messageAr;

    public String getMessageEn() {
        return messageEn;
    }

    @SerializedName("validation_key")
    @Expose
    private String validation_key;

    public void setMessageEn(String messageEn) {
        this.messageEn = messageEn;
    }

    public String getMessageAr() {
        return messageAr;
    }

    public void setMessageAr(String messageAr) {
        this.messageAr = messageAr;
    }

    public String getValidation_key() {
        return validation_key;
    }

    public void setValidation_key(String validation_key) {
        this.validation_key = validation_key;
    }
}