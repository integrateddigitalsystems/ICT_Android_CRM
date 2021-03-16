package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestCreateTicket {

    @SerializedName("Customer")
    private Customer customer;
    @SerializedName("TicketType")
    
    private Integer ticketType;
    @SerializedName("ProblemCategory")
    
    private String problemCategory;
    @SerializedName("ProblemType")
    
    private String problemType;
    @SerializedName("Issue")
    
    private String issue;
    @SerializedName("ServiceProvider")
    
    private String serviceProvider;
    @SerializedName("AffectedServiceNumber")
    
    private String affectedServiceNumber;
    @SerializedName("ComplainedToServiceProvider")
    
    private Boolean complainedToServiceProvider;
    @SerializedName("ServiceProviderComplaintStatus")
    
    private String serviceProviderComplaintStatus;
    @SerializedName("ServiceProvideComplaintReferenceNumber")
    
    private String serviceProvideComplaintReferenceNumber;
    @SerializedName("ServiceProviderDateOfComplaint")
    
    private String serviceProviderDateOfComplaint;
    @SerializedName("ApplicationSubmittedDate")
    
    private String applicationSubmittedDate;
    @SerializedName("ComplaintReferenceNumber")
    
    private Object complaintReferenceNumber;
    @SerializedName("ContactNumber")
    
    private String contactNumber;
    @SerializedName("CallerNumber")
    
    private String callerNumber;
    @SerializedName("SPChannel")
    
    private String sPChannel;
    @SerializedName("ProblemDescription")
    
    private String problemDescription;

    @SerializedName("LocationX")
    
    private String LocationX;
    @SerializedName("LocationY")
    
    private String LocationY;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public String getProblemCategory() {
        return problemCategory;
    }

    public void setProblemCategory(String problemCategory) {
        this.problemCategory = problemCategory;
    }


    public String getLocationX() {
        return LocationX;
    }

    public void setLocationX(String locationX) {
        LocationX = locationX;
    }

    public String getLocationY() {
        return LocationY;
    }

    public void setLocationY(String locationY) {
        LocationY = locationY;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getAffectedServiceNumber() {
        return affectedServiceNumber;
    }

    public void setAffectedServiceNumber(String affectedServiceNumber) {
        this.affectedServiceNumber = affectedServiceNumber;
    }

    public Boolean getComplainedToServiceProvider() {
        return complainedToServiceProvider;
    }

    public void setComplainedToServiceProvider(Boolean complainedToServiceProvider) {
        this.complainedToServiceProvider = complainedToServiceProvider;
    }

    public String getServiceProviderComplaintStatus() {
        return serviceProviderComplaintStatus;
    }

    public void setServiceProviderComplaintStatus(String serviceProviderComplaintStatus) {
        this.serviceProviderComplaintStatus = serviceProviderComplaintStatus;
    }

    public String getServiceProvideComplaintReferenceNumber() {
        return serviceProvideComplaintReferenceNumber;
    }

    public void setServiceProvideComplaintReferenceNumber(String serviceProvideComplaintReferenceNumber) {
        this.serviceProvideComplaintReferenceNumber = serviceProvideComplaintReferenceNumber;
    }

    public String getServiceProviderDateOfComplaint() {
        return serviceProviderDateOfComplaint;
    }

    public void setServiceProviderDateOfComplaint(String serviceProviderDateOfComplaint) {
        this.serviceProviderDateOfComplaint = serviceProviderDateOfComplaint;
    }

    public String getApplicationSubmittedDate() {
        return applicationSubmittedDate;
    }

    public void setApplicationSubmittedDate(String applicationSubmittedDate) {
        this.applicationSubmittedDate = applicationSubmittedDate;
    }

    public Object getComplaintReferenceNumber() {
        return complaintReferenceNumber;
    }

    public void setComplaintReferenceNumber(Object complaintReferenceNumber) {
        this.complaintReferenceNumber = complaintReferenceNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public String getSPChannel() {
        return sPChannel;
    }

    public void setSPChannel(String sPChannel) {
        this.sPChannel = sPChannel;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }


    public RequestCreateTicket(Customer customer, int ticketType, String problemCategory, String problemType, String issue, String serviceProvider, String affectedServiceNumber, Boolean complainedToServiceProvider, String serviceProviderComplaintStatus, String serviceProvideComplaintReferenceNumber, String serviceProviderDateOfComplaint, String applicationSubmittedDate, Object complaintReferenceNumber, String contactNumber, String callerNumber, String sPChannel, String problemDescription, String locationX, String locationY) {
        this.customer = customer;
        this.ticketType = ticketType;
        this.problemCategory = problemCategory;
        this.problemType = problemType;
        this.issue = issue;
        this.serviceProvider = serviceProvider;
        this.affectedServiceNumber = affectedServiceNumber;
        this.complainedToServiceProvider = complainedToServiceProvider;
        this.serviceProviderComplaintStatus = serviceProviderComplaintStatus;
        this.serviceProvideComplaintReferenceNumber = serviceProvideComplaintReferenceNumber;
        this.serviceProviderDateOfComplaint = serviceProviderDateOfComplaint;
        this.applicationSubmittedDate = applicationSubmittedDate;
        this.complaintReferenceNumber = complaintReferenceNumber;
        this.contactNumber = contactNumber;
        this.callerNumber = callerNumber;
        this.sPChannel = sPChannel;
        this.problemDescription = problemDescription;
        LocationX = locationX;
        LocationY = locationY;
    }
}