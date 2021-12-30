package com.course.server.pojo;

import lombok.Data;

@Data
public class StudentLogin {

    private String studentID;

    private String studentPassword;

    private String teacherID;

    private String teacherPassword;
}
