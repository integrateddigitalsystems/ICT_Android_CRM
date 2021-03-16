package com.ids.ict.classes.Models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseMessagesTable {

    @SerializedName("messages")
    @Expose
    private ArrayList<MessagesTable> messages = null;

    public ArrayList<MessagesTable> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<MessagesTable> messages) {
        this.messages = messages;
    }

}