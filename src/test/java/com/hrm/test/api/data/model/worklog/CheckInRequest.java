package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class CheckInRequest implements Serializable
{

    @SerializedName("TimeStamp")
    @Expose
    private String TimeStamp;
    @SerializedName("EmploymentId")
    @Expose
    private Integer EmploymentId;
    @SerializedName("CheckInDevicesType")
    @Expose
    private String CheckInDevicesType;
    @SerializedName("BranchName")
    @Expose
    private String BranchName;
    @SerializedName("WorkLogType")
    @Expose
    private String WorkLogType;
    private final static long serialVersionUID = 2855062049049913493L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CheckInRequest() {
    }

    /**
     *
     * @param TimeStamp
     * @param WorkLogType
     * @param EmploymentId
     * @param BranchName
     * @param CheckInDevicesType
     */
    public CheckInRequest(String TimeStamp, Integer EmploymentId, String CheckInDevicesType, String BranchName, String WorkLogType) {
        super();
        this.TimeStamp = TimeStamp;
        this.EmploymentId = EmploymentId;
        this.CheckInDevicesType = CheckInDevicesType;
        this.BranchName = BranchName;
        this.WorkLogType = WorkLogType;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public Integer getEmploymentId() {
        return EmploymentId;
    }

    public void setEmploymentId(Integer EmploymentId) {
        this.EmploymentId = EmploymentId;
    }

    public String getCheckInDevicesType() {
        return CheckInDevicesType;
    }

    public void setCheckInDevicesType(String CheckInDevicesType) {
        this.CheckInDevicesType = CheckInDevicesType;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String BranchName) {
        this.BranchName = BranchName;
    }

    public String getWorkLogType() {
        return WorkLogType;
    }

    public void setWorkLogType(String WorkLogType) {
        this.WorkLogType = WorkLogType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("TimeStamp", TimeStamp).append("EmploymentId", EmploymentId).append("CheckInDevicesType", CheckInDevicesType).append("BranchName", BranchName).append("WorkLogType", WorkLogType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TimeStamp).append(WorkLogType).append(EmploymentId).append(BranchName).append(CheckInDevicesType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckInRequest) == false) {
            return false;
        }
        CheckInRequest rhs = ((CheckInRequest) other);
        return new EqualsBuilder().append(TimeStamp, rhs.TimeStamp).append(WorkLogType, rhs.WorkLogType).append(EmploymentId, rhs.EmploymentId).append(BranchName, rhs.BranchName).append(CheckInDevicesType, rhs.CheckInDevicesType).isEquals();
    }

}