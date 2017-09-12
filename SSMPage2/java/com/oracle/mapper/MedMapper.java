package com.oracle.mapper;

import com.oracle.entity.Medicine;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
@MapperScan
@Component
public interface MedMapper {
    List <Medicine> selectmed();
    int deletemed(Integer id);
    int addmed(Medicine medicine);
    @Update("update t_medicine set mname = #{mname},mcount=#{mcount},maddress=#{maddress},kid =#{kid} where mid = #{mid}")
    int updatemed(Medicine medicine);
    List<Medicine> mohuselect(Medicine m );
    @Select("select * from t_medicine")
    List<Medicine> getAllMedicine();


}
