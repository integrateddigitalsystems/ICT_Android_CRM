package com.ids.ict.classes.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment {

    @SerializedName("TicketID")
    @Expose
    private String ticketID;
    @SerializedName("FileName")
    @Expose
    private String fileName;
    @SerializedName("FileDescription")
    @Expose
    private String fileDescription;
    @SerializedName("File")
    @Expose
    private int[]  file = null;
    @SerializedName("FileBase64")
    @Expose
    private Object fileBase64;
    @SerializedName("FileExtension")
    @Expose
    private String fileExtension;

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public int[] getFile() {
        return file;
    }

    public void setFile(int[] file) {
        this.file = file;
    }

    public Object getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64(Object fileBase64) {
        this.fileBase64 = fileBase64;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Attachment() {
    }

    public Attachment(String ticketID, String fileName, String fileDescription, int[] file, Object fileBase64, String fileExtension) {
        this.ticketID = ticketID;
        this.fileName = fileName;
        this.fileDescription = fileDescription;
        this.file = file;
        this.fileBase64 = fileBase64;
        this.fileExtension = fileExtension;
    }


}
