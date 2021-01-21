
package com.hrm.test.api.data.model.porfile_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class OrganisationalInfo implements Serializable
{

    @SerializedName("Branch")
    @Expose
    private String Branch;
    @SerializedName("Positions")
    @Expose
    private List<Position> Positions = null;
    @SerializedName("Seniority")
    @Expose
    private Object seniority;
    @SerializedName("ExperienceHTEC")
    @Expose
    private Integer ExperienceHTEC;
    @SerializedName("Experience")
    @Expose
    private Integer Experience;
    @SerializedName("UsualWorkingTime")
    @Expose
    private Object UsualWorkingTime;
    @SerializedName("TeamLeaders")
    @Expose
    private List<Object> TeamLeaders = null;
    @SerializedName("ProjectManagers")
    @Expose
    private List<Object> ProjectManagers = null;
    @SerializedName("Teams")
    @Expose
    private List<Object> Teams = null;
    @SerializedName("IsVisible")
    @Expose
    private Boolean IsVisible;
    @SerializedName("RoleId")
    @Expose
    private Integer RoleId;
    @SerializedName("Role")
    @Expose
    private String Role;
    @SerializedName("Roles")
    @Expose
    private List<Role> Roles = null;
    @SerializedName("Superior")
    @Expose
    private Object Superior;
    private final static long serialVersionUID = 7485092458365842712L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrganisationalInfo() {
    }

    /**
     * 
     * @param Role
     * @param Teams
     * @param RoleId
     * @param Roles
     * @param ProjectManagers
     * @param Positions
     * @param IsVisible
     * @param Experience
     * @param TeamLeaders
     * @param Branch
     * @param UsualWorkingTime
     * @param Superior
     * @param ExperienceHTEC
     * @param seniority
     */
    public OrganisationalInfo(String Branch, List<Position> Positions, Object seniority, Integer ExperienceHTEC, Integer Experience, Object UsualWorkingTime, List<Object> TeamLeaders, List<Object> ProjectManagers, List<Object> Teams, Boolean IsVisible, Integer RoleId, String Role, List<Role> Roles, Object Superior) {
        super();
        this.Branch = Branch;
        this.Positions = Positions;
        this.seniority = seniority;
        this.ExperienceHTEC = ExperienceHTEC;
        this.Experience = Experience;
        this.UsualWorkingTime = UsualWorkingTime;
        this.TeamLeaders = TeamLeaders;
        this.ProjectManagers = ProjectManagers;
        this.Teams = Teams;
        this.IsVisible = IsVisible;
        this.RoleId = RoleId;
        this.Role = Role;
        this.Roles = Roles;
        this.Superior = Superior;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public List<Position> getPositions() {
        return Positions;
    }

    public void setPositions(List<Position> Positions) {
        this.Positions = Positions;
    }

    public Object getSeniority() {
        return seniority;
    }

    public void setSeniority(Object seniority) {
        this.seniority = seniority;
    }

    public Integer getExperienceHTEC() {
        return ExperienceHTEC;
    }

    public void setExperienceHTEC(Integer ExperienceHTEC) {
        this.ExperienceHTEC = ExperienceHTEC;
    }

    public Integer getExperience() {
        return Experience;
    }

    public void setExperience(Integer Experience) {
        this.Experience = Experience;
    }

    public Object getUsualWorkingTime() {
        return UsualWorkingTime;
    }

    public void setUsualWorkingTime(Object UsualWorkingTime) {
        this.UsualWorkingTime = UsualWorkingTime;
    }

    public List<Object> getTeamLeaders() {
        return TeamLeaders;
    }

    public void setTeamLeaders(List<Object> TeamLeaders) {
        this.TeamLeaders = TeamLeaders;
    }

    public List<Object> getProjectManagers() {
        return ProjectManagers;
    }

    public void setProjectManagers(List<Object> ProjectManagers) {
        this.ProjectManagers = ProjectManagers;
    }

    public List<Object> getTeams() {
        return Teams;
    }

    public void setTeams(List<Object> Teams) {
        this.Teams = Teams;
    }

    public Boolean getIsVisible() {
        return IsVisible;
    }

    public void setIsVisible(Boolean IsVisible) {
        this.IsVisible = IsVisible;
    }

    public Integer getRoleId() {
        return RoleId;
    }

    public void setRoleId(Integer RoleId) {
        this.RoleId = RoleId;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> Roles) {
        this.Roles = Roles;
    }

    public Object getSuperior() {
        return Superior;
    }

    public void setSuperior(Object Superior) {
        this.Superior = Superior;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Branch", Branch).append("Positions", Positions).append("seniority", seniority).append("ExperienceHTEC", ExperienceHTEC).append("Experience", Experience).append("UsualWorkingTime", UsualWorkingTime).append("TeamLeaders", TeamLeaders).append("ProjectManagers", ProjectManagers).append("Teams", Teams).append("IsVisible", IsVisible).append("RoleId", RoleId).append("Role", Role).append("Roles", Roles).append("Superior", Superior).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Role).append(Teams).append(RoleId).append(Roles).append(ProjectManagers).append(Positions).append(IsVisible).append(Experience).append(TeamLeaders).append(Branch).append(UsualWorkingTime).append(Superior).append(ExperienceHTEC).append(seniority).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganisationalInfo) == false) {
            return false;
        }
        OrganisationalInfo rhs = ((OrganisationalInfo) other);
        return new EqualsBuilder().append(Role, rhs.Role).append(Teams, rhs.Teams).append(RoleId, rhs.RoleId).append(Roles, rhs.Roles).append(ProjectManagers, rhs.ProjectManagers).append(Positions, rhs.Positions).append(IsVisible, rhs.IsVisible).append(Experience, rhs.Experience).append(TeamLeaders, rhs.TeamLeaders).append(Branch, rhs.Branch).append(UsualWorkingTime, rhs.UsualWorkingTime).append(Superior, rhs.Superior).append(ExperienceHTEC, rhs.ExperienceHTEC).append(seniority, rhs.seniority).isEquals();
    }

}
