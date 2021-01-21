
package com.hrm.test.api.data.model.porfile_statistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Role implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    private final static long serialVersionUID = -2945873118910395451L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Role() {
    }

    /**
     * 
     * @param Name
     * @param Id
     */
    public Role(Integer Id, String Name) {
        super();
        this.Id = Id;
        this.Name = Name;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Id", Id).append("Name", Name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Name).append(Id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Role) == false) {
            return false;
        }
        Role rhs = ((Role) other);
        return new EqualsBuilder().append(Name, rhs.Name).append(Id, rhs.Id).isEquals();
    }

}
