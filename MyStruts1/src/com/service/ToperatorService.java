package com.service;

import java.util.List;

import com.dao.ToperatorDao;
import com.pojo.Toperator;




public class ToperatorService {
	
	private ToperatorDao td = new ToperatorDao();
	public List<Toperator> getAll(){
		
		return td.getAll;
		
	}

}
