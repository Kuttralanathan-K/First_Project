package com.example.juliansharon.securitysystem;

public class USERS {
    String name,reason,hour,date,min,month,year;
    public USERS(){

    }
    public USERS(String name, String reason, String time, String date,String min,String month,String year) {
        this.name = name;
        this.reason = reason;
        this.hour=hour;
        this.date = date;
        this.min=min;
        this.month=month;
        this.year=year;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
