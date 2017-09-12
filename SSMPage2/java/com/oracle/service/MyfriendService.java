package com.oracle.service;

import com.oracle.entity.Myfriend;
import com.oracle.entity.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */

public interface MyfriendService {

    List<Myfriend> selectUserList();

    int selectCount();

    Page<Myfriend> findByPage(int currentPage);
}
