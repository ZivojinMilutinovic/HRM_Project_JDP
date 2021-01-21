package com.hrm.test.api.data.model.work_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class TotalWorkStatisticsResponse extends ErrorResponse implements Serializable
{

    @SerializedName("TotalWorkHours")
    @Expose
    private String TotalWorkHours;
    @SerializedName("TotalWorkDays")
    @Expose
    private Integer TotalWorkDays;
    @SerializedName("AverageDailyWorkHours")
    @Expose
    private String AverageDailyWorkHours;
    private final static long serialVersionUID = -3318168368738079639L;

    /**
     * No args constructor for use in serialization
     *
     */
    public TotalWorkStatisticsResponse() {
    }

    /**
     *
     * @param TotalWorkDays
     * @param TotalWorkHours
     * @param AverageDailyWorkHours
     */
    public TotalWorkStatisticsResponse(String TotalWorkHours, Integer TotalWorkDays, String AverageDailyWorkHours) {
        super();
        this.TotalWorkHours = TotalWorkHours;
        this.TotalWorkDays = TotalWorkDays;
        this.AverageDailyWorkHours = AverageDailyWorkHours;
    }

    public String getTotalWorkHours() {
        return TotalWorkHours;
    }

    public void setTotalWorkHours(String TotalWorkHours) {
        this.TotalWorkHours = TotalWorkHours;
    }

    public Integer getTotalWorkDays() {
        return TotalWorkDays;
    }

    public void setTotalWorkDays(Integer TotalWorkDays) {
        this.TotalWorkDays = TotalWorkDays;
    }

    public String getAverageDailyWorkHours() {
        return AverageDailyWorkHours;
    }

    public void setAverageDailyWorkHours(String AverageDailyWorkHours) {
        this.AverageDailyWorkHours = AverageDailyWorkHours;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("TotalWorkHours", TotalWorkHours).append("TotalWorkDays", TotalWorkDays).append("AverageDailyWorkHours", AverageDailyWorkHours).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TotalWorkDays).append(TotalWorkHours).append(AverageDailyWorkHours).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalWorkStatisticsResponse) == false) {
            return false;
        }
        TotalWorkStatisticsResponse rhs = ((TotalWorkStatisticsResponse) other);
        return new EqualsBuilder().append(TotalWorkDays, rhs.TotalWorkDays).append(TotalWorkHours, rhs.TotalWorkHours).append(AverageDailyWorkHours, rhs.AverageDailyWorkHours).isEquals();
    }

}