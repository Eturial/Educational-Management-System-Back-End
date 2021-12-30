package com.course.server.pojo;

import lombok.Data;

/**
 * 
 * @TableName teachers
 */
@Data
public class Teachers {
    /**
     * 
     */
    private String teacherID;

    /**
     * 
     */
    private String teacherName;

    /**
     * 
     */
    private String teacherGender;

    /**
     * 
     */
    private String teacherCollege;

    /**
     * 
     */
    private String teacherWork;

    /**
     * 
     */
    private String teacherTelephone;

    /**
     * 
     */
    private String teacherEmail;

    /**
     * 
     */
    private String teacherPassword;
}