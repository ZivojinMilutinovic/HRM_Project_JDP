package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ChangeStatusResponse extends ErrorResponse implements Serializable
{

    @SerializedName("ResponseCode")
    @Expose
    private Integer ResponseCode;
    @SerializedName("ResponseMessage")
    @Expose
    private String ResponseMessage;
    @SerializedName("Data")
    @Expose
    private Integer Data;
    @SerializedName("SpecialData")
    @Expose
    private Object SpecialData;
    private final static long serialVersionUID = 4902529474474305199L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ChangeStatusResponse() {
    }

    /**
     *
     * @param data
     * @param SpecialData
     * @param ResponseMessage
     * @param ResponseCode
     */
    public ChangeStatusResponse(Integer ResponseCode, String ResponseMessage, Integer data, Object SpecialData) {
        super();
        this.ResponseCode = ResponseCode;
        this.ResponseMessage = ResponseMessage;
        this.Data = data;
        this.SpecialData = SpecialData;
    }

    public Integer getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(Integer ResponseCode) {
        this.ResponseCode = ResponseCode;
    }

    public String getResponseMessage() {
        return ResponseMessage;
    }

    public void setResponseMessage(String ResponseMessage) {
        this.ResponseMessage = ResponseMessage;
    }

    public Integer getData() {
        return Data;
    }

    public void setData(Integer data) {
        this.Data = data;
    }

    public Object getSpecialData() {
        return SpecialData;
    }

    public void setSpecialData(Object SpecialData) {
        this.SpecialData = SpecialData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ResponseCode", ResponseCode).append("ResponseMessage", ResponseMessage).append("data", Data).append("SpecialData", SpecialData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SpecialData).append(ResponseMessage).append(Data).append(ResponseCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeStatusResponse) == false) {
            return false;
        }
        ChangeStatusResponse rhs = ((ChangeStatusResponse) other);
        return new EqualsBuilder().append(SpecialData, rhs.SpecialData).append(ResponseMessage, rhs.ResponseMessage).append(Data, rhs.Data).append(ResponseCode, rhs.ResponseCode).isEquals();
    }

}