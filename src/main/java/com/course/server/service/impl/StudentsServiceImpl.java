package com.course.server.service.impl;

import com.course.server.mapper.StudentsMapper;
import com.course.server.pojo.StudentChoice;
import com.course.server.pojo.StudentLogin;
import com.course.server.pojo.Students;
import com.course.server.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public Students addNewStudent(Students student) {
        studentsMapper.addNewStudent(student);
        return student;
    }

    @Override
    public List<Students> getAllStudents() {
        return studentsMapper.getAllStudents();
    }

    @Override
    public Students updateStudent(Students student) {
        studentsMapper.updateStudents(student);
        return student;
    }

    @Override
    public void deleteOne(String studentID) {
        studentsMapper.deleteOne(studentID);
    }

    @Override
    public Students getStudentPassword(String studentID) {
        return studentsMapper.getStudentPassword(studentID);
    }

    @Override
    public void updateStudentPassword(StudentLogin studentLogin) {
        studentsMapper.updateStudentPassword(studentLogin);
    }

    @Override
    public List<StudentChoice> getChoiceList(String studentID) {
        return studentsMapper.getChoiceList(studentID);
    }

    @Override
    public List<StudentChoice> getAlreadyChoice(String studentID) {
//        System.out.println("service:"+studentsMapper.getAlreadyChoice(studentID));
        return studentsMapper.getAlreadyChoice(studentID);
    }

    @Override
    public void addCourseChoice(StudentChoice studentChoice) {
        studentsMapper.addCourseChoice(studentChoice);
    }
}
