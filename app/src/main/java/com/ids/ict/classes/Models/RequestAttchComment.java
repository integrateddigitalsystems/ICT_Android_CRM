package com.ids.ict.classes.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestAttchComment {

    @SerializedName("Comment")
    @Expose
    private CommentTicket comment;
    @SerializedName("Token")
    @Expose
    private String token;


    public CommentTicket getComment() {
        return comment;
    }

    public void setComment(CommentTicket comment) {
        this.comment = comment;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RequestAttchComment(CommentTicket comment, String token) {
        this.comment = comment;
        this.token = token;
    }

    public RequestAttchComment() {
    }
}
