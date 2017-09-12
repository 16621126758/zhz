package com.oracle.mapper;

import com.oracle.entity.Login;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/4 0004.
 */
@MapperScan
@Component
public interface HospitalMapper {
    Login loginByNameAndPassword(Login record);
    int updatePassword(Login record);

    Login getAll(Login record);
}
