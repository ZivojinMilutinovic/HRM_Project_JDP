
package com.hrm.test.api.data.model.worklog_calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class WorkLogCalendarResponse implements Serializable
{

    @SerializedName("ID")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer ID;
    @SerializedName("FirstName")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String FirstName;
    @SerializedName("LastName")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String LastName;
    @SerializedName("Gender")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String Gender;
    @SerializedName("TotalHours")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer TotalHours;
    @SerializedName("TotalMinutes")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer TotalMinutes;
    @SerializedName("ImagesUrls")
    @ResponseRequiredField(canBeEmpty =true)
    @Expose
    private ImagesUrls ImagesUrls;
    @SerializedName("RotateImage")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private Integer RotateImage;
    @SerializedName("Positions")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Position> Positions = null;
    @SerializedName("EmploymentId")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer EmploymentId;
    @SerializedName("PersonLoggingStatuses")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<PersonLoggingStatus> PersonLoggingStatuses = null;
    @SerializedName("UssualWorkingTime")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String UssualWorkingTime;
    @SerializedName("DaySatatus")
    @Expose
    private String DaySatatus;
    @SerializedName("LeaveDayType")
    @Expose
    private String LeaveDayType;
    @SerializedName("LeaveDayTypeEnum")
    @Expose
    private String LeaveDayTypeEnum;
    @SerializedName("EmployeeStatus")
    @Expose
    private Integer EmployeeStatus;
    private final static long serialVersionUID = 9132045404153877721L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorkLogCalendarResponse() {
    }

    /**
     * 
     * @param LastName
     * @param Gender
     * @param TotalHours
     * @param RotateImage
     * @param EmploymentId
     * @param Positions
     * @param EmployeeStatus
     * @param LeaveDayTypeEnum
     * @param ImagesUrls
     * @param FirstName
     * @param PersonLoggingStatuses
     * @param DaySatatus
     * @param TotalMinutes
     * @param ID
     * @param UssualWorkingTime
     * @param LeaveDayType
     */
    public WorkLogCalendarResponse(Integer ID, String FirstName, String LastName, String Gender, Integer TotalHours, Integer TotalMinutes, ImagesUrls ImagesUrls, Integer RotateImage, List<Position> Positions, Integer EmploymentId, List<PersonLoggingStatus> PersonLoggingStatuses, String UssualWorkingTime, String DaySatatus, String LeaveDayType, String LeaveDayTypeEnum, Integer EmployeeStatus) {
        super();
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.TotalHours = TotalHours;
        this.TotalMinutes = TotalMinutes;
        this.ImagesUrls = ImagesUrls;
        this.RotateImage = RotateImage;
        this.Positions = Positions;
        this.EmploymentId = EmploymentId;
        this.PersonLoggingStatuses = PersonLoggingStatuses;
        this.UssualWorkingTime = UssualWorkingTime;
        this.DaySatatus = DaySatatus;
        this.LeaveDayType = LeaveDayType;
        this.LeaveDayTypeEnum = LeaveDayTypeEnum;
        this.EmployeeStatus = EmployeeStatus;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Integer getTotalHours() {
        return TotalHours;
    }

    public void setTotalHours(Integer TotalHours) {
        this.TotalHours = TotalHours;
    }

    public Integer getTotalMinutes() {
        return TotalMinutes;
    }

    public void setTotalMinutes(Integer TotalMinutes) {
        this.TotalMinutes = TotalMinutes;
    }

    public ImagesUrls getImagesUrls() {
        return ImagesUrls;
    }

    public void setImagesUrls(ImagesUrls ImagesUrls) {
        this.ImagesUrls = ImagesUrls;
    }

    public Integer getRotateImage() {
        return RotateImage;
    }

    public void setRotateImage(Integer RotateImage) {
        this.RotateImage = RotateImage;
    }

    public List<Position> getPositions() {
        return Positions;
    }

    public void setPositions(List<Position> Positions) {
        this.Positions = Positions;
    }

    public Integer getEmploymentId() {
        return EmploymentId;
    }

    public void setEmploymentId(Integer EmploymentId) {
        this.EmploymentId = EmploymentId;
    }

    public List<PersonLoggingStatus> getPersonLoggingStatuses() {
        return PersonLoggingStatuses;
    }

    public void setPersonLoggingStatuses(List<PersonLoggingStatus> PersonLoggingStatuses) {
        this.PersonLoggingStatuses = PersonLoggingStatuses;
    }

    public String getUssualWorkingTime() {
        return UssualWorkingTime;
    }

    public void setUssualWorkingTime(String UssualWorkingTime) {
        this.UssualWorkingTime = UssualWorkingTime;
    }

    public String getDaySatatus() {
        return DaySatatus;
    }

    public void setDaySatatus(String DaySatatus) {
        this.DaySatatus = DaySatatus;
    }

    public String getLeaveDayType() {
        return LeaveDayType;
    }

    public void setLeaveDayType(String LeaveDayType) {
        this.LeaveDayType = LeaveDayType;
    }

    public String getLeaveDayTypeEnum() {
        return LeaveDayTypeEnum;
    }

    public void setLeaveDayTypeEnum(String LeaveDayTypeEnum) {
        this.LeaveDayTypeEnum = LeaveDayTypeEnum;
    }

    public Integer getEmployeeStatus() {
        return EmployeeStatus;
    }

    public void setEmployeeStatus(Integer EmployeeStatus) {
        this.EmployeeStatus = EmployeeStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ID", ID).append("FirstName", FirstName).append("LastName", LastName).append("Gender", Gender).append("TotalHours", TotalHours).append("TotalMinutes", TotalMinutes).append("ImagesUrls", ImagesUrls).append("RotateImage", RotateImage).append("Positions", Positions).append("EmploymentId", EmploymentId).append("PersonLoggingStatuses", PersonLoggingStatuses).append("UssualWorkingTime", UssualWorkingTime).append("DaySatatus", DaySatatus).append("LeaveDayType", LeaveDayType).append("LeaveDayTypeEnum", LeaveDayTypeEnum).append("EmployeeStatus", EmployeeStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(LastName).append(Gender).append(TotalHours).append(RotateImage).append(EmploymentId).append(Positions).append(EmployeeStatus).append(LeaveDayTypeEnum).append(ImagesUrls).append(FirstName).append(PersonLoggingStatuses).append(DaySatatus).append(TotalMinutes).append(ID).append(UssualWorkingTime).append(LeaveDayType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkLogCalendarResponse) == false) {
            return false;
        }
        WorkLogCalendarResponse rhs = ((WorkLogCalendarResponse) other);
        return new EqualsBuilder().append(LastName, rhs.LastName).append(Gender, rhs.Gender).append(TotalHours, rhs.TotalHours).append(RotateImage, rhs.RotateImage).append(EmploymentId, rhs.EmploymentId).append(Positions, rhs.Positions).append(EmployeeStatus, rhs.EmployeeStatus).append(LeaveDayTypeEnum, rhs.LeaveDayTypeEnum).append(ImagesUrls, rhs.ImagesUrls).append(FirstName, rhs.FirstName).append(PersonLoggingStatuses, rhs.PersonLoggingStatuses).append(DaySatatus, rhs.DaySatatus).append(TotalMinutes, rhs.TotalMinutes).append(ID, rhs.ID).append(UssualWorkingTime, rhs.UssualWorkingTime).append(LeaveDayType, rhs.LeaveDayType).isEquals();
    }

}
