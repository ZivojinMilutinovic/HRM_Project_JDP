
package com.hrm.test.api.data.model.worklog_calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ImagesUrls implements Serializable
{

    @SerializedName("lg_thumb")
    @Expose
    private String lg_thumb;
    @SerializedName("md_thumb")
    @Expose
    private String md_thumb;
    @SerializedName("sm_thumb")
    @Expose
    private String sm_thumb;
    private final static long serialVersionUID = 5301590150519352458L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImagesUrls() {
    }

    /**
     * 
     * @param sm_thumb
     * @param md_thumb
     * @param lg_thumb
     */
    public ImagesUrls(String lg_thumb, String md_thumb, String sm_thumb) {
        super();
        this.lg_thumb = lg_thumb;
        this.md_thumb = md_thumb;
        this.sm_thumb = sm_thumb;
    }

    public String getLgThumb() {
        return lg_thumb;
    }

    public void setLgThumb(String lg_thumb) {
        this.lg_thumb = lg_thumb;
    }

    public String getMdThumb() {
        return md_thumb;
    }

    public void setMdThumb(String md_thumb) {
        this.md_thumb = md_thumb;
    }

    public String getSmThumb() {
        return sm_thumb;
    }

    public void setSmThumb(String sm_thumb) {
        this.sm_thumb = sm_thumb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lg_thumb", lg_thumb).append("md_thumb", md_thumb).append("sm_thumb", sm_thumb).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sm_thumb).append(md_thumb).append(lg_thumb).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagesUrls) == false) {
            return false;
        }
        ImagesUrls rhs = ((ImagesUrls) other);
        return new EqualsBuilder().append(sm_thumb, rhs.sm_thumb).append(md_thumb, rhs.md_thumb).append(lg_thumb, rhs.lg_thumb).isEquals();
    }

}
