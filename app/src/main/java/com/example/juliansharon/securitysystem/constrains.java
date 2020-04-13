package com.example.juliansharon.securitysystem;

public class constrains {

   private String DAY,MONTH,YEAR,HOURS,MINUTES;
 constrains(){

 }
    public constrains(String DAY, String MONTH, String YEAR, String HOURS, String MINUTES) {
        this.DAY = DAY;
        this.MONTH = MONTH;
        this.YEAR = YEAR;
        this.HOURS = HOURS;
        this.MINUTES = MINUTES;
    }

    public String getDAY() {
        return DAY;
    }

    public void setDAY(String DAY) {
        this.DAY = DAY;
    }

    public String getMONTH() {
        return MONTH;
    }

    public void setMONTH(String MONTH) {
        this.MONTH = MONTH;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    public String getHOURS() {
        return HOURS;
    }

    public void setHOURS(String HOURS) {
        this.HOURS = HOURS;
    }

    public String getMINUTES() {
        return MINUTES;
    }

    public void setMINUTES(String MINUTES) {
        this.MINUTES = MINUTES;
    }
}
