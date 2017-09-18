package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Toperator;
import com.util.DBUtil;

public class ToperatorDao {
DBUtil dbu = new DBUtil();
//ÔöÉ¾
public int addToperator(Toperator to){
String sql = "insert into toperator ";
}

public List<Toperator> getAll(){
	String sql = "select * from toperator";
	List<Toperator> list = new ArrayList<Toperator>();
ResultSet rs = dbu.executeQuery(sql);
try {
	while(rs.next()){
		Toperator t = new Toperator();
		t.setOperatorId(rs.getInt("operator_id"));
		t.setOperatorName(rs.getString("operator_name"));
		t.setOperatorPwd(rs.getString("operator_pwd"));
		t.setIsAdmin(rs.getInt("is_admin"));
		list.add(t);
		}
} catch (SQLException e) {

	e.printStackTrace();
}finally{dbu.closeAll();}
	
}








}