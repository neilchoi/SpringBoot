package com.Neil.Service;

import com.Neil.Dao.StudentDao;
import com.Neil.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Neil on 3/18/2018.
 */
// Business Logic


@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    // get a student from the list
    public Student getStudentIdentity(int id) {
        return this.studentDao.getStudentById(id);
    }

    // remove a student from the list
    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    // update a student in the list
    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    // insert new student
    public void insertStudent(Student student) {
        studentDao.insertStudentToDb(student);
    }
}
