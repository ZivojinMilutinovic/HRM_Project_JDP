
package com.hrm.test.api.data.model.calendar;

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
    @SerializedName("PositionTypeId")
    @Expose
    private Object PositionTypeId;
    @SerializedName("PositionTypeName")
    @Expose
    private Object PositionTypeName;
    private final static long serialVersionUID = -6142803713212698084L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Position() {
    }

    /**
     * 
     * @param PositionTypeId
     * @param Name
     * @param PositionTypeName
     * @param id
     * @param ShortName
     */
    public Position(Integer id, String Name, String ShortName, Object PositionTypeId, Object PositionTypeName) {
        super();
        this.Id = id;
        this.Name = Name;
        this.ShortName = ShortName;
        this.PositionTypeId = PositionTypeId;
        this.PositionTypeName = PositionTypeName;
    }

    public Integer getid() {
        return Id;
    }

    public void setid(Integer id) {
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

    public Object getPositionTypeId() {
        return PositionTypeId;
    }

    public void setPositionTypeId(Object PositionTypeId) {
        this.PositionTypeId = PositionTypeId;
    }

    public Object getPositionTypeName() {
        return PositionTypeName;
    }

    public void setPositionTypeName(Object PositionTypeName) {
        this.PositionTypeName = PositionTypeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Id", Id).append("Name", Name).append("ShortName", ShortName).append("PositionTypeId", PositionTypeId).append("PositionTypeName", PositionTypeName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Name).append(PositionTypeId).append(PositionTypeName).append(Id).append(ShortName).toHashCode();
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
        return new EqualsBuilder().append(Name, rhs.Name).append(PositionTypeId, rhs.PositionTypeId).append(PositionTypeName, rhs.PositionTypeName).append(Id, rhs.Id).append(ShortName, rhs.ShortName).isEquals();
    }

}
