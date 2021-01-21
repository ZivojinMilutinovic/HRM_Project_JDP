
package com.hrm.test.api.data.model.calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.annotations.ResponseRequiredField;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class CalendarResponse implements Serializable
{

    @SerializedName("currentPage")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer currentPage;
    @SerializedName("totalItems")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer totalItems;
    @SerializedName("totalPages")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer totalPages;
    @SerializedName("pageSize")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private Integer pageSize;
    @SerializedName("pageItems")
    @ResponseRequiredField(canBeEmpty = false)
    @Expose
    private List<PageItem> pageItems = null;
    private final static long serialVersionUID = 4051825519139607954L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CalendarResponse() {
    }

    /**
     * 
     * @param totalItems
     * @param totalPages
     * @param pageSize
     * @param pageItems
     * @param currentPage
     */
    public CalendarResponse(Integer currentPage, Integer totalItems, Integer totalPages, Integer pageSize, List<PageItem> pageItems) {
        super();
        this.currentPage = currentPage;
        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.pageSize = pageSize;
        this.pageItems = pageItems;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<PageItem> getPageItems() {
        return pageItems;
    }

    public void setPageItems(List<PageItem> pageItems) {
        this.pageItems = pageItems;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currentPage", currentPage).append("totalItems", totalItems).append("totalPages", totalPages).append("pageSize", pageSize).append("pageItems", pageItems).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalPages).append(pageSize).append(pageItems).append(totalItems).append(currentPage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CalendarResponse) == false) {
            return false;
        }
        CalendarResponse rhs = ((CalendarResponse) other);
        return new EqualsBuilder().append(totalPages, rhs.totalPages).append(pageSize, rhs.pageSize).append(pageItems, rhs.pageItems).append(totalItems, rhs.totalItems).append(currentPage, rhs.currentPage).isEquals();
    }

}
