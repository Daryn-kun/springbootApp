package org.example.springbootapp.service;

import org.example.springbootapp.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);
}
