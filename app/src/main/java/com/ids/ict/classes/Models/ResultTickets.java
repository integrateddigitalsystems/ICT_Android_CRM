package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultTickets {

    @SerializedName("AffectedNumber")
    @Expose
    private String affectedNumber;
    @SerializedName("ClosureDate")
    @Expose
    private String closureDate;
    @SerializedName("ContactNumber")
    @Expose
    private String contactNumber;
    @SerializedName("CustomerID")
    @Expose
    private String customerID;
    @SerializedName("Issue")
    @Expose
    private Issue issue;
    @SerializedName("ProblemCategory")
    @Expose
    private ProblemCategory problemCategory;
    @SerializedName("ProblemType")
    @Expose
    private ProblemType problemType;
    @SerializedName("RecordDate")
    @Expose
    private String recordDate;
    @SerializedName("ReferenceMember")
    @Expose
    private String referenceMember;
    @SerializedName("ServiceProvider")
    @Expose
    private ServiceProvider serviceProvider;
    @SerializedName("SpecialNeedsRegisterationNumber")
    @Expose
    private String specialNeedsRegisterationNumber;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("TicketId")
    @Expose
    private String ticketId;
    @SerializedName("TicketType")
    @Expose
    private Integer ticketType;

    public String getAffectedNumber() {
        return affectedNumber;
    }

    public void setAffectedNumber(String affectedNumber) {
        this.affectedNumber = affectedNumber;
    }

    public String getClosureDate() {
        return closureDate;
    }

    public void setClosureDate(String closureDate) {
        this.closureDate = closureDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public ProblemCategory getProblemCategory() {
        return problemCategory;
    }

    public void setProblemCategory(ProblemCategory problemCategory) {
        this.problemCategory = problemCategory;
    }

    public ProblemType getProblemType() {
        return problemType;
    }

    public void setProblemType(ProblemType problemType) {
        this.problemType = problemType;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getReferenceMember() {
        return referenceMember;
    }

    public void setReferenceMember(String referenceMember) {
        this.referenceMember = referenceMember;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getSpecialNeedsRegisterationNumber() {
        return specialNeedsRegisterationNumber;
    }

    public void setSpecialNeedsRegisterationNumber(String specialNeedsRegisterationNumber) {
        this.specialNeedsRegisterationNumber = specialNeedsRegisterationNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

}