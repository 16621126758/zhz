package com.oracle.service;

import com.oracle.entity.Emp;
import com.oracle.mapper.EmpMapper;
import com.sun.java.accessibility.util.EventID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 */

public interface empService {
       List<Emp> SelectEmp();
       int DeleteEmp(int eid);
        
}
