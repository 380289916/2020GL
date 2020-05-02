package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {


    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMemberReceiveAddress> getAddressByUmsMemberId(Integer memberId) {

        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("memberId", memberId);

        return umsMemberReceiveAddressMapper.selectByExample(example);
    }


    @Override
    public Integer removeUmsAddress(Integer id) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", id);
        return umsMemberReceiveAddressMapper.deleteByExample(example);

    }

}
