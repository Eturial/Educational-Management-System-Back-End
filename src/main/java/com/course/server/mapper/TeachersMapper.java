package com.course.server.mapper;

import com.course.server.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity com.course.server.pojo.Teachers
*/
@Mapper
public interface TeachersMapper {

    void addNewTeacher(@Param("teacher") Teachers teacher);

    List<Teachers> getAllTeachers();

    void updateTeacher(@Param("teacher") Teachers teacher);

    void deleteOne(@Param("teacherID") String teacherID);

    Teachers getTeacherPassword(@Param("teacherID") String teacherID);

    void updateTeacherPassword(@Param("studentLogin") StudentLogin studentLogin);

    List<TeacherChoice> getAlreadyChoice(@Param("teacherID") String teacherID);

    void addCourseChoice(@Param("teacherChoice") TeacherChoice teacherChoice);

    List<TeacherChoice> getTeachCourse(@Param("teacherID") String teacherID);

    List<Students> getStudentList(@Param("teacherID") String teacherID, @Param("courseID") String courseID);

    void updateStudentGrade(@Param("studentID") String studentID,
                                          @Param("courseID") String courseID,
                                          @Param("teacherID") String teacherID,
                                          @Param("grade") String grade,
                                          @Param("times") Byte times);
}
