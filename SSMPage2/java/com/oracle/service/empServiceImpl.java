package com.oracle.service;

import com.oracle.entity.Emp;
import com.oracle.mapper.EmpMapper;
import com.oracle.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 */
@Service
@Component
public class empServiceImpl implements empService {
        @Autowired
        private EmpMapper empMapper;
        @Override
        public List<Emp> SelectEmp() {
                return empMapper.SelectEmp();
        }

        @Override
        public int DeleteEmp(int eid) {
                return empMapper.DelectEmp(eid);
        }

     
}
