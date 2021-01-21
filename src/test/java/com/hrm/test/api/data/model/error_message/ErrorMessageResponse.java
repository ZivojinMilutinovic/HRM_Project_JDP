package com.hrm.test.api.data.model.error_message;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrm.test.api.data.model.common.ErrorResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ErrorMessageResponse extends ErrorResponse implements Serializable
{

    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;
    private final static long serialVersionUID = 8839564574564495328L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ErrorMessageResponse() {
    }

    /**
     *
     * @param ErrorMessage
     */
    public ErrorMessageResponse(String ErrorMessage) {
        super();
        this.ErrorMessage = ErrorMessage;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ErrorMessage", ErrorMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ErrorMessage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrorMessageResponse) == false) {
            return false;
        }
        ErrorMessageResponse rhs = ((ErrorMessageResponse) other);
        return new EqualsBuilder().append(ErrorMessage, rhs.ErrorMessage).isEquals();
    }

}