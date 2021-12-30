package com.course.server.service;

import com.course.server.pojo.StudentChoice;
import com.course.server.pojo.StudentLogin;
import com.course.server.pojo.Students;

import java.util.List;

public interface StudentsService {

    Students addNewStudent(Students student);

    List<Students> getAllStudents();

    Students updateStudent(Students student);

    void deleteOne(String studentID);

    Students getStudentPassword(String studentID);

    void updateStudentPassword(StudentLogin studentLogin);

    List<StudentChoice> getChoiceList(String studentID);

    List<StudentChoice> getAlreadyChoice(String studentID);

    void addCourseChoice(StudentChoice studentChoice);
}
