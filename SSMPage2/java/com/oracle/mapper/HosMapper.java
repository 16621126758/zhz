package com.oracle.mapper;

import com.oracle.entity.Hospital;
import com.oracle.entity.Patient1;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/8.
 */
@MapperScan
@Component
public interface HosMapper {

    Hospital selectbyname(Hospital record);
    int addpeople(Hospital record);
    int update(Hospital record);
    List<Hospital> getAll();
    int guahao(Patient1 record);
    List <Hospital> selectList();
    List<Patient1> select();
    int deleteByPrimaryKey(Integer id);
    int updateByPrimaryKey(Patient1 record);
    @Update("update hospitaluser set password = #{password} where username = #{username}")
    int gaimima(Hospital hospital);
}
