package com.hrm.test.api.data.model.person_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class PersonStatisticsParamsResponse extends ErrorResponse implements Serializable
{

    @SerializedName("TotalWorkingHoursSum")
    @Expose
    private Double TotalWorkingHoursSum;
    @SerializedName("DailyAvgHours")
    @Expose
    private Double DailyAvgHours;
    @SerializedName("WorkingDaysCount")
    @Expose
    private Integer WorkingDaysCount;
    @SerializedName("MonthlyAvgHours")
    @Expose
    private Double MonthlyAvgHours;
    @SerializedName("WorkingMonthsCount")
    @Expose
    private Integer WorkingMonthsCount;
    @SerializedName("WeeklyAvgHours")
    @Expose
    private Double WeeklyAvgHours;
    @SerializedName("WorkingWeeksCount")
    @Expose
    private Integer WorkingWeeksCount;
    @SerializedName("BreakAvgTime")
    @Expose
    private Double BreakAvgTime;
    @SerializedName("MonthsWorkingHoursSum")
    @Expose
    private Double MonthsWorkingHoursSum;
    @SerializedName("WeeksWorkingHoursSum")
    @Expose
    private Double WeeksWorkingHoursSum;
    @SerializedName("CurrentWeekHours")
    @Expose
    private Double CurrentWeekHours;
    @SerializedName("CurrentMonthHours")
    @Expose
    private Double CurrentMonthHours;
    @SerializedName("CurrentDayHours")
    @Expose
    private Double CurrentDayHours;
    private final static long serialVersionUID = 1895407364905300217L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PersonStatisticsParamsResponse() {
    }

    /**
     *
     * @param BreakAvgTime
     * @param WeeksWorkingHoursSum
     * @param CurrentDayHours
     * @param DailyAvgHours
     * @param WorkingMonthsCount
     * @param MonthsWorkingHoursSum
     * @param TotalWorkingHoursSum
     * @param MonthlyAvgHours
     * @param WeeklyAvgHours
     * @param WorkingWeeksCount
     * @param CurrentWeekHours
     * @param WorkingDaysCount
     * @param CurrentMonthHours
     */
    public PersonStatisticsParamsResponse(Double TotalWorkingHoursSum, Double DailyAvgHours, Integer WorkingDaysCount, Double MonthlyAvgHours, Integer WorkingMonthsCount, Double WeeklyAvgHours, Integer WorkingWeeksCount, Double BreakAvgTime, Double MonthsWorkingHoursSum, Double WeeksWorkingHoursSum, Double CurrentWeekHours, Double CurrentMonthHours, Double CurrentDayHours) {
        super();
        this.TotalWorkingHoursSum = TotalWorkingHoursSum;
        this.DailyAvgHours = DailyAvgHours;
        this.WorkingDaysCount = WorkingDaysCount;
        this.MonthlyAvgHours = MonthlyAvgHours;
        this.WorkingMonthsCount = WorkingMonthsCount;
        this.WeeklyAvgHours = WeeklyAvgHours;
        this.WorkingWeeksCount = WorkingWeeksCount;
        this.BreakAvgTime = BreakAvgTime;
        this.MonthsWorkingHoursSum = MonthsWorkingHoursSum;
        this.WeeksWorkingHoursSum = WeeksWorkingHoursSum;
        this.CurrentWeekHours = CurrentWeekHours;
        this.CurrentMonthHours = CurrentMonthHours;
        this.CurrentDayHours = CurrentDayHours;
    }

    public Double getTotalWorkingHoursSum() {
        return TotalWorkingHoursSum;
    }

    public void setTotalWorkingHoursSum(Double TotalWorkingHoursSum) {
        this.TotalWorkingHoursSum = TotalWorkingHoursSum;
    }

    public Double getDailyAvgHours() {
        return DailyAvgHours;
    }

    public void setDailyAvgHours(Double DailyAvgHours) {
        this.DailyAvgHours = DailyAvgHours;
    }

    public Integer getWorkingDaysCount() {
        return WorkingDaysCount;
    }

    public void setWorkingDaysCount(Integer WorkingDaysCount) {
        this.WorkingDaysCount = WorkingDaysCount;
    }

    public Double getMonthlyAvgHours() {
        return MonthlyAvgHours;
    }

    public void setMonthlyAvgHours(Double MonthlyAvgHours) {
        this.MonthlyAvgHours = MonthlyAvgHours;
    }

    public Integer getWorkingMonthsCount() {
        return WorkingMonthsCount;
    }

    public void setWorkingMonthsCount(Integer WorkingMonthsCount) {
        this.WorkingMonthsCount = WorkingMonthsCount;
    }

    public Double getWeeklyAvgHours() {
        return WeeklyAvgHours;
    }

    public void setWeeklyAvgHours(Double WeeklyAvgHours) {
        this.WeeklyAvgHours = WeeklyAvgHours;
    }

    public Integer getWorkingWeeksCount() {
        return WorkingWeeksCount;
    }

    public void setWorkingWeeksCount(Integer WorkingWeeksCount) {
        this.WorkingWeeksCount = WorkingWeeksCount;
    }

    public Double getBreakAvgTime() {
        return BreakAvgTime;
    }

    public void setBreakAvgTime(Double BreakAvgTime) {
        this.BreakAvgTime = BreakAvgTime;
    }

    public Double getMonthsWorkingHoursSum() {
        return MonthsWorkingHoursSum;
    }

    public void setMonthsWorkingHoursSum(Double MonthsWorkingHoursSum) {
        this.MonthsWorkingHoursSum = MonthsWorkingHoursSum;
    }

    public Double getWeeksWorkingHoursSum() {
        return WeeksWorkingHoursSum;
    }

    public void setWeeksWorkingHoursSum(Double WeeksWorkingHoursSum) {
        this.WeeksWorkingHoursSum = WeeksWorkingHoursSum;
    }

    public Double getCurrentWeekHours() {
        return CurrentWeekHours;
    }

    public void setCurrentWeekHours(Double CurrentWeekHours) {
        this.CurrentWeekHours = CurrentWeekHours;
    }

    public Double getCurrentMonthHours() {
        return CurrentMonthHours;
    }

    public void setCurrentMonthHours(Double CurrentMonthHours) {
        this.CurrentMonthHours = CurrentMonthHours;
    }

    public Double getCurrentDayHours() {
        return CurrentDayHours;
    }

    public void setCurrentDayHours(Double CurrentDayHours) {
        this.CurrentDayHours = CurrentDayHours;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("TotalWorkingHoursSum", TotalWorkingHoursSum).append("DailyAvgHours", DailyAvgHours).append("WorkingDaysCount", WorkingDaysCount).append("MonthlyAvgHours", MonthlyAvgHours).append("WorkingMonthsCount", WorkingMonthsCount).append("WeeklyAvgHours", WeeklyAvgHours).append("WorkingWeeksCount", WorkingWeeksCount).append("BreakAvgTime", BreakAvgTime).append("MonthsWorkingHoursSum", MonthsWorkingHoursSum).append("WeeksWorkingHoursSum", WeeksWorkingHoursSum).append("CurrentWeekHours", CurrentWeekHours).append("CurrentMonthHours", CurrentMonthHours).append("CurrentDayHours", CurrentDayHours).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BreakAvgTime).append(WeeksWorkingHoursSum).append(CurrentDayHours).append(DailyAvgHours).append(WorkingMonthsCount).append(MonthsWorkingHoursSum).append(TotalWorkingHoursSum).append(MonthlyAvgHours).append(WeeklyAvgHours).append(WorkingWeeksCount).append(CurrentWeekHours).append(WorkingDaysCount).append(CurrentMonthHours).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonStatisticsParamsResponse) == false) {
            return false;
        }
        PersonStatisticsParamsResponse rhs = ((PersonStatisticsParamsResponse) other);
        return new EqualsBuilder().append(BreakAvgTime, rhs.BreakAvgTime).append(WeeksWorkingHoursSum, rhs.WeeksWorkingHoursSum).append(CurrentDayHours, rhs.CurrentDayHours).append(DailyAvgHours, rhs.DailyAvgHours).append(WorkingMonthsCount, rhs.WorkingMonthsCount).append(MonthsWorkingHoursSum, rhs.MonthsWorkingHoursSum).append(TotalWorkingHoursSum, rhs.TotalWorkingHoursSum).append(MonthlyAvgHours, rhs.MonthlyAvgHours).append(WeeklyAvgHours, rhs.WeeklyAvgHours).append(WorkingWeeksCount, rhs.WorkingWeeksCount).append(CurrentWeekHours, rhs.CurrentWeekHours).append(WorkingDaysCount, rhs.WorkingDaysCount).append(CurrentMonthHours, rhs.CurrentMonthHours).isEquals();
    }

}