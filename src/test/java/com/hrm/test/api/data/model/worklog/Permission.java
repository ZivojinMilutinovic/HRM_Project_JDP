
package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Permission implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Scope")
    @Expose
    private String Scope;
    private final static long serialVersionUID = 6707115873847408833L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Permission() {
    }

    /**
     * 
     * @param Scope
     * @param Name
     * @param Id
     */
    public Permission(Integer Id, String Name, String Scope) {
        super();
        this.Id = Id;
        this.Name = Name;
        this.Scope = Scope;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getScope() {
        return Scope;
    }

    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Id", Id).append("Name", Name).append("Scope", Scope).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Name).append(Id).append(Scope).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permission) == false) {
            return false;
        }
        Permission rhs = ((Permission) other);
        return new EqualsBuilder().append(Name, rhs.Name).append(Id, rhs.Id).append(Scope, rhs.Scope).isEquals();
    }

}
