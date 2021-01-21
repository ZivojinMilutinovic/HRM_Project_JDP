
package com.hrm.test.api.data.model.person_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class WeeklyReport implements Serializable
{

    @SerializedName("Date")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String Date;
    @SerializedName("DateName")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String DateName;
    @SerializedName("DailyHours")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Double DailyHours;
    @SerializedName("CheckinStatus")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String CheckinStatus;
    private final static long serialVersionUID = 639304337990845674L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeeklyReport() {
    }

    /**
     * 
     * @param Date
     * @param DateName
     * @param CheckinStatus
     * @param DailyHours
     */
    public WeeklyReport(String Date, String DateName, Double DailyHours, String CheckinStatus) {
        super();
        this.Date = Date;
        this.DateName = DateName;
        this.DailyHours = DailyHours;
        this.CheckinStatus = CheckinStatus;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDateName() {
        return DateName;
    }

    public void setDateName(String DateName) {
        this.DateName = DateName;
    }

    public Double getDailyHours() {
        return DailyHours;
    }

    public void setDailyHours(Double DailyHours) {
        this.DailyHours = DailyHours;
    }

    public String getCheckinStatus() {
        return CheckinStatus;
    }

    public void setCheckinStatus(String CheckinStatus) {
        this.CheckinStatus = CheckinStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Date", Date).append("DateName", DateName).append("DailyHours", DailyHours).append("CheckinStatus", CheckinStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Date).append(DateName).append(DailyHours).append(CheckinStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeeklyReport) == false) {
            return false;
        }
        WeeklyReport rhs = ((WeeklyReport) other);
        return new EqualsBuilder().append(Date, rhs.Date).append(DateName, rhs.DateName).append(DailyHours, rhs.DailyHours).append(CheckinStatus, rhs.CheckinStatus).isEquals();
    }

}
