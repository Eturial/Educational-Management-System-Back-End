package com.course.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.course.server.pojo.*;
import com.course.server.service.CourseService;
import com.course.server.service.StudentsService;
import com.course.server.service.TeachersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/admin")
@Api
@CrossOrigin
public class AdminController {
    @Autowired
    StudentsService studentService;

    @Autowired
    TeachersService teacherService;

    @Autowired
    CourseService courseService;

    @PostMapping(value = "/addNewStudent")
    @ResponseBody
    public Students addNewStudent(@RequestBody JSONObject object) {
        Students student = new Students();

//        System.out.println(object);
        student.setStudentID(object.getString("studentID"));
        student.setSutdentName(object.getString("sutdentName"));
        student.setStudentGender(object.getString("studentGender"));
        student.setStudentAge(object.getByte("studentAge"));

        student.setStudentBirthday(object.getDate("studentBirthday"));
//        System.out.println(student.getStudentBirthday());

        student.setStudentCollege(object.getString("studentCollege"));
        student.setStudentMajor(object.getString("studentMajor"));
        student.setStudentEmail(object.getString("studentEmail"));
        student.setStudentTelephone(object.getString("studentTelephone"));
        student.setStudentPassword(object.getString("studentPassword"));

        return studentService.addNewStudent(student);
    }

    @PostMapping(value = "/addNewTeacher")
    @ResponseBody
    public Teachers addNewTeacher(@RequestBody JSONObject object) {
        Teachers teacher = new Teachers();

//        System.out.println(object);
        teacher.setTeacherID(object.getString("teacherID"));
        teacher.setTeacherName(object.getString("teacherName"));
        teacher.setTeacherGender(object.getString("teacherGender"));
        teacher.setTeacherCollege(object.getString("teacherCollege"));
        teacher.setTeacherWork(object.getString("teacherWork"));
        teacher.setTeacherTelephone(object.getString("teacherTelephone"));
        teacher.setTeacherEmail(object.getString("teacherEmail"));
        teacher.setTeacherPassword(object.getString("teacherPassword"));

        return teacherService.addNewTeacher(teacher);
    }

    @PostMapping(value = "/addNewCourse")
    @ResponseBody
    public Course addNewCourse(@RequestBody JSONObject object) {
        Course course = new Course();

//        System.out.println(object);
        course.setCourseID(object.getString("courseID"));
        course.setCourseName(object.getString("courseName"));
        course.setCourseScore(object.getByte("courseScore"));

        return courseService.addNewCourse(course);
    }

    @GetMapping(value = "/showAllUsers")
    @ResponseBody
    public ShowInfo getAllUsers() {

        ShowInfo showInfo = new ShowInfo();

        showInfo.setStudentData(studentService.getAllStudents());
        showInfo.setTeacherData(teacherService.getAllTeachers());
        showInfo.setCourseData(courseService.getAllCourses());

        return  showInfo;
    }

    @PostMapping(value = "updateStudent")
    @ResponseBody
    public Students updateStudent(@RequestBody JSONObject object) {
        Students student = new Students();

//        System.out.println(object);
        student.setStudentID(object.getString("studentID"));
        student.setSutdentName(object.getString("sutdentName"));
        student.setStudentGender(object.getString("studentGender"));
        student.setStudentAge(object.getByte("studentAge"));

        student.setStudentBirthday(object.getDate("studentBirthday"));
//        System.out.println(student.getStudentBirthday());

        student.setStudentCollege(object.getString("studentCollege"));
        student.setStudentMajor(object.getString("studentMajor"));
        student.setStudentEmail(object.getString("studentEmail"));
        student.setStudentTelephone(object.getString("studentTelephone"));

        return studentService.updateStudent(student);
    }

    @PostMapping(value = "/updateTeacher")
    @ResponseBody
    public Teachers updateTeacher(@RequestBody JSONObject object) {
        Teachers teacher = new Teachers();

//        System.out.println(object);
        teacher.setTeacherID(object.getString("teacherID"));
        teacher.setTeacherName(object.getString("teacherName"));
        teacher.setTeacherGender(object.getString("teacherGender"));
        teacher.setTeacherCollege(object.getString("teacherCollege"));
        teacher.setTeacherWork(object.getString("teacherWork"));
        teacher.setTeacherTelephone(object.getString("teacherTelephone"));
        teacher.setTeacherEmail(object.getString("teacherEmail"));

        return teacherService.updateTeacher(teacher);
    }

    @PostMapping(value = "/updateCourse")
    @ResponseBody
    public Course updateCourse(@RequestBody JSONObject object) {
        Course course = new Course();

//        System.out.println(object);
        course.setCourseID(object.getString("courseID"));
        course.setCourseName(object.getString("courseName"));
        course.setCourseScore(object.getByte("courseScore"));

        return courseService.updateCourse(course);
    }

    @GetMapping(value = "deleteStudent")
    @ResponseBody
    public void deleteStudent(String index) {
        studentService.deleteOne(index);
//        System.out.println("删除成功");
    }

    @GetMapping(value = "deleteTeacher")
    @ResponseBody
    public void deleteTeacher(String index) {
        teacherService.deleteOne(index);
//        System.out.println("删除成功");
    }

    @GetMapping(value = "deleteCourse")
    @ResponseBody
    public void deleteCourse(String index) {
        courseService.deleteOne(index);
//        System.out.println("删除成功");
    }
}
