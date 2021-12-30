package com.course.server.service;

import com.course.server.pojo.Course;

import java.util.List;

public interface CourseService {

    Course addNewCourse(Course course);

    List<Course> getAllCourses();

    Course updateCourse(Course course);

    void deleteOne(String courseID);
}
