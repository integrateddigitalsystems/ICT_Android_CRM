package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestTicket {


        @SerializedName("Ticket")
        private RequestCreateTicket Ticket;
        @SerializedName("Token")
        private String Token;

        public RequestTicket(RequestCreateTicket ticket, String token) {
                Ticket = ticket;
                Token = token;
        }
}
