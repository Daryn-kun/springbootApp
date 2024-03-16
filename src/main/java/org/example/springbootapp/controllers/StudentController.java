package org.example.springbootapp.controllers;

import org.example.springbootapp.entity.Student;
import org.example.springbootapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> show() {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student id: " + id + " was deleted";
    }
}
