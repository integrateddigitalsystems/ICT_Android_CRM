package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("MiddleName")
    @Expose
    private String middleName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("EmailAddress")
    @Expose
    private Object emailAddress;
    @SerializedName("ContactNumber")
    @Expose
    private String contactNumber;
    @SerializedName("CustomerType")
    @Expose
    private String customerType;
    @SerializedName("CustomerIdType")
    @Expose
    private String customerIdType;
    @SerializedName("CustomerId")
    @Expose
    private String customerId;
    @SerializedName("IsSpecialNeedsCustomer")
    @Expose
    private Boolean isSpecialNeedsCustomer;
    @SerializedName("SpecialNeedsRegistrationNumber")
    @Expose
    private String specialNeedsRegistrationNumber;
    @SerializedName("PreferredLanguage")
    @Expose
    private Integer preferredLanguage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerIdType() {
        return customerIdType;
    }

    public void setCustomerIdType(String customerIdType) {
        this.customerIdType = customerIdType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Boolean getIsSpecialNeedsCustomer() {
        return isSpecialNeedsCustomer;
    }

    public void setIsSpecialNeedsCustomer(Boolean isSpecialNeedsCustomer) {
        this.isSpecialNeedsCustomer = isSpecialNeedsCustomer;
    }

    public String getSpecialNeedsRegistrationNumber() {
        return specialNeedsRegistrationNumber;
    }

    public void setSpecialNeedsRegistrationNumber(String specialNeedsRegistrationNumber) {
        this.specialNeedsRegistrationNumber = specialNeedsRegistrationNumber;
    }

    public Integer getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Integer preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }


    public Customer(String firstName, String middleName, String lastName, String emailAddress, String contactNumber, String customerType, String customerIdType, String customerId, Boolean isSpecialNeedsCustomer, String specialNeedsRegistrationNumber, Integer preferredLanguage) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.customerType = customerType;
        this.customerIdType = customerIdType;
        this.customerId = customerId;
        this.isSpecialNeedsCustomer = isSpecialNeedsCustomer;
        this.specialNeedsRegistrationNumber = specialNeedsRegistrationNumber;
        this.preferredLanguage = preferredLanguage;
    }
}
