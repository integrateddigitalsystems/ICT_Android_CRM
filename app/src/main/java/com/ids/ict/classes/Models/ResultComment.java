package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultComment {

    @SerializedName("Attachment")
    @Expose
    private Attachment attachment;
    @SerializedName("IsUSer")
    @Expose
    private Boolean isUSer;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("RecordDate")
    @Expose
    private String recordDate;
    @SerializedName("TicketID")
    @Expose
    private String ticketID;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Boolean getIsUSer() {
        return isUSer;
    }

    public void setIsUSer(Boolean isUSer) {
        this.isUSer = isUSer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

}