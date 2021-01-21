package com.hrm.test.api.data.model.work_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class WorkStatisticsResponse extends ErrorResponse implements Serializable
{

    @SerializedName("Date")
    @Expose
    private String Date;
    @SerializedName("MonthWorkHourSum")
    @Expose
    private String MonthWorkHourSum;
    @SerializedName("WeekWorkHourSum")
    @Expose
    private String WeekWorkHourSum;
    @SerializedName("DayWorkHourSum")
    @Expose
    private String DayWorkHourSum;
    @SerializedName("WeekAverageWorkHours")
    @Expose
    private String WeekAverageWorkHours;
    @SerializedName("WeekAverageWorkHoursNum")
    @Expose
    private Double WeekAverageWorkHoursNum;
    private final static long serialVersionUID = -2453263329049458607L;

    /**
     * No args constructor for use in serialization
     *
     */
    public WorkStatisticsResponse() {
    }

    /**
     *
     * @param Date
     * @param WeekAverageWorkHours
     * @param MonthWorkHourSum
     * @param WeekWorkHourSum
     * @param DayWorkHourSum
     * @param WeekAverageWorkHoursNum
     */
    public WorkStatisticsResponse(String Date, String MonthWorkHourSum, String WeekWorkHourSum, String DayWorkHourSum, String WeekAverageWorkHours, Double WeekAverageWorkHoursNum) {
        super();
        this.Date = Date;
        this.MonthWorkHourSum = MonthWorkHourSum;
        this.WeekWorkHourSum = WeekWorkHourSum;
        this.DayWorkHourSum = DayWorkHourSum;
        this.WeekAverageWorkHours = WeekAverageWorkHours;
        this.WeekAverageWorkHoursNum = WeekAverageWorkHoursNum;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getMonthWorkHourSum() {
        return MonthWorkHourSum;
    }

    public void setMonthWorkHourSum(String MonthWorkHourSum) {
        this.MonthWorkHourSum = MonthWorkHourSum;
    }

    public String getWeekWorkHourSum() {
        return WeekWorkHourSum;
    }

    public void setWeekWorkHourSum(String WeekWorkHourSum) {
        this.WeekWorkHourSum = WeekWorkHourSum;
    }

    public String getDayWorkHourSum() {
        return DayWorkHourSum;
    }

    public void setDayWorkHourSum(String DayWorkHourSum) {
        this.DayWorkHourSum = DayWorkHourSum;
    }

    public String getWeekAverageWorkHours() {
        return WeekAverageWorkHours;
    }

    public void setWeekAverageWorkHours(String WeekAverageWorkHours) {
        this.WeekAverageWorkHours = WeekAverageWorkHours;
    }

    public Double getWeekAverageWorkHoursNum() {
        return WeekAverageWorkHoursNum;
    }

    public void setWeekAverageWorkHoursNum(Double WeekAverageWorkHoursNum) {
        this.WeekAverageWorkHoursNum = WeekAverageWorkHoursNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Date", Date).append("MonthWorkHourSum", MonthWorkHourSum).append("WeekWorkHourSum", WeekWorkHourSum).append("DayWorkHourSum", DayWorkHourSum).append("WeekAverageWorkHours", WeekAverageWorkHours).append("WeekAverageWorkHoursNum", WeekAverageWorkHoursNum).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Date).append(WeekAverageWorkHours).append(MonthWorkHourSum).append(WeekWorkHourSum).append(DayWorkHourSum).append(WeekAverageWorkHoursNum).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkStatisticsResponse) == false) {
            return false;
        }
        WorkStatisticsResponse rhs = ((WorkStatisticsResponse) other);
        return new EqualsBuilder().append(Date, rhs.Date).append(WeekAverageWorkHours, rhs.WeekAverageWorkHours).append(MonthWorkHourSum, rhs.MonthWorkHourSum).append(WeekWorkHourSum, rhs.WeekWorkHourSum).append(DayWorkHourSum, rhs.DayWorkHourSum).append(WeekAverageWorkHoursNum, rhs.WeekAverageWorkHoursNum).isEquals();
    }

}
