package com.ids.ict.classes;

/**
 * Created by Amal on 4/26/2016.
 */
public class Ticket {

    private int id;
    private int issuetypeid;
    private int qatarid;
    private String uid;
    private String affectedMobileNumber;
    private String sendingDate;
    private String rout;
    private String issueDetailNameEn;
    private String issueDetailNameAr;
    private String CRA;
    private String updateDate;
    private String sublocation;
    private String locality;
    private String mobilenumber;
    private String affectednumber;
    private String comments;
    private String type;
    private String calledFromNumber;
    private String email;
    private String CRNum;
    private String affectedqatarid;
    private String serviceProvider;
    private String serviceProviderAr;
    private String spComplaint;
    private String spComplaintID;
    private String longWait;
    private String waitTime;
    private String waitTimeAr;
    private String cmplRefNum;
    private String cmplDate;
    private String calldate;
    private String status;
    private String eventNameEn;
    private String eventNameAr;

    public String getAffectedqatarid() {
        return affectedqatarid;
    }

    public void setAffectedqatarid(String affectedqatarid) {
        this.affectedqatarid = affectedqatarid;
    }

    public String getSpComplaintID() {
        return spComplaintID;
    }

    public void setSpComplaintID(String spComplaintID) {
        this.spComplaintID = spComplaintID;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getWaitTimeAr() {
        return waitTimeAr;
    }

    public void setWaitTimeAr(String waitTimeAr) {
        this.waitTimeAr = waitTimeAr;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCalldate() {
        return calldate;
    }
    public void setEventNameEn(String eventNameEn) {
        this.eventNameEn = eventNameEn;
    }
    public void setEventNameAr(String eventNameAr) {
        this.eventNameAr = eventNameAr;
    }
    public String getSublocation() {
        return sublocation;
    }
    public void setStatus(String s) {
        this.status = s;
    }
    public void setwaitTime(String s) {
        this.waitTime = s;
    }
    public void setwaitTimeAr(String s) {
        this.waitTimeAr = s;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setaffectedqatarid(String s) {
        this.affectedqatarid = s;
    }
    public void setCRNum(String CRNum) {
        this.CRNum = CRNum;
    }
    public void setServiceProvider(String s) {
        this.serviceProvider = s;
    }
    public void setServiceProviderAr(String s) {
        this.serviceProviderAr = s;
    }
    public void setSpComplaint(String s) {
        this.spComplaint = s;
    }
    public void setSpComplaintId(String s) {
        this.spComplaintID = s;
    }
    public void setLongWait(String s) {
        this.longWait = s;
    }
    public String getSpComplaint() {
        return spComplaint;
    }
    public void setCmplRefNum(String s) {
        this.cmplRefNum = s;
    }
    public void setCmplDate(String s) {
        this.cmplDate = s;
    }
    public void setCalldate(String s) {
        this.calldate = s;
    }
    public void setSublocation(String sublocation) {
        this.sublocation = sublocation;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public String getAffectednumber() {
        return affectednumber;
    }
    public void setAffectednumber(String affectednumber) {
        this.affectednumber = affectednumber;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCalledFromNumber() {
        return calledFromNumber;
    }
    public void setCalledFromNumber(String calledFromNumber) {
        this.calledFromNumber = calledFromNumber;
    }


    public String getEventNameEn() {
        return eventNameEn;
    }
    public String getEventNameAr() {
        return eventNameAr;
    }
    public String getwaitTime() {
        return waitTime;
    }
    public String getwaitTimeAr() {
        return waitTimeAr;
    }
    public String getEmail() {
        return email;
    }
    public String getaffectedqatarid() {
        return affectedqatarid;
    }
    public String getCRNum() {
        return CRNum;
    }
    public String getServiceProvider() {
        return serviceProvider;
    }
    public String getServiceProviderAr() {
        return serviceProviderAr;
    }
    public String getSpComplaintId() {
        return spComplaintID;
    }
    public String getLongWait() {
        return longWait;
    }
    public String getCmplRefNum() {
        return cmplRefNum;
    }
    public String getCmplDate() {
        return cmplDate;
    }
    public String getCalldatee() {
        return calldate;
    }
    public String getStatus() {
        return status;
    }
    public String getLocality() {
        return locality;
    }
    public String getMobilenumber() {
        return mobilenumber;
    }
    public String getComments() {
        return comments;
    }
    public String getType() {
        return type;
    }
    public String getCRA() {
        return CRA;
    }
    public int getId() {
        return id;
    }
    public String getIssueDetailNameEn() {
        return issueDetailNameEn;
    }
    public String getIssueDetailNameAr() {
        return issueDetailNameAr;
    }
    public String getSendingDate() {
        return sendingDate;
    }
    public String getAffectedMobileNumber() {
        return affectedMobileNumber;
    }
    public int getQatarid() {
        return qatarid;
    }

    public Ticket(int id,String uid, int qatarid, String affectedMobileNumber, String sendingDate, String issueDetailNameEn, String issueDetailNameAr, String CRA, String locality, String mobilenumber, String comments, String type, String email, String CRNum, String affectedqatarid, String serviceProvider, String serviceProviderAr, String spComplaintID, String longWait, String waitTime, String waitTimeAr, String cmplRefNum, String cmplDate, String calldate, String status, String eventNameEn, String eventNameAr) {
        this.id = id;
        this.uid=uid;
        this.qatarid = qatarid;
        this.affectedMobileNumber = affectedMobileNumber;
        this.sendingDate = sendingDate;
        this.issueDetailNameEn = issueDetailNameEn;
        this.issueDetailNameAr = issueDetailNameAr;
        this.CRA = CRA;
        this.locality = locality;
        this.mobilenumber = mobilenumber;
        this.comments = comments;
        this.type = type;
        this.email = email;
        this.CRNum = CRNum;
        this.affectedqatarid = affectedqatarid;
        this.serviceProvider = serviceProvider;
        this.serviceProviderAr = serviceProviderAr;
        this.spComplaintID = spComplaintID;
        this.longWait = longWait;
        this.waitTime = waitTime;
        this.waitTimeAr = waitTimeAr;
        this.cmplRefNum = cmplRefNum;
        this.cmplDate = cmplDate;
        this.calldate = calldate;
        this.status = status;
        this.eventNameEn = eventNameEn;
        this.eventNameAr = eventNameAr;

    }

    public Ticket() {

    }

    public void setCRA(String cra) {
        this.CRA = cra;
    }

    public void setUpdateDate(String update) {
        this.updateDate = update;
    }

    public String getUpdateDate() {
        return updateDate;
    }



    public void setId(int id) {
        this.id = id;
    }


    public void setIssueDetailNameEn(String issueDetailNameEn) {
        this.issueDetailNameEn = issueDetailNameEn;
    }


    public void setIssueDetailNameAr(String issueDetailNameAr) {
        this.issueDetailNameAr = issueDetailNameAr;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }


    public void setSendingDate(String sendingDate) {
        this.sendingDate = sendingDate;
    }


    public void setAffectedMobileNumber(String affectedMobileNumber) {
        this.affectedMobileNumber = affectedMobileNumber;
    }


    public void setQatarid(int qatarid) {
        this.qatarid = qatarid;
    }

    public int getIssuetypeid() {
        return issuetypeid;
    }

    public void setIssuetypeid(int issuetypeid) {
        this.issuetypeid = issuetypeid;
    }




}
