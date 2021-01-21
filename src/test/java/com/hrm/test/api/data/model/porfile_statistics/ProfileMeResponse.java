
package com.hrm.test.api.data.model.porfile_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class ProfileMeResponse implements Serializable
{

    @SerializedName("BasicInfo")
    @Expose
    private BasicInfo basicInfo;
    @SerializedName("OrganisationalInfo")
    @Expose
    private OrganisationalInfo organisationalInfo;
    @SerializedName("ProjectList")
    @Expose
    private List<Object> projectList = null;
    private final static long serialVersionUID = -2886690033545207764L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProfileMeResponse() {
    }

    /**
     * 
     * @param projectList
     * @param basicInfo
     * @param organisationalInfo
     */
    public ProfileMeResponse(BasicInfo basicInfo, OrganisationalInfo organisationalInfo, List<Object> projectList) {
        super();
        this.basicInfo = basicInfo;
        this.organisationalInfo = organisationalInfo;
        this.projectList = projectList;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public OrganisationalInfo getOrganisationalInfo() {
        return organisationalInfo;
    }

    public void setOrganisationalInfo(OrganisationalInfo organisationalInfo) {
        this.organisationalInfo = organisationalInfo;
    }

    public List<Object> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Object> projectList) {
        this.projectList = projectList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("basicInfo", basicInfo).append("organisationalInfo", organisationalInfo).append("projectList", projectList).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(projectList).append(basicInfo).append(organisationalInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfileMeResponse) == false) {
            return false;
        }
        ProfileMeResponse rhs = ((ProfileMeResponse) other);
        return new EqualsBuilder().append(projectList, rhs.projectList).append(basicInfo, rhs.basicInfo).append(organisationalInfo, rhs.organisationalInfo).isEquals();
    }

}
