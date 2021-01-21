
package com.hrm.test.api.data.model.worklog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Position implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("ShortName")
    @Expose
    private String ShortName;
    private final static long serialVersionUID = -921774428319633647L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Position() {
    }

    /**
     * 
     * @param Name
     * @param id
     * @param ShortName
     */
    public Position(Integer id, String Name, String ShortName) {
        super();
        this.Id = id;
        this.Name = Name;
        this.ShortName = ShortName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", Id).append("Name", Name).append("ShortName", ShortName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Name).append(Id).append(ShortName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Position) == false) {
            return false;
        }
        Position rhs = ((Position) other);
        return new EqualsBuilder().append(Name, rhs.Name).append(Id, rhs.Id).append(ShortName, rhs.ShortName).isEquals();
    }

}
