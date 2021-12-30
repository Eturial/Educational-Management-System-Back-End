package com.course.server.mapper;

import com.course.server.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper {

    void addNewCourse(@Param("course") Course course);

    List<Course> getAllCourses();

    void updateCourse(@Param("course") Course course);

    void deleteOne(@Param("courseID") String courseID);
}
