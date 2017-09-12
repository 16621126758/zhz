package com.oracle.mapper;

import com.oracle.entity.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 */
@MapperScan
@Component
public interface EmpMapper {
        @Select("select * from emp")
        List<Emp> SelectEmp();
        @Delete("delete from emp where eid = #{eid}")
        int DelectEmp(int eid);
}
