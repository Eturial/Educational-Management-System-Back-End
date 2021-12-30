package com.course.server.service.impl;

import com.course.server.mapper.TeachersMapper;
import com.course.server.pojo.*;
import com.course.server.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    TeachersMapper teachersMapper;

    @Override
    public Teachers addNewTeacher(Teachers teacher) {
        teachersMapper.addNewTeacher(teacher);
        return teacher;
    }

    @Override
    public List<Teachers> getAllTeachers() {
        return teachersMapper.getAllTeachers();
    }

    @Override
    public Teachers updateTeacher(Teachers teacher) {
        teachersMapper.updateTeacher(teacher);
        return teacher;
    }

    @Override
    public void deleteOne(String teacherID) {
        teachersMapper.deleteOne(teacherID);
    }

    @Override
    public Teachers getTeacherPassword(String teacherID) {
        return teachersMapper.getTeacherPassword(teacherID);
    }

    @Override
    public void updateTeacherPassword(StudentLogin studentLogin) {
        teachersMapper.updateTeacherPassword(studentLogin);
    }

    @Override
    public List<TeacherChoice> getAlreadyChoice(String teacherID) {
        return teachersMapper.getAlreadyChoice(teacherID);
    }

    @Override
    public void addCourseChoice(TeacherChoice teacherChoice) {
        teachersMapper.addCourseChoice(teacherChoice);
    }

    @Override
    public List<TeacherChoice> getTeachCourse(String teacherID) {
        return teachersMapper.getTeachCourse(teacherID);
    }

    @Override
    public List<Students> getStudentList(String teacherID, String courseID) {
//        System.out.println(teachersMapper.getStudentList(teacherID, courseID));
        return teachersMapper.getStudentList(teacherID, courseID);
    }

    @Override
    public void updateStudentGrade(String studentID, String courseID, String teacherID, String grade, Byte times) {
        teachersMapper.updateStudentGrade(studentID, courseID, teacherID, grade, times);
    }
}
