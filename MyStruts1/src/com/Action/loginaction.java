package com.Action;

import java.util.List;

import com.pojo.Toperator;
import com.service.ToperatorService;

public class loginaction {
	public List<Toperator> getList() {
		return list;
	}
	public void setList(List<Toperator> list) {
		this.list = list;
	}
	private List<Toperator> list;
	private  String user;
	private Toperator to;
	public String come(){
		System.out.println(to.getOperatorName());
		return "success";
	}
	public Toperator getTo() {
		return to;
	}
	public void setTo(Toperator to) {
		this.to = to;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd;
	public String execute(){
		
		
		System.out.println("执行了execute方法");
		if("admin".equals(user)&&"admin".equals(pwd)){
			
			
			return "success";
		}
		else{
			
			return "fault";
		}
		
	}
	public String getAll(){
		ToperatorService ts = new  ToperatorService();
		list =ts.getAll();
		return "success";
		
		
		
	}
	
	
	

}
