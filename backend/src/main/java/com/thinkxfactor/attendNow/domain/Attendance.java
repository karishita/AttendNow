package com.thinkxfactor.attendNow.domain;

public class Attendance {
    private long AttendanceID;
    private long id;
    private long CourseID;
    private String Date;
    private String Status;
    public Attendance(long attendanceID, long id, long courseID, String date, String status) {
        AttendanceID = attendanceID;
        this.id = id;
        CourseID = courseID;
        Date = date;
        Status = status;
    }
    public long getAttendanceID() {
        return AttendanceID;
    }
    public void setAttendanceID(long attendanceID) {
        AttendanceID = attendanceID;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCourseID() {
        return CourseID;
    }
    public void setCourseID(long courseID) {
        CourseID = courseID;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    

}
