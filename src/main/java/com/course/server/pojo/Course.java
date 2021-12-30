package com.course.server.pojo;

import lombok.Data;

/**
 * 
 * @TableName course
 */
@Data
public class Course {
    /**
     * 课程号
     */
    private String courseID;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 学分
     */
    private Byte courseScore;

}