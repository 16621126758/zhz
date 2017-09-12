package com.oracle.entity;

/**
 * Created by Administrator on 2017/8/10.
 */
public class Medicine {
    private int  mid;  //药品 id
    private String mname; //药品名称
    private int mcount;//药品数量
    private String maddress;//药品产地
    private int kid;//药品种类编号

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMcount() {
        return mcount;
    }

    public void setMcount(int mcount) {
        this.mcount = mcount;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }



}
