
package com.hrm.test.api.data.model.check_reminder_for_today;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class CheckReminders implements Serializable
{

    @SerializedName("CheckInType")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String CheckInType;
    @SerializedName("CheckOutType")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private String CheckOutType;
    @SerializedName("Id")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer Id;
    @SerializedName("LoginStatus")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String LoginStatus;
    @SerializedName("StartTime")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String StartTime;
    @SerializedName("EndTime")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private String EndTime;
    @SerializedName("StatusLabel")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private String StatusLabel;
    private final static long serialVersionUID = 4749341827081616731L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CheckReminders() {
    }

    /**
     * 
     * @param CheckOutType
     * @param CheckInType
     * @param StartTime
     * @param Id
     * @param EndTime
     * @param LoginStatus
     * @param StatusLabel
     */
    public CheckReminders(String CheckInType, String CheckOutType, Integer Id, String LoginStatus, String StartTime, String EndTime, String StatusLabel) {
        super();
        this.CheckInType = CheckInType;
        this.CheckOutType = CheckOutType;
        this.Id = Id;
        this.LoginStatus = LoginStatus;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.StatusLabel = StatusLabel;
    }

    public String getCheckInType() {
        return CheckInType;
    }

    public void setCheckInType(String CheckInType) {
        this.CheckInType = CheckInType;
    }

    public String getCheckOutType() {
        return CheckOutType;
    }

    public void setCheckOutType(String CheckOutType) {
        this.CheckOutType = CheckOutType;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getLoginStatus() {
        return LoginStatus;
    }

    public void setLoginStatus(String LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getStatusLabel() {
        return StatusLabel;
    }

    public void setStatusLabel(String StatusLabel) {
        this.StatusLabel = StatusLabel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("CheckInType", CheckInType).append("CheckOutType", CheckOutType).append("Id", Id).append("LoginStatus", LoginStatus).append("StartTime", StartTime).append("EndTime", EndTime).append("StatusLabel", StatusLabel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CheckOutType).append(CheckInType).append(StartTime).append(Id).append(EndTime).append(LoginStatus).append(StatusLabel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckReminders) == false) {
            return true;
        }
        CheckReminders rhs = ((CheckReminders) other);
        return new EqualsBuilder().append(CheckOutType, rhs.CheckOutType).append(CheckInType, rhs.CheckInType).append(StartTime, rhs.StartTime).append(Id, rhs.Id).append(EndTime, rhs.EndTime).append(LoginStatus, rhs.LoginStatus).append(StatusLabel, rhs.StatusLabel).isEquals();
    }

}
