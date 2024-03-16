package org.example.springbootapp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.springbootapp.entity.Student;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> getAllStudents() {
        Query query = entityManager.createQuery("from Student");
        return query.getResultList();
    }

    @Override
    public void deleteStudent(int id) {
        Query query = entityManager.createQuery("delete from Student where id = :studentId");

        query.setParameter("studentId", id);
        query.executeUpdate();
    }

    @Override
    public void saveStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public Student getStudent(int id) {
        entityManager.find(Student.class, id)
        return student;
    }
}
