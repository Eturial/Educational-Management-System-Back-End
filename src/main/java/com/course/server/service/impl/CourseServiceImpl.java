package com.course.server.service.impl;

import com.course.server.mapper.CourseMapper;
import com.course.server.pojo.Course;
import com.course.server.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public Course addNewCourse(Course course) {
        courseMapper.addNewCourse(course);
        return course;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseMapper.getAllCourses();
    }

    @Override
    public Course updateCourse(Course course) {
        courseMapper.updateCourse(course);
        return course;
    }

    @Override
    public void deleteOne(String courseID) {
        courseMapper.deleteOne(courseID);
    }
}
