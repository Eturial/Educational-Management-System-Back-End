package com.course.server.pojo;

import lombok.Data;

/**
 * 
 * @TableName courseChoice
 */
@Data
public class CourseChoice {
    /**
     * 
     */
    private String studentID;

    /**
     * 
     */
    private String teacherID;

    /**
     * 
     */
    private String courseID;

    /**
     * 
     */
    private String grade;

    /**
     * 
     */
    private Byte courseScore;
}