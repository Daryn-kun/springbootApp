package org.example.springbootapp.dao;

import org.example.springbootapp.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudents();

    public void deleteStudent(int id);

    public void saveStudent(Student student);

    public Student getStudent(int id);
}
