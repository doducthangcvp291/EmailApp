package com.example.myapplication;

public class data {
    private String name;
    private String date;
    private String fistofname;
    private String log;

    public String getLog() {
        return log;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDate() {
        return date;
    }

//    public void setDate(String date) {
//        this.date = date;
//    }

    public String getFistofname() {
        return fistofname;
    }

//    public void setFistofname(String fistofname) {
//        this.fistofname = fistofname;
//    }

    public data(String name, String date, String fistofname, String log) {
        this.name = name;
        this.date = date;
        this.fistofname = fistofname;
        this.log = log;
    }
}
