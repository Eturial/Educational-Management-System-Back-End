package com.course.server.pojo;

import lombok.Data;

@Data
public class TeacherChoice {

    private String studentID;

    private String teacherID;

    private String courseID;

    private String grade;

    private Byte courseScore;

    private String courseName;

}
