
package com.hrm.test.api.data.model.worklog_calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class CellsArray implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer Id;
    @SerializedName("WIdth")
    @Expose
    private Double Width;
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    private final static long serialVersionUID = -7503020363581142787L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CellsArray() {
    }

    /**
     * 
     * @param Offset
     * @param Width
     * @param Id
     */
    public CellsArray(Integer Id, Double Width, Integer Offset) {
        super();
        this.Id = Id;
        this.Width = Width;
        this.Offset = Offset;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Double getWIdth() {
        return Width;
    }

    public void setWIdth(Double Width) {
        this.Width = Width;
    }

    public Integer getOffset() {
        return Offset;
    }

    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("Id", Id).append("Width", Width).append("Offset", Offset).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Width).append(Id).append(Offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CellsArray) == false) {
            return false;
        }
        CellsArray rhs = ((CellsArray) other);
        return new EqualsBuilder().append(Width, rhs.Width).append(Id, rhs.Id).append(Offset, rhs.Offset).isEquals();
    }

}
