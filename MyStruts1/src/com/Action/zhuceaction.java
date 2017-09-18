package com.Action;

public class zhuceaction {
	public String pwd;
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String name;
	public String id;
	public String hehe(){
		System.out.println("÷¥¡À∫«∫«∑Ω∑®");
	return "success1";	
	}
	public String execute(){
		
		if("123".equals(pwd)&& "123".equals(id) &&"123".equals(name))
		{   
			System.out.println(pwd+name+id);
		}
		return "success1";
		
	}
	


}
