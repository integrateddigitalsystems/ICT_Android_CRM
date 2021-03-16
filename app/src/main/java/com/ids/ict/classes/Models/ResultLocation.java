package com.ids.ict.classes.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultLocation {

    @SerializedName("IssueArabicName")
    @Expose
    private String issueArabicName;
    @SerializedName("IssueEnglishName")
    @Expose
    private String issueEnglishName;
    @SerializedName("NumberOfTickets")
    @Expose
    private Integer numberOfTickets;
    @SerializedName("TicketLocations")
    @Expose
    private List<TicketLocation> ticketLocations = null;

    public String getIssueArabicName() {
        return issueArabicName;
    }

    public void setIssueArabicName(String issueArabicName) {
        this.issueArabicName = issueArabicName;
    }

    public String getIssueEnglishName() {
        return issueEnglishName;
    }

    public void setIssueEnglishName(String issueEnglishName) {
        this.issueEnglishName = issueEnglishName;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public List<TicketLocation> getTicketLocations() {
        return ticketLocations;
    }

    public void setTicketLocations(List<TicketLocation> ticketLocations) {
        this.ticketLocations = ticketLocations;
    }

}