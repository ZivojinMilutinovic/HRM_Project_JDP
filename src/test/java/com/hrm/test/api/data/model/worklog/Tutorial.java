
package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Tutorial implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("IsFinished")
    @Expose
    private Boolean IsFinished;
    @SerializedName("TutorialType")
    @Expose
    private Integer TutorialType;
    private final static long serialVersionUID = -8636909306596579693L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tutorial() {
    }

    /**
     * 
     * @param TutorialType
     * @param Id
     * @param IsFinished
     */
    public Tutorial(Integer Id, Boolean IsFinished, Integer TutorialType) {
        super();
        this.Id = Id;
        this.IsFinished = IsFinished;
        this.TutorialType = TutorialType;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Boolean getIsFinished() {
        return IsFinished;
    }

    public void setIsFinished(Boolean IsFinished) {
        this.IsFinished = IsFinished;
    }

    public Integer getTutorialType() {
        return TutorialType;
    }

    public void setTutorialType(Integer TutorialType) {
        this.TutorialType = TutorialType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Id", Id).append("IsFinished", IsFinished).append("TutorialType", TutorialType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Id).append(IsFinished).append(TutorialType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tutorial) == false) {
            return false;
        }
        Tutorial rhs = ((Tutorial) other);
        return new EqualsBuilder().append(Id, rhs.Id).append(IsFinished, rhs.IsFinished).append(TutorialType, rhs.TutorialType).isEquals();
    }

}
