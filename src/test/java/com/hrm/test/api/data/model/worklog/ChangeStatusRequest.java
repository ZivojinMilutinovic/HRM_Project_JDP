package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ChangeStatusRequest implements Serializable
{

    @SerializedName("Status")
    @Expose
    private String Status;
    @SerializedName("AdditionalInfo")
    @Expose
    private String AdditionalInfo;
    private final static long serialVersionUID = -5144041330182234355L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ChangeStatusRequest() {
    }

    /**
     *
     * @param AdditionalInfo
     * @param Status
     */
    public ChangeStatusRequest(String Status, String AdditionalInfo) {
        super();
        this.Status = Status;
        this.AdditionalInfo = AdditionalInfo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String AdditionalInfo) {
        this.AdditionalInfo = AdditionalInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Status", Status).append("AdditionalInfo", AdditionalInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(AdditionalInfo).append(Status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeStatusRequest) == false) {
            return false;
        }
        ChangeStatusRequest rhs = ((ChangeStatusRequest) other);
        return new EqualsBuilder().append(AdditionalInfo, rhs.AdditionalInfo).append(Status, rhs.Status).isEquals();
    }

}
