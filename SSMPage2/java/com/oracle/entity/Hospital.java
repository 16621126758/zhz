package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Hospital {
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEmpolyeeid() {
        return empolyeeid;
    }

    public void setEmpolyeeid(Integer empolyeeid) {
        this.empolyeeid = empolyeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getLimits() {
        return limits;
    }

    public void setLimits(Integer limits) {
        this.limits = limits;
    }

    private Integer  userid;
    private Integer empolyeeid;
    private  String username;
    private Integer password;
    private Integer limits;
}
