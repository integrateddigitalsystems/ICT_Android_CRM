package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentTicket {

    @SerializedName("TicketID")
    @Expose
    private String ticketID;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Attachment")
    @Expose
    private Attachment attachment;

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public CommentTicket(String ticketID, String message,Attachment attachment) {
        this.ticketID = ticketID;
        this.message = message;
        this.attachment=attachment;

    }
}