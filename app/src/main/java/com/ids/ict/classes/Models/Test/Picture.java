package com.ids.ict.classes.Models.Test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Picture {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("PageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("Caption")
    @Expose
    private String caption;
    @SerializedName("TypeId")
    @Expose
    private Integer typeId;
    @SerializedName("FileName")
    @Expose
    private String fileName;
    @SerializedName("YouTubePath")
    @Expose
    private String youTubePath;
    @SerializedName("FilePath")
    @Expose
    private String filePath;
    @SerializedName("CroppedImage200x200")
    @Expose
    private String croppedImage200x200;
    @SerializedName("CroppedImage320x308")
    @Expose
    private String croppedImage320x308;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getYouTubePath() {
        return youTubePath;
    }

    public void setYouTubePath(String youTubePath) {
        this.youTubePath = youTubePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCroppedImage200x200() {
        return croppedImage200x200;
    }

    public void setCroppedImage200x200(String croppedImage200x200) {
        this.croppedImage200x200 = croppedImage200x200;
    }

    public String getCroppedImage320x308() {
        return croppedImage320x308;
    }

    public void setCroppedImage320x308(String croppedImage320x308) {
        this.croppedImage320x308 = croppedImage320x308;
    }

}
