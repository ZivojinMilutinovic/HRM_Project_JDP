
package com.hrm.test.api.data.model.porfile_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class BasicInfo implements Serializable
{

    @SerializedName("LoggingStatusId")
    @Expose
    private Integer LoggingStatusId;
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;
    @SerializedName("EmploymentId")
    @Expose
    private Integer EmploymentId;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Gender")
    @Expose
    private String Gender;
    @SerializedName("EmailHTEC")
    @Expose
    private String EmailHTEC;
    @SerializedName("SkypeName")
    @Expose
    private Object SkypeName;
    @SerializedName("PhoneNumber")
    @Expose
    private Object PhoneNumber;
    @SerializedName("ImageUrl")
    @Expose
    private Object ImageUrl;
    @SerializedName("Branch")
    @Expose
    private String Branch;
    @SerializedName("EmployeeStatus")
    @Expose
    private Integer EmployeeStatus;
    @SerializedName("Positions")
    @Expose
    private List<Position> Positions = null;
    private final static long serialVersionUID = 7322139043859390062L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BasicInfo() {
    }

    /**
     * 
     * @param SkypeName
     * @param PhoneNumber
     * @param Gender
     * @param ImageUrl
     * @param Name
     * @param LoggingStatusId
     * @param EmploymentId
     * @param PersonId
     * @param Positions
     * @param EmailHTEC
     * @param Branch
     * @param EmployeeStatus
     */
    public BasicInfo(Integer LoggingStatusId, Integer PersonId, Integer EmploymentId, String Name, String Gender, String EmailHTEC, Object SkypeName, Object PhoneNumber, Object ImageUrl, String Branch, Integer EmployeeStatus, List<Position> Positions) {
        super();
        this.LoggingStatusId = LoggingStatusId;
        this.PersonId = PersonId;
        this.EmploymentId = EmploymentId;
        this.Name = Name;
        this.Gender = Gender;
        this.EmailHTEC = EmailHTEC;
        this.SkypeName = SkypeName;
        this.PhoneNumber = PhoneNumber;
        this.ImageUrl = ImageUrl;
        this.Branch = Branch;
        this.EmployeeStatus = EmployeeStatus;
        this.Positions = Positions;
    }

    public Integer getLoggingStatusId() {
        return LoggingStatusId;
    }

    public void setLoggingStatusId(Integer LoggingStatusId) {
        this.LoggingStatusId = LoggingStatusId;
    }

    public Integer getPersonId() {
        return PersonId;
    }

    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    public Integer getEmploymentId() {
        return EmploymentId;
    }

    public void setEmploymentId(Integer EmploymentId) {
        this.EmploymentId = EmploymentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmailHTEC() {
        return EmailHTEC;
    }

    public void setEmailHTEC(String EmailHTEC) {
        this.EmailHTEC = EmailHTEC;
    }

    public Object getSkypeName() {
        return SkypeName;
    }

    public void setSkypeName(Object SkypeName) {
        this.SkypeName = SkypeName;
    }

    public Object getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Object PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public Object getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(Object ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public Integer getEmployeeStatus() {
        return EmployeeStatus;
    }

    public void setEmployeeStatus(Integer EmployeeStatus) {
        this.EmployeeStatus = EmployeeStatus;
    }

    public List<Position> getPositions() {
        return Positions;
    }

    public void setPositions(List<Position> Positions) {
        this.Positions = Positions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("LoggingStatusId", LoggingStatusId).append("PersonId", PersonId).append("EmploymentId", EmploymentId).append("Name", Name).append("Gender", Gender).append("EmailHTEC", EmailHTEC).append("SkypeName", SkypeName).append("PhoneNumber", PhoneNumber).append("ImageUrl", ImageUrl).append("Branch", Branch).append("EmployeeStatus", EmployeeStatus).append("Positions", Positions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SkypeName).append(Gender).append(LoggingStatusId).append(EmploymentId).append(Positions).append(Branch).append(EmployeeStatus).append(PhoneNumber).append(ImageUrl).append(Name).append(PersonId).append(EmailHTEC).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicInfo) == false) {
            return false;
        }
        BasicInfo rhs = ((BasicInfo) other);
        return new EqualsBuilder().append(SkypeName, rhs.SkypeName).append(Gender, rhs.Gender).append(LoggingStatusId, rhs.LoggingStatusId).append(EmploymentId, rhs.EmploymentId).append(Positions, rhs.Positions).append(Branch, rhs.Branch).append(EmployeeStatus, rhs.EmployeeStatus).append(PhoneNumber, rhs.PhoneNumber).append(ImageUrl, rhs.ImageUrl).append(Name, rhs.Name).append(PersonId, rhs.PersonId).append(EmailHTEC, rhs.EmailHTEC).isEquals();
    }

}
