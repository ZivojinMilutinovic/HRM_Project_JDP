
package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class WorklogResponse implements Serializable
{

    @SerializedName("HtecEmail")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String HtecEmail;
    @SerializedName("ShowBreakModal")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Boolean ShowBreakModal;
    @SerializedName("Branch")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Branch Branch;
    @SerializedName("LoginStatus")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String LoginStatus;
    @SerializedName("Roles")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Role> Roles = null;
    @SerializedName("Permissions")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Permission> Permissions = null;
    @ResponseRequiredField(canBeEmpty = false)
    @SerializedName("Positions")
    @Expose
    private List<Position> Positions = null;
    @SerializedName("OpenLogs")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private List<Object> OpenLogs = null;
    @SerializedName("RelatedUsers")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private List<Object> RelatedUsers = null;
    @SerializedName("Tutorials")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Tutorial> Tutorials = null;
    @SerializedName("AvailableStatusIds")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<Integer> AvailableStatusIds = null;
    @SerializedName("Id")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer Id;
    @SerializedName("FirstName")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String FirstName;
    @SerializedName("LastName")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String LastName;
    @SerializedName("ParentName")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private String ParentName;
    @SerializedName("Gender")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private String Gender;
    @SerializedName("Image")
    @ResponseRequiredField(canBeEmpty = true)
    @Expose
    private String Image;
    @SerializedName("LoginStatusId")
    @Expose
    private Integer LoginStatusId;
    @SerializedName("EmployeeStatus")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer EmployeeStatus;
    private final static long serialVersionUID = -7510303125766506519L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorklogResponse() {
    }

    /**
     * 
     * @param LastName
     * @param Image
     * @param Gender
     * @param Roles
     * @param Positions
     * @param HtecEmail
     * @param LoginStatus
     * @param Branch
     * @param AvailableStatusIds
     * @param EmployeeStatus
     * @param OpenLogs
     * @param FirstName
     * @param ParentName
     * @param Tutorials
     * @param Permissions
     * @param RelatedUsers
     * @param LoginStatusId
     * @param Id
     */
    public WorklogResponse(String HtecEmail, Branch Branch, String LoginStatus, List<Role> Roles, List<Permission> Permissions, List<Position> Positions, List<Object> OpenLogs, List<Object> RelatedUsers, List<Tutorial> Tutorials, List<Integer> AvailableStatusIds, Integer Id, String FirstName, String LastName, String ParentName, String Gender, String Image, Integer LoginStatusId, Integer EmployeeStatus,Boolean ShowBreakModal) {
        super();
        this.HtecEmail = HtecEmail;
        this.Branch = Branch;
        this.LoginStatus = LoginStatus;
        this.Roles = Roles;
        this.Permissions = Permissions;
        this.Positions = Positions;
        this.OpenLogs = OpenLogs;
        this.RelatedUsers = RelatedUsers;
        this.Tutorials = Tutorials;
        this.AvailableStatusIds = AvailableStatusIds;
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.ParentName = ParentName;
        this.Gender = Gender;
        this.Image = Image;
        this.LoginStatusId = LoginStatusId;
        this.EmployeeStatus = EmployeeStatus;
        this.ShowBreakModal=ShowBreakModal;
    }

    public String getHtecEmail() {
        return HtecEmail;
    }

    public void setHtecEmail(String HtecEmail) {
        this.HtecEmail = HtecEmail;
    }

   public Boolean getShowBreakModal() {
       return ShowBreakModal;
   }
   public void setShowBreakModal(Boolean ShowBreakModal){this.ShowBreakModal=ShowBreakModal;}

    public Branch getBranch() {
        return Branch;
    }

    public void setBranch(Branch Branch) {
        this.Branch = Branch;
    }

    public String getLoginStatus() {
        return LoginStatus;
    }

    public void setLoginStatus(String LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> Roles) {
        this.Roles = Roles;
    }

    public List<Permission> getPermissions() {
        return Permissions;
    }

    public void setPermissions(List<Permission> Permissions) {
        this.Permissions = Permissions;
    }

    public List<Position> getPositions() {
        return Positions;
    }

    public void setPositions(List<Position> Positions) {
        this.Positions = Positions;
    }

    public List<Object> getOpenLogs() {
        return OpenLogs;
    }

    public void setOpenLogs(List<Object> OpenLogs) {
        this.OpenLogs = OpenLogs;
    }

    public List<Object> getRelatedUsers() {
        return RelatedUsers;
    }

    public void setRelatedUsers(List<Object> RelatedUsers) {
        this.RelatedUsers = RelatedUsers;
    }

    public List<Tutorial> getTutorials() {
        return Tutorials;
    }

    public void setTutorials(List<Tutorial> Tutorials) {
        this.Tutorials = Tutorials;
    }

    public List<Integer> getAvailableStatusIds() {
        return AvailableStatusIds;
    }

    public void setAvailableStatusIds(List<Integer> AvailableStatusIds) {
        this.AvailableStatusIds = AvailableStatusIds;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public Integer getLoginStatusId() {
        return LoginStatusId;
    }

    public void setLoginStatusId(Integer LoginStatusId) {
        this.LoginStatusId = LoginStatusId;
    }

    public Integer getEmployeeStatus() {
        return EmployeeStatus;
    }

    public void setEmployeeStatus(Integer EmployeeStatus) {
        this.EmployeeStatus = EmployeeStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("HtecEmail", HtecEmail).append("Branch", Branch).append("LoginStatus", LoginStatus).append("Roles", Roles).append("Permissions", Permissions).append("Positions", Positions).append("OpenLogs", OpenLogs).append("RelatedUsers", RelatedUsers).append("Tutorials", Tutorials).append("AvailableStatusIds", AvailableStatusIds).append("Id", Id).append("FirstName", FirstName).append("LastName", LastName).append("ParentName", ParentName).append("Gender", Gender).append("Image", Image).append("LoginStatusId", LoginStatusId).append("EmployeeStatus", EmployeeStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(LastName).append(Image).append(Gender).append(Roles).append(Positions).append(HtecEmail).append(LoginStatus).append(Branch).append(AvailableStatusIds).append(EmployeeStatus).append(OpenLogs).append(FirstName).append(ParentName).append(Tutorials).append(Permissions).append(RelatedUsers).append(LoginStatusId).append(Id).append(ShowBreakModal).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this){
            return true;
        }
        if ((other instanceof WorklogResponse) == false) {
            return false;
        }
        WorklogResponse rhs = ((WorklogResponse) other);
        return new EqualsBuilder().append(LastName, rhs.LastName).append(Image, rhs.Image).append(Gender, rhs.Gender).append(Roles, rhs.Roles).append(Positions, rhs.Positions).append(HtecEmail, rhs.HtecEmail).append(LoginStatus, rhs.LoginStatus).append(Branch, rhs.Branch).append(AvailableStatusIds, rhs.AvailableStatusIds).append(EmployeeStatus, rhs.EmployeeStatus).append(OpenLogs, rhs.OpenLogs).append(FirstName, rhs.FirstName).append(ParentName, rhs.ParentName).append(Tutorials, rhs.Tutorials).append(Permissions, rhs.Permissions).append(RelatedUsers, rhs.RelatedUsers).append(LoginStatusId, rhs.LoginStatusId).append(Id, rhs.Id).append(ShowBreakModal, rhs.ShowBreakModal).isEquals();
    }

}
