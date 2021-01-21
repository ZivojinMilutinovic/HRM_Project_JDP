
package com.hrm.test.api.data.model.worklog_calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class PersonLoggingStatus implements Serializable
{

    @SerializedName("RecordId")
    @Expose
    private Integer RecordId;
    @SerializedName("LoginStatusId")
    @Expose
    private Integer loginStatusId;
    @SerializedName("StartTime")
    @Expose
    private String startTime;
    @SerializedName("EndTime")
    @Expose
    private String endTime;
    @SerializedName("CheckInType")
    @Expose
    private String checkInType;
    @SerializedName("CheckOutType")
    @Expose
    private String CheckOutType;
    @SerializedName("StatusLabel")
    @Expose
    private Object StatusLabel;
    @SerializedName("EventName")
    @Expose
    private Object eventName;
    @SerializedName("TotalTime")
    @Expose
    private Double TotalTime;
    @SerializedName("CellsArray")
    @Expose
    private List<CellsArray> CellsArray = null;
    @SerializedName("EventLocation")
    @Expose
    private Object EventLocation;
    @SerializedName("EventDescription")
    @Expose
    private Object eventDescription;
    @SerializedName("EventGuests")
    @Expose
    private Object EventGuests;
    @SerializedName("AdditionalInfo")
    @Expose
    private Object additionalInfo;
    @SerializedName("CheckInBranch")
    @Expose
    private Object CheckInBranch;
    @SerializedName("CheckOutBranch")
    @Expose
    private Object CheckOutBranch;
    private final static long serialVersionUID = -1722783116518466188L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersonLoggingStatus() {
    }

    /**
     * 
     * @param EventGuests
     * @param CellsArray
     * @param TotalTime
     * @param EventLocation
     * @param CheckInBranch
     * @param CheckOutType
     * @param StatusLabel
     * @param CheckOutBranch
     * @param RecordId
     * @param eventDescription
     * @param additionalInfo
     * @param eventName
     * @param loginStatusId
     * @param startTime
     * @param checkInType
     * @param endTime
     */
    public PersonLoggingStatus(Integer RecordId, Integer loginStatusId, String startTime, String endTime, String checkInType, String CheckOutType, Object StatusLabel, Object eventName, Double TotalTime, List<CellsArray> CellsArray, Object EventLocation, Object eventDescription, Object EventGuests, Object additionalInfo, Object CheckInBranch, Object CheckOutBranch) {
        super();
        this.RecordId = RecordId;
        this.loginStatusId = loginStatusId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkInType = checkInType;
        this.CheckOutType = CheckOutType;
        this.StatusLabel = StatusLabel;
        this.eventName = eventName;
        this.TotalTime = TotalTime;
        this.CellsArray = CellsArray;
        this.EventLocation = EventLocation;
        this.eventDescription = eventDescription;
        this.EventGuests = EventGuests;
        this.additionalInfo = additionalInfo;
        this.CheckInBranch = CheckInBranch;
        this.CheckOutBranch = CheckOutBranch;
    }

    public Integer getRecordId() {
        return RecordId;
    }

    public void setRecordId(Integer RecordId) {
        this.RecordId = RecordId;
    }

    public Integer getLoginStatusId() {
        return loginStatusId;
    }

    public void setLoginStatusId(Integer loginStatusId) {
        this.loginStatusId = loginStatusId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCheckInType() {
        return checkInType;
    }

    public void setCheckInType(String checkInType) {
        this.checkInType = checkInType;
    }

    public String getCheckOutType() {
        return CheckOutType;
    }

    public void setCheckOutType(String CheckOutType) {
        this.CheckOutType = CheckOutType;
    }

    public Object getStatusLabel() {
        return StatusLabel;
    }

    public void setStatusLabel(Object StatusLabel) {
        this.StatusLabel = StatusLabel;
    }

    public Object getEventName() {
        return eventName;
    }

    public void setEventName(Object eventName) {
        this.eventName = eventName;
    }

    public Double getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(Double TotalTime) {
        this.TotalTime = TotalTime;
    }

    public List<CellsArray> getCellsArray() {
        return CellsArray;
    }

    public void setCellsArray(List<CellsArray> CellsArray) {
        this.CellsArray = CellsArray;
    }

    public Object getEventLocation() {
        return EventLocation;
    }

    public void setEventLocation(Object EventLocation) {
        this.EventLocation = EventLocation;
    }

    public Object getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(Object eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Object getEventGuests() {
        return EventGuests;
    }

    public void setEventGuests(Object EventGuests) {
        this.EventGuests = EventGuests;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Object getCheckInBranch() {
        return CheckInBranch;
    }

    public void setCheckInBranch(Object CheckInBranch) {
        this.CheckInBranch = CheckInBranch;
    }

    public Object getCheckOutBranch() {
        return CheckOutBranch;
    }

    public void setCheckOutBranch(Object CheckOutBranch) {
        this.CheckOutBranch = CheckOutBranch;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("RecordId", RecordId).append("loginStatusId", loginStatusId).append("startTime", startTime).append("endTime", endTime).append("checkInType", checkInType).append("CheckOutType", CheckOutType).append("StatusLabel", StatusLabel).append("eventName", eventName).append("TotalTime", TotalTime).append("CellsArray", CellsArray).append("EventLocation", EventLocation).append("eventDescription", eventDescription).append("EventGuests", EventGuests).append("additionalInfo", additionalInfo).append("CheckInBranch", CheckInBranch).append("CheckOutBranch", CheckOutBranch).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(EventGuests).append(CellsArray).append(TotalTime).append(EventLocation).append(CheckInBranch).append(CheckOutType).append(StatusLabel).append(CheckOutBranch).append(RecordId).append(eventDescription).append(additionalInfo).append(eventName).append(loginStatusId).append(startTime).append(checkInType).append(endTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonLoggingStatus) == false) {
            return false;
        }
        PersonLoggingStatus rhs = ((PersonLoggingStatus) other);
        return new EqualsBuilder().append(EventGuests, rhs.EventGuests).append(CellsArray, rhs.CellsArray).append(TotalTime, rhs.TotalTime).append(EventLocation, rhs.EventLocation).append(CheckInBranch, rhs.CheckInBranch).append(CheckOutType, rhs.CheckOutType).append(StatusLabel, rhs.StatusLabel).append(CheckOutBranch, rhs.CheckOutBranch).append(RecordId, rhs.RecordId).append(eventDescription, rhs.eventDescription).append(additionalInfo, rhs.additionalInfo).append(eventName, rhs.eventName).append(loginStatusId, rhs.loginStatusId).append(startTime, rhs.startTime).append(checkInType, rhs.checkInType).append(endTime, rhs.endTime).isEquals();
    }

}
