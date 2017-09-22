package com.oracle;

/**
 * Created by yanliwei on 2017/7/25.
 */
public class HelloWorld {
    private String username;
    private Student stu;

    public String getUsername() {
        return username;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public HelloWorld(){

    }
    public HelloWorld(Student stu) {
        this.stu = stu;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void dayin(){
        System.out.println(stu.getStuname() + "正在使用spring4");
    }
}
