package com.course.server.service;

import com.course.server.pojo.*;

import java.util.List;

public interface TeachersService {

    Teachers addNewTeacher(Teachers teacher);

    List<Teachers> getAllTeachers();

    Teachers updateTeacher(Teachers teacher);

    void deleteOne(String teacherID);

    Teachers getTeacherPassword(String teacherID);

    void updateTeacherPassword(StudentLogin studentLogin);

    List<TeacherChoice> getAlreadyChoice(String teacherID);

    void addCourseChoice(TeacherChoice teacherChoice);

    List<TeacherChoice> getTeachCourse(String teacherID);

    List<Students> getStudentList(String teacherID, String courseID);

    void updateStudentGrade(String studentID, String courseID, String teacherID, String grade, Byte times);
}
