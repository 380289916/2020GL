package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {

        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByUmsMemberId(Integer id) {

        return userMapper.selectAddressByUmsMemberId(id);
    }

    @Override
    public Integer addUser(UmsMember umsMember) {

        return userMapper.insert(umsMember);
    }

    @Override
    public Integer deleteUser(Integer id) {

        Example example = new Example(UmsMember.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", id);

        return userMapper.deleteByExample(example);
    }

}
