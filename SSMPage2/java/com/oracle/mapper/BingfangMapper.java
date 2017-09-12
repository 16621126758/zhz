package com.oracle.mapper;

import com.oracle.entity.Patientinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
@MapperScan
@Component
public interface BingfangMapper {
        List<Patientinfo> selectpatientinfo(Patientinfo p);
        @Select("select * from patientinfo where room = 1")
        List<Patientinfo> selectroom();
        @Delete("delete from patientinfo where people_id = #{people_id}")
       int deleteroom(int i);
}
