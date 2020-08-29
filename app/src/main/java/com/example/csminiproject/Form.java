package com.example.csminiproject;


import java.io.Serializable;
import java.util.Objects;

public class Form implements Serializable {

    public int id;

    private String StdID;

    private String EventType;

    public String getStdID() {
        return StdID;
    }

    public void setStdID(String stdID) {
        StdID = stdID;
    }

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getFromDate() {
        return FromDate;
    }

    public void setFromDate(String fromDate) {
        FromDate = fromDate;
    }

    public String getToDate() {
        return ToDate;
    }

    public void setToDate(String toDate) {
        ToDate = toDate;
    }

    public String getClgScholarship() {
        return ClgScholarship;
    }

    public void setClgScholarship(String clgScholarship) {
        ClgScholarship = clgScholarship;
    }

    public String getExtScholarship() {
        return ExtScholarship;
    }

    public void setExtScholarship(String extScholarship) {
        ExtScholarship = extScholarship;
    }

    public String getDriveLink() {
        return DriveLink;
    }

    public void setDriveLink(String driveLink) {
        DriveLink = driveLink;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        StdName = stdName;
    }

    public String getStdSem() {
        return StdSem;
    }

    public void setStdSem(String stdSem) {
        StdSem = stdSem;
    }

    public Form(String stdID, String eventType, String eventName, String fromDate, String toDate, String clgScholarship, String extScholarship, String driveLink, String stdName, String stdSem) {
        StdID = stdID;
        EventType = eventType;
        EventName = eventName;
        FromDate = fromDate;
        ToDate = toDate;
        ClgScholarship = clgScholarship;
        ExtScholarship = extScholarship;
        DriveLink = driveLink;
        StdName = stdName;
        StdSem = stdSem;
    }

    private String EventName;

    private String FromDate;

    private String ToDate;

    private String ClgScholarship;

    private String ExtScholarship;

    private String DriveLink;


    private String StdName;

    private String StdSem;

    public Form() {
    }
}