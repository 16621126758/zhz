package com.oracle.service;

import com.oracle.entity.Myfriend;
import com.oracle.entity.Page;
import com.oracle.mapper.MyfriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@Service
public class MyfriendServiceImpl implements MyfriendService {
    @Autowired
    private MyfriendMapper myfriendMapper;

    @Override
    public List<Myfriend> selectUserList() {
        return myfriendMapper.selectUserList();
    }

    @Override
    public int selectCount() {
        return  myfriendMapper.selectCount();
    }

    @Override
    public Page<Myfriend> findByPage(int currentPage) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Page<Myfriend> pageBean = new Page<Myfriend>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize = 10;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = myfriendMapper.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start", (currentPage - 1) * pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<Myfriend> lists = myfriendMapper.findByPage(map);
        pageBean.setLists(lists);

        return pageBean;
    }
}
