
package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class WorklogStatusResponse implements Serializable
{

    @SerializedName("CurrentLoginStatusId")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer CurrentLoginStatusId;
    @SerializedName("AvailableLoginStatusIds")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Integer> AvailableLoginStatusIds = null;
    private final static long serialVersionUID = -7111294369766753166L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorklogStatusResponse() {
    }

    /**
     * 
     * @param CurrentLoginStatusId
     * @param AvailableLoginStatusIds
     */
    public WorklogStatusResponse(Integer CurrentLoginStatusId, List<Integer> AvailableLoginStatusIds) {
        super();
        this.CurrentLoginStatusId = CurrentLoginStatusId;
        this.AvailableLoginStatusIds = AvailableLoginStatusIds;
    }

    public Integer getCurrentLoginStatusId() {
        return CurrentLoginStatusId;
    }

    public void setCurrentLoginStatusId(Integer CurrentLoginStatusId) {
        this.CurrentLoginStatusId = CurrentLoginStatusId;
    }

    public List<Integer> getAvailableLoginStatusIds() {
        return AvailableLoginStatusIds;
    }

    public void setAvailableLoginStatusIds(List<Integer> AvailableLoginStatusIds) {
        this.AvailableLoginStatusIds = AvailableLoginStatusIds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("CurrentLoginStatusId", CurrentLoginStatusId).append("AvailableLoginStatusIds", AvailableLoginStatusIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CurrentLoginStatusId).append(AvailableLoginStatusIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorklogStatusResponse) == false) {
            return false;
        }
        WorklogStatusResponse rhs = ((WorklogStatusResponse) other);
        return new EqualsBuilder().append(CurrentLoginStatusId, rhs.CurrentLoginStatusId).append(AvailableLoginStatusIds, rhs.AvailableLoginStatusIds).isEquals();
    }

}
