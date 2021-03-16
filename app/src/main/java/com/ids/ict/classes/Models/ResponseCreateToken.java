package com.ids.ict.classes.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseCreateToken {

    @SerializedName("CreateTokenResult")
    @Expose
    private CreateTokenResult createTokenResult;

    public CreateTokenResult getCreateTokenResult() {
        return createTokenResult;
    }

    public void setCreateTokenResult(CreateTokenResult createTokenResult) {
        this.createTokenResult = createTokenResult;
    }

}