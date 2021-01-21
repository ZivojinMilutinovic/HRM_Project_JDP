
package com.hrm.test.api.data.model.worklog;

//samo lang je staro mora lang3 da se doda
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


public class Branch implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    private final static long serialVersionUID = -292549888414934814L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Branch() {
    }

    /**
     * 
     * @param Name
     * @param Id
     */
    public Branch(Integer Id, String Name) {
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
        if ((other instanceof Branch) == false) {
            return false;
        }
        Branch rhs = ((Branch) other);
        return new EqualsBuilder().append(Name, rhs.Name).append(Id, rhs.Id).isEquals();
    }

}
