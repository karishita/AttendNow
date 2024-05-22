package com.thinkxfactor.attendNow.controllers;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.thinkxfactor.attendNow.domain.Course;



@RestController
@RequestMapping("/api/course")
public class CourseController {
    private List<Course> CourseDb = new ArrayList<>();
    //add course
    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course)
    {
        course.setCourseID((long) (CourseDb.size() + 1));
        CourseDb.add(course);
        return course;
    }
//update Course
 @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        for (Course c : CourseDb) {
            if (c.getCourseID()==(course.getCourseID())) {
                c.setCourseCode(course.getCourseCode());
                c.setCourseName(course.getCourseName());
                c.setInstructor(course.getInstructor());
                
            }
        }
        return null;
    }
    


//view course
@GetMapping("/getAll")
public List<Course> getallCourse()
{
    return CourseDb;
}

//delete Course
@DeleteMapping("/delete/{id}")
public void DeleteCourse(@PathVariable long id)
{
    for (Course c : CourseDb) {
        if (c.getCourseID()==id) {
            CourseDb.remove(c);
            break;
        }
    }
}
}