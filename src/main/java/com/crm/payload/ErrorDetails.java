package com.crm.payload;

import java.util.Date;

public class ErrorDetails {

    private String message;
    private Date date;
    private String request;

    public ErrorDetails(String message, Date date, String request) {
        this.message = message;
        this.date = date;
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
