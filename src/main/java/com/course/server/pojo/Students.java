package com.course.server.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 
 * @TableName students
 */
@Data
public class Students {
    /**
     * 
     */
    private String studentID;

    /**
     * 
     */
    private String sutdentName;

    /**
     * 
     */
    private String studentGender;

    /**
     * 
     */
    private String studentCollege;

    /**
     * 
     */
    private String studentMajor;

    /**
     * 
     */
    private Byte studentAge;

    /**
     * 
     */
    private String studentTelephone;

    /**
     * 
     */
    private String studentEmail;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date studentBirthday;

    /**
     *
     */
    private String studentPassword;

    private String grade;

    private byte times;
}