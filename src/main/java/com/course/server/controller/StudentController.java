package com.course.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.course.server.pojo.StudentChoice;
import com.course.server.pojo.StudentLogin;
import com.course.server.pojo.Students;
import com.course.server.pojo.TeacherChoice;
import com.course.server.service.StudentsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
@Api
@CrossOrigin
public class StudentController {
    @Autowired
    StudentsService studentsService;

    @GetMapping(value = "/getPassword")
    @ResponseBody
    public Students[] getPassword(String studentID) {

        Students[] students = new Students[1];
        students[0] = studentsService.getStudentPassword(studentID);

        return students;
    }

    @PostMapping(value = "/changePassword")
    @ResponseBody
    public void changePassword(@RequestBody JSONObject object) {

        StudentLogin studentLogin = new StudentLogin();
        studentLogin.setStudentID(object.getString("studentID"));
        studentLogin.setStudentPassword(object.getString("studentPassword"));
//        System.out.println(studentLogin.getStudentID());
//        System.out.println(studentLogin.getStudentPassword());
        studentsService.updateStudentPassword(studentLogin);
    }

    @GetMapping(value = "/getChoiceList")
    @ResponseBody
    public List<StudentChoice> getChoiceList(String studentID) {

        List<StudentChoice> studentCourseChoiceList = studentsService.getChoiceList(studentID);
        return studentCourseChoiceList;
    }

    @GetMapping(value = "/getAlreadyChoice")
    @ResponseBody
    public List<StudentChoice> getAlreadyChoice(String studentID) {

        List<StudentChoice> studentCourseChoiceList = studentsService.getAlreadyChoice(studentID);
//        System.out.println(studentCourseChoiceList);
        return studentCourseChoiceList;
    }

    @PostMapping(value = "choiceCourse")
    @ResponseBody
    public String studentCourseChoice(@RequestBody JSONObject object) {
        StudentChoice studentChoice = new StudentChoice();

        studentChoice.setStudentID(object.getString("studentID"));
        studentChoice.setTeacherID(object.getString("teacherID"));
        studentChoice.setCourseID(object.getString("courseID"));
        studentChoice.setCourseScore(object.getByte("courseScore"));

        studentsService.addCourseChoice(studentChoice);

        return "choice success";
    }




}
