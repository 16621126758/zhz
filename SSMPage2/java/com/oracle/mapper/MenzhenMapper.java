package com.oracle.mapper;

import com.oracle.entity.Patient1;
import com.oracle.entity.Patientinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */
@MapperScan
@Component
public interface MenzhenMapper {

    List<Patient1> selectAllPatient(Patient1 patient1);
    @Select("select * from patient1 where guahao_id = #{guahao_id}")
    Patient1 selecrtbing(String patient1);
    @Insert("insert into patientinfo (guahao_id, hospital_id,guahao_type,name,sex,age,date,people_id,bingqing,room) VALUES(#{guahao_id},#{hospital_id},#{guahao_type},#{name},#{sex},#{age},#{date},#{people_id},#{bingqing},#{room})")
    int save(Patientinfo patientinfo);
}
