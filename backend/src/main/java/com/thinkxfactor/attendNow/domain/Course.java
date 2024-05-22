package com.thinkxfactor.attendNow.domain;

public class Course {
   private long CourseID;
    private String CourseName;
    private String Instructor;
    private String CourseCode;

    public Course(long CourseID,String CourseName,String Instructor,String CourseCode)
    {
        this.CourseName=CourseName;
        this.CourseID=CourseID;
        this.Instructor=Instructor;
        this.CourseCode=CourseCode;
    }

    public long getCourseID() {
        return CourseID;
    }

    public void setCourseID(long courseID) {
        CourseID = courseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }  
}
