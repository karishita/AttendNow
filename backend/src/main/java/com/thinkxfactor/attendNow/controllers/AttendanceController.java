package com.thinkxfactor.attendNow.controllers;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.thinkxfactor.attendNow.domain.Attendance;
import com.thinkxfactor.attendNow.domain.Course;
@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    private List<Attendance> Attendancedb=new ArrayList<>();
   //add attendance
   @PostMapping("/add")
   public Attendance addAttendance(@RequestBody Attendance attendance)
   {
    attendance.setAttendanceID((long) (Attendancedb.size() + 1));
       Attendancedb.add(attendance);
        return attendance;
   }

   //update Attendance
   @PutMapping("/update")
    public Course updateAttendance(@RequestBody Attendance attendance) {
        for (Attendance a : Attendancedb) {
            if (a.getAttendanceID()==(attendance.getAttendanceID())) {
                a.setCourseID(attendance.getCourseID());
                a.setDate(attendance.getDate());
                a.setId(attendance.getId());
                a.setStatus(attendance.getStatus());
            }
                
            }
        
        return null;
    }

    //get attendance
    @GetMapping("/getAll")
    public List<Attendance> getallAttendance()
    {
        return Attendancedb;
    }

    //delete attendance
    @DeleteMapping("/delete/{id}")
    public void deleteAttendance(@PathVariable long id)
    {
        for(Attendance a: Attendancedb){
               if(a.getAttendanceID()==id)
               {
                Attendancedb.remove(a);
               
               break;
               }
        }
    }

}
