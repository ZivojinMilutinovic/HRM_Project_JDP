
package com.hrm.test.api.data.model.person_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class PersonStatisticsResponse extends ErrorResponse implements Serializable
{

    @SerializedName("WeeklyReport")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<WeeklyReport> WeeklyReport = null;
    @SerializedName("WeeklyAvgHours")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Double WeeklyAvgHours;
    @SerializedName("WeeklyDivider")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Double WeeklyDivider;
    private final static long serialVersionUID = -6624331270281873406L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersonStatisticsResponse() {
    }

    /**
     * 
     * @param WeeklyReport
     * @param WeeklyDivider
     * @param WeeklyAvgHours
     */
    public PersonStatisticsResponse(List<WeeklyReport> WeeklyReport, Double WeeklyAvgHours, Double WeeklyDivider) {
        super();
        this.WeeklyReport = WeeklyReport;
        this.WeeklyAvgHours = WeeklyAvgHours;
        this.WeeklyDivider = WeeklyDivider;
    }

    public List<WeeklyReport> getWeeklyReport() {
        return WeeklyReport;
    }

    public void setWeeklyReport(List<WeeklyReport> WeeklyReport) {
        this.WeeklyReport = WeeklyReport;
    }

    public Double getWeeklyAvgHours() {
        return WeeklyAvgHours;
    }

    public void setWeeklyAvgHours(Double WeeklyAvgHours) {
        this.WeeklyAvgHours = WeeklyAvgHours;
    }

    public Double getWeeklyDivider() {
        return WeeklyDivider;
    }

    public void setWeeklyDivider(Double WeeklyDivider) {
        this.WeeklyDivider = WeeklyDivider;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("WeeklyReport", WeeklyReport).append("WeeklyAvgHours", WeeklyAvgHours).append("WeeklyDivider", WeeklyDivider).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(WeeklyReport).append(WeeklyAvgHours).append(WeeklyDivider).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonStatisticsResponse) == false) {
            return false;
        }
        PersonStatisticsResponse rhs = ((PersonStatisticsResponse) other);
        return new EqualsBuilder().append(WeeklyReport, rhs.WeeklyReport).append(WeeklyAvgHours, rhs.WeeklyAvgHours).append(WeeklyDivider, rhs.WeeklyDivider).isEquals();
    }

}
