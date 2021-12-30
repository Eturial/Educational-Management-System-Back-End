package com.course.server.controller;

import com.course.server.pojo.Course;
import com.course.server.pojo.ShowInfo;
import com.course.server.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/course")
@Api
@CrossOrigin
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping(value = "/getAll")
    @ResponseBody
    public List<Course> getAllCourse() {
        List<Course> courseList = courseService.getAllCourses();
        return courseList;
    }
}
