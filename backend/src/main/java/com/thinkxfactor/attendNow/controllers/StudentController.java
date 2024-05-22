package com.thinkxfactor.attendNow.controllers;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.thinkxfactor.attendNow.domain.Student;

@RestController
@RequestMapping("/api/student")

public class StudentController {

    private List<Student> studentsDb = new ArrayList<>();


    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        student.setId((long) (studentsDb.size() + 1));
        studentsDb.add(student);
        return student;
    }

    // Read Students
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentsDb;
    }

    // Update Student
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        for (Student std : studentsDb) {
            if (std.getId().equals(student.getId())) {
                std.setName(student.getName());
                std.setEmail(student.getEmail());
                std.setPhone(student.getPhone());
                std.setUsername(student.getUsername());
                std.setPassword(student.getPassword());
                std.setAddress(student.getAddress());
                return std;
            }
        }
        return null;
    }

    // Delete Student
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        for (Student std : studentsDb) {
            if (std.getId().equals(id)) {
                studentsDb.remove(std);
                break;
            }
        }
    }
}
