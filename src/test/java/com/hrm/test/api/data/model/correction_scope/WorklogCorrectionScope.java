package com.hrm.test.api.data.model.correction_scope;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class WorklogCorrectionScope implements Serializable
{

    @SerializedName("StartTime")
    @Expose
    private String StartTime;
    @SerializedName("EndTime")
    @Expose
    private String EndTime;
    @SerializedName("TotalHours")
    @Expose
    private Double TotalHours;
    private final static long serialVersionUID = -5349813744866152086L;

    /**
     * No args constructor for use in serialization
     *
     */
    public WorklogCorrectionScope() {
    }

    /**
     *
     * @param TotalHours
     * @param StartTime
     * @param EndTime
     */
    public WorklogCorrectionScope(String StartTime, String EndTime, Double TotalHours) {
        super();
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.TotalHours = TotalHours;
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

    public Double getTotalHours() {
        return TotalHours;
    }

    public void setTotalHours(Double TotalHours) {
        this.TotalHours = TotalHours;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("StartTime", StartTime).append("EndTime", EndTime).append("TotalHours", TotalHours).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(StartTime).append(EndTime).append(TotalHours).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorklogCorrectionScope) == false) {
            return false;
        }
        WorklogCorrectionScope rhs = ((WorklogCorrectionScope) other);
        return new EqualsBuilder().append(StartTime, rhs.StartTime).append(EndTime, rhs.EndTime).append(TotalHours, rhs.TotalHours).isEquals();
    }

}