package com.sample.StudentExampleSetGet;

public class Student1 {
    
    private int sid;
    private String sname;

    public Student1(int sid, String sname){
        this.sid = sid;
        this.sname = sname;

    }
    
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void display(){
        System.out.println(sid);
        System.out.println(sname);
    }
}
