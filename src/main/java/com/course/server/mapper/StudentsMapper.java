package com.course.server.mapper;

import com.course.server.pojo.StudentChoice;
import com.course.server.pojo.StudentLogin;
import com.course.server.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity com.course.server.pojo.Students
*/
@Mapper
public interface StudentsMapper {
    void addNewStudent(@Param("student") Students student);

    List<Students> getAllStudents();

    void updateStudents(@Param("student") Students student);

    void deleteOne(@Param("studentID") String studentID);

    Students getStudentPassword(@Param("studentID") String studentID);

    void updateStudentPassword(@Param("studentLogin")StudentLogin studentLogin);

    List<StudentChoice> getChoiceList(@Param("studentID") String studentID);

    List<StudentChoice> getAlreadyChoice(@Param("studentID") String studentID);

    void addCourseChoice(@Param("studentChoice") StudentChoice studentChoice);
}
