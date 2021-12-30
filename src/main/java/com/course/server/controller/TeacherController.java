package com.course.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.course.server.pojo.*;
import com.course.server.service.TeachersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/teacher")
@Api
@CrossOrigin
public class TeacherController {
    @Autowired
    TeachersService teachersService;

    @GetMapping(value = "/getPassword")
    @ResponseBody
    public Teachers[] getPassword(String teacherID) {

        Teachers[] teachers = new Teachers[1];
        teachers[0] = teachersService.getTeacherPassword(teacherID);

        return teachers;
    }

    @PostMapping(value = "/changePassword")
    @ResponseBody
    public void changePassword(@RequestBody JSONObject object) {

        StudentLogin studentLogin = new StudentLogin();
        studentLogin.setTeacherID(object.getString("teacherID"));
        studentLogin.setTeacherPassword(object.getString("teacherPassword"));

        teachersService.updateTeacherPassword(studentLogin);
    }

    @GetMapping(value = "getAlreadyChoice")
    @ResponseBody
    public List<TeacherChoice> getAlreadyChoice(String teacherID) {
        List<TeacherChoice> teacherChoiceList = teachersService.getAlreadyChoice(teacherID);
        return teacherChoiceList;
    }

    @PostMapping(value = "sendCourseChoice")
    @ResponseBody
    public Boolean teacherCourseChoice(@RequestBody JSONObject object) {
        TeacherChoice teacherChoice = new TeacherChoice();

        teacherChoice.setTeacherID(object.getString("teacherID"));
        teacherChoice.setCourseID(object.getString("courseID"));

        teachersService.addCourseChoice(teacherChoice);

        return true;
    }

    @GetMapping(value = "getTeachCourse")
    @ResponseBody
    public List<TeacherChoice> getTeachCourse(String teacherID) {
        List<TeacherChoice> teacherChoiceList = teachersService.getTeachCourse(teacherID);
        return teacherChoiceList;
    }

    @GetMapping(value = "getStudentList")
    @ResponseBody
    public List<Students> getStudentList(String teacherID, String courseID) {
        List<Students> studentsList = teachersService.getStudentList(teacherID, courseID);
        return studentsList;
    }

    @GetMapping(value = "inGradeForStudent")
    @ResponseBody
    public Boolean updateStudentGrade(String studentID, String courseID, String teacherID, String grade, Byte times) {
        if(times == 0) {
            return false;
        }
        teachersService.updateStudentGrade(studentID, courseID, teacherID, grade, times);

        return true;
    }

}
