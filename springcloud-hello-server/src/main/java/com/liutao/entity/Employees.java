package com.liutao.entity;

import java.io.Serializable;

/**
 * (Employees)实体类
 *
 * @author makejava
 * @since 2020-05-07 13:04:35
 */
public class Employees implements Serializable {
    private static final long serialVersionUID = -11976922894871606L;
    
    private Integer empNo;
    
    private Object birthDate;
    
    private String firstName;
    
    private String lastName;
    
    private String gender;
    
    private Object hireDate;


    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Object getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getHireDate() {
        return hireDate;
    }

    public void setHireDate(Object hireDate) {
        this.hireDate = hireDate;
    }

}