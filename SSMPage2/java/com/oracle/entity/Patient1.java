package com.oracle.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Patient1 {
    private String guahao_id;
    private int hospital_id;
    private int  guahao_type;
    private String name;
    private String sex;
    private int age;
    private Date date;
    private int people_id;

    @Override
    public String toString() {
        return "Patient1{" +
                "guahao_id='" + guahao_id + '\'' +
                ", hospital_id=" + hospital_id +
                ", guahao_type=" + guahao_type +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", people_id=" + people_id +
                '}';
    }

    public String getGuahao_id() {
        return guahao_id;
    }

    public void setGuahao_id(String guahao_id) {
        this.guahao_id = guahao_id;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public int getGuahao_type() {
        return guahao_type;
    }

    public void setGuahao_type(int guahao_type) {
        this.guahao_type = guahao_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPeople_id() {
        return people_id;
    }

    public void setPeople_id(int people_id) {
        this.people_id = people_id;
    }
}
