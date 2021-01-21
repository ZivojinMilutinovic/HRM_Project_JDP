
package com.hrm.test.api.data.model.check_email;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class CheckEmail implements Serializable
{

    @SerializedName("ResponseCode")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer ResponseCode;
    @SerializedName("ResponseMessage")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String ResponseMessage;
    @SerializedName("Data")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer Data;
    @SerializedName("SpecialData")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private Object SpecialData;
    private final static long serialVersionUID = 3150334026307899491L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CheckEmail() {
    }

    /**
     * 
     * @param Data
     * @param SpecialData
     * @param ResponseMessage
     * @param ResponseCode
     */
    public CheckEmail(Integer ResponseCode, String ResponseMessage, Integer Data, Object SpecialData) {
        super();
        this.ResponseCode = ResponseCode;
        this.ResponseMessage = ResponseMessage;
        this.Data = Data;
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

    public void setData(Integer Data) {
        this.Data = Data;
    }

    public Object getSpecialData() {
        return SpecialData;
    }

    public void setSpecialData(Object SpecialData) {
        this.SpecialData = SpecialData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ResponseCode", ResponseCode).append("ResponseMessage", ResponseMessage).append("Data", Data).append("SpecialData", SpecialData).toString();
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
        if ((other instanceof CheckEmail) == false) {
            return false;
        }
        CheckEmail rhs = ((CheckEmail) other);
        return new EqualsBuilder().append(SpecialData, rhs.SpecialData).append(ResponseMessage, rhs.ResponseMessage).append(Data, rhs.Data).append(ResponseCode, rhs.ResponseCode).isEquals();
    }

}
