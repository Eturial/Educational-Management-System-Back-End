package com.course.server.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ShowInfo {

    private List<Students> studentData;
    private List<Teachers> teacherData;
    private List<Course> courseData;
}
